package com.ch10_ex2.ch10_ex2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello!";
    }

    @GetMapping("/ciao")
    public String ciao(){
        return "Ciao!";
    }
}
