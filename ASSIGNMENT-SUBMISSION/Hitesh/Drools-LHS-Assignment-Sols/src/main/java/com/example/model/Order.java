package com.example.model;

public class Order {
    private String customerType;
    private double orderAmount;
    private String productCategory;
    private boolean isProcessed;

    public Order(String customerType, double orderAmount, String productCategory) {
        this.customerType = customerType;
        this.orderAmount = orderAmount;
        this.productCategory = productCategory;
        this.isProcessed = false;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public boolean isProcessed() {
        return isProcessed;
    }

    public void setProcessed(boolean isProcessed) {
        this.isProcessed = isProcessed;
    }

    @Override
    public String toString() {
        return "Order [customerType=" + customerType + ", orderAmount=" + orderAmount + 
               ", productCategory=" + productCategory + ", isProcessed=" + isProcessed + "]";
    }
}

