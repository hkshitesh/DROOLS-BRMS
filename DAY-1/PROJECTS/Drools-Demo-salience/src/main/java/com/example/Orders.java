package com.example;

public class Orders {
	
	private String customerType;
	private double totalAmount;
	
	public Orders(String customerType, double totalAmount){		
		this.customerType = customerType;
		this.totalAmount = totalAmount;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	@Override
	public String toString() {
	    return "Order{customertype='" + customerType + "', totalAmount=" + totalAmount + '}';
		
	}
}
