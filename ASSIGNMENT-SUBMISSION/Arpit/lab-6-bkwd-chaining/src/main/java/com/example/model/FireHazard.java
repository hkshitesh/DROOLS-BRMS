package com.example.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class FireHazard {
    private final String temperatureSensorId;
    private final String smokeSensorId;
}
