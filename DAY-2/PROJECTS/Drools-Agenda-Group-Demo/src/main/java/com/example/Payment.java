package com.example;

public class Payment {
	
	private String orderId;
	private boolean Paid;
	public Payment(String orderId) {		
		this.orderId = orderId;
		Paid = false;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public boolean isPaid() {
		return Paid;
	}
	public void setPaid(boolean paid) {
		Paid = paid;
	}
	

}
