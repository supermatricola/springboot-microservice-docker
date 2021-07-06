package com.corsetti.mservicedemo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/test-docker")
    public String getData(){
        return "Docker SpringBoot demo microservice works!";
    }

}
