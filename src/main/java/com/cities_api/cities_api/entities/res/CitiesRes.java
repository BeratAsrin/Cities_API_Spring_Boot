package com.cities_api.cities_api.entities.res;

import com.cities_api.cities_api.entities.models.City;
import com.cities_api.cities_api.entities.models.Country;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class CitiesRes {
    private ArrayList<City> cities;
    private Country country;
}
