package com.example.demo.nationalize;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public record Nationality(long count, String name, @SerializedName("country") List<Country> countries) {
    public record Country(String countryId, float probability) {}
}
