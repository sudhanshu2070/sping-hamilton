package com.example.lhf1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lhf1.dto.Race;
import com.example.lhf1.service.ErgastService;


@RestController
@RequestMapping("/api/races")
public class RaceController {
    
    @Autowired
    private ErgastService ergastService;

    // Get all 2020 races (JSON)
    @GetMapping
    public List<Race> getAllRaces() {
        return ergastService.get2020Races();
    }

    // Get specific race details (JSON)
    @GetMapping("/{round}")
    public Race getRaceDetails(@PathVariable String round) {
        return ergastService.getRaceDetails(round);
    }
}