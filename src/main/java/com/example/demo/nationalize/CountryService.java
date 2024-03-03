package com.example.demo.nationalize;

import jakarta.annotation.PostConstruct;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;


@Service
public class CountryService {

    private Map<String, String> countryCodeMap;

    @PostConstruct
    public void init() {
        Resource resource = new ClassPathResource("country-codes.json");
        ObjectMapper mapper = new ObjectMapper();
        try {
            countryCodeMap = mapper.readValue(resource.getInputStream(), new TypeReference<>() {});
        } catch (IOException e) {
            throw new RuntimeException("Could not load country codes", e);
        }
    }

    public String getCountryName(String code) {
        return countryCodeMap.getOrDefault(code, "Unknown Country");
    }
}
