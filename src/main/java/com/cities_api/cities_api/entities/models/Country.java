package com.cities_api.cities_api.entities.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Country {
    @NonNull
    private String name;

    private ArrayList<String> cityNames;

    private int population;
}
