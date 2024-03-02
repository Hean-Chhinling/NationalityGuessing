package com.example.demo.nationalize;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.GsonBuilder;
import feign.Feign;
import feign.Param;
import feign.RequestLine;
import feign.gson.GsonDecoder;

public interface NationalizeClient {

    @RequestLine("GET /?name={name}")
    Nationality getNationality(@Param("name") String name);

    static NationalizeClient newInstance() {
        return Feign.builder()
                .decoder(new GsonDecoder(new GsonBuilder()
                        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                        .create()))
                .target(NationalizeClient.class, "https://api.nationalize.io/");
    }

}
