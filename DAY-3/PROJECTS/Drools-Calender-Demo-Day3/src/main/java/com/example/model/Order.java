package com.example.model;

public class Order {
    private String id;
    private boolean processed;

    public Order(String id) {
        this.id = id;
        this.processed = false;
    }

    public String getId() {
        return id;
    }

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }

    @Override
    public String toString() {
        return "Order{id='" + id + "', processed=" + processed + '}';
    }
}
