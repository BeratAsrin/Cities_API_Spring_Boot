package com.cities_api.cities_api.controllers;

import com.cities_api.cities_api.entities.models.City;
import com.cities_api.cities_api.entities.models.Country;
import com.cities_api.cities_api.entities.res.CitiesRes;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CityController {

    // TODO MONGODB CONNECTION

    @GetMapping("/country/get_cities/{countryName}")
    public CitiesRes getCitiesOfCountryByName(@PathVariable("countryName") String countryName){
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("istanbul"));
        cities.add(new City("ankara"));
        CitiesRes res = new CitiesRes(cities, new Country(countryName));
        return res;
    }

    @GetMapping("/country/get_country_information/{countryName}")
    public Country getCountryByName(@PathVariable String countryName){
        return new Country(countryName);
    }

    @GetMapping("/city/{cityName}")
    public City getCityByName(@PathVariable("cityName") String cityName){
        return new City("istanbul", 23542312, 30, 40);
    }

}
