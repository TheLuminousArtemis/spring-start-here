package com.ch10_ex4.ch10_ex4.controllers;

import com.ch10_ex4.ch10_ex4.models.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
    @GetMapping("/france")
    public ResponseEntity<Country> france(){
        var country = Country.of("france",1000);
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .header("continent", "Europe")
                .header("capital", "Paris")
                .header("favorite_food", "cheese and wine")
                .body(country);
    }
}
