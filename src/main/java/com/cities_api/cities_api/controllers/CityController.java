package com.cities_api.cities_api.controllers;

import com.cities_api.cities_api.entities.models.City;
import com.cities_api.cities_api.entities.models.Country;
import com.cities_api.cities_api.entities.res.CitiesRes;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CityController {

    @GetMapping("/country_name/{countryName}")
    public CitiesRes getCitiesOfCountry(@PathVariable("countryName") String countryName){
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("istanbul", 23542312));
        cities.add(new City("ankara", 1403005));
        CitiesRes res = new CitiesRes(cities, new Country(countryName));
        return res;
    }

}
