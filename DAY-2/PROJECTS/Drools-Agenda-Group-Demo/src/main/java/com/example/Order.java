package com.example;

public class Order {
	
	private String id;
	private double totalAmount;
	private boolean Valid;
	private boolean processed;
	public Order(String id, double totalAmount) {
		
		this.id = id;
		this.totalAmount = totalAmount;
		this.Valid = false;
		this.processed = false;
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
		return Valid;
	}
	public void setValid(boolean valid) {
		Valid = valid;
	}
	public boolean isProcessed() {
		return processed;
	}
	public void setProcessed(boolean processed) {
		this.processed = processed;
	}
	
	

}
