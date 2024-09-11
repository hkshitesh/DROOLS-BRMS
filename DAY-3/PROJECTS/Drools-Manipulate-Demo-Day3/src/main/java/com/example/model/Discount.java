package com.example.model;

public class Discount {
    private String orderId;
    private double discountAmount;

    public Discount(String orderId, double discountAmount) {
        this.orderId = orderId;
        this.discountAmount = discountAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    @Override
    public String toString() {
        return "Discount{orderId='" + orderId + "', discountAmount=" + discountAmount + '}';
    }
}
