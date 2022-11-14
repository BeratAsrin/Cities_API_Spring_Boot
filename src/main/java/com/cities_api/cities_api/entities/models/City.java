package com.cities_api.cities_api.entities.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class City {

    @NonNull
    private String name;

    private int population;

}
