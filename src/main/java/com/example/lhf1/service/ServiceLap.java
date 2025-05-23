package com.example.lhf1.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceLap {
    public String getLapTime() {
        return "Hello from Lewis 👋, the Lap time: 1:30.123";
    }
    public String getLapTime2() {
        return "Lap time: 1:30.123 - This is the second lap time from ServiceLap.";
    }
}
