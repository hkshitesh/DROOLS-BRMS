package com.example;

public class TemperatureSensor {
    private String sensorId;
    private double temperature;

    // Constructor
    public TemperatureSensor(String sensorId, double temperature) {
        this.sensorId = sensorId;
        this.temperature = temperature;
    }

    // Getters and Setters
    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
