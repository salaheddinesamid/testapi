package com.example.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/new-feature")
public class Controller {


    @GetMapping("")
    public String get(){
        return "Hello this is the new feature";
    }


    @GetMapping("test")
    public String test(){
        return "test";
    }
}
