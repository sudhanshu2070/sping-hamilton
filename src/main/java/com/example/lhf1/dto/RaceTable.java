package com.example.lhf1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;

@Data
public class RaceTable {
    @JsonProperty("Races")
    private List<Race> races;
}