package com.example.model;

public class Order {
    private String id;
    private double totalAmount;
    private boolean processed;

    public Order(String id, double totalAmount) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.processed = false;
    }

    public String getId() {
        return id;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }

    @Override
    public String toString() {
        return "Order{id='" + id + "', totalAmount=" + totalAmount + ", processed=" + processed + '}';
    }
}
