package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers {


    @GetMapping("/")
    public String HelloWorld(){
        return "Hello world";
    }

}
