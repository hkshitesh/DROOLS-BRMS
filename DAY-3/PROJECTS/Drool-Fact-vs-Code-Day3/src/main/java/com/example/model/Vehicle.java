package com.example.model;

public class Vehicle {
    private String id;
    private int mileage;
    private String status;

    public Vehicle(String id, int mileage, String status) {
        this.id = id;
        this.mileage = mileage;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id='" + id + '\'' +
                ", mileage=" + mileage +
                ", status='" + status + '\'' +
                '}';
    }
}
