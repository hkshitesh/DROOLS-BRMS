package com.example.model;

public class Customer {
    private String name;
    private double purchaseAmount;
    
    // Constructors, getters, and setters
    public Customer(String name, double purchaseAmount) {
        this.name = name;
        this.purchaseAmount = purchaseAmount;
    }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public double getPurchaseAmount() { return purchaseAmount; }
    public void setPurchaseAmount(double purchaseAmount) { this.purchaseAmount = purchaseAmount; }
}
