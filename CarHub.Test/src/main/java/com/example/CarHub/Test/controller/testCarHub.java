package com.example.CarHub.Test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testCarHub {

    @GetMapping("test")
    String health() {
        return "initialize CarHuz app .. ";
    }
}
