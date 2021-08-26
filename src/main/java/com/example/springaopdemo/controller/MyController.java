package com.example.springaopdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/hello")
    public String sayHelloTo(@RequestParam String name) {
        System.out.println("Say hello to " + name);
        return "Hi," + name;
    }
}
