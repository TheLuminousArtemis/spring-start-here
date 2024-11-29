package com.ch10_ex3.ch10_ex3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ch10_ex3.ch10_ex3.models.Country;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/france")
    public Country france(){
        Country c = Country.of("France", 67);
        return c;
    }

    @GetMapping("/all")
    public List<Country> all(){
        var c1 = Country.of("France", 67);
        var c2 = Country.of("Spain", 31);
        return List.of(c1, c2);
    }
}
