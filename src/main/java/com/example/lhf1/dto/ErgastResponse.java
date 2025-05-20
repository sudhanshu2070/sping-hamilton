package com.example.lhf1.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ErgastResponse {
    @JsonProperty("MRData")
    private MRData mrData;
}