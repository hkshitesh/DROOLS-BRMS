package com.example.model;

public class Order {
    private String id;
    private double totalAmount;
    private boolean valid;

    public Order(String id, double totalAmount) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.valid = false;
    }
  
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}


	public boolean isValid() {
		return valid;
	}


	public void setValid(boolean valid) {
		this.valid = valid;
	}


	@Override
    public String toString() {
        return "Order{id='" + id + "', totalAmount=" + totalAmount + ", valid=" + valid + '}';
    }
}
