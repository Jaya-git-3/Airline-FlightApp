package com.flightapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class samplecontroller {

    @GetMapping("/sample")
    public String s() {
        return "Hello world";

    }
}
