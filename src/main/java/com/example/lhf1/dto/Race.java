package com.example.lhf1.dto;

import java.util.List;

import lombok.Data;

@Data
public class Race {
    private String season;
    private String round;
    private String raceName;
    private String date;
    private String time;
    private Circuit circuit;
    private List<Result> results;
}