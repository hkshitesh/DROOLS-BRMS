package com.example.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class SmokeSensor {
    private final String sensorId;
    private final double smokeLevel;
}
