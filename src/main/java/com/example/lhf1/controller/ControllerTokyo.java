package com.example.lhf1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lhf1.service.ServiceLap;

@RestController
public class ControllerTokyo {
    
    @Autowired
    private ServiceLap serviceLap;

    @GetMapping("/")
    public String sayHello() {
        return serviceLap.getLapTime();
    }
}
