package com.bulut.condition.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/test")
@RestController
public class TestController {

    @Autowired
    private RestTemplate template;

    @GetMapping
    public String getTest() {
        return template.getForObject("http://testUrl.com", String.class);
    }
}
