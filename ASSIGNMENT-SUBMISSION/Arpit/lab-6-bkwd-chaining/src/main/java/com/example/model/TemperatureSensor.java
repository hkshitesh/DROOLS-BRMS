package com.example.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.kie.api.definition.type.PropertyReactive;

@Getter
@Setter
@ToString
@Builder
public class TemperatureSensor {
    private final String sensorId;
    private final double temperature;
}
