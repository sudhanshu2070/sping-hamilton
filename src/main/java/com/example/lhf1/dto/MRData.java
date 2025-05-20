package com.example.lhf1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MRData {
    @JsonProperty("RaceTable")
    private RaceTable raceTable;
}