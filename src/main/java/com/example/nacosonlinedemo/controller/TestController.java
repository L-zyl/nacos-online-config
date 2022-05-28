package com.example.nacosonlinedemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.value}")
    public String value;

    @GetMapping("/get")
    public String getConfig() {
        return value;
    }
}
