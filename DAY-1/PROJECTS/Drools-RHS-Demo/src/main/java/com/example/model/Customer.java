package com.example.model;

public class Customer {
	
	private String name;
	private int loyaltyPoints;
	private String membership;
	
	
	public Customer(String name, int loyaltyPoints, String membership) {
		super();
		this.name = name;
		this.loyaltyPoints = loyaltyPoints;
		this.membership = membership;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getLoyaltyPoints() {
		return loyaltyPoints;
	}


	public void setLoyaltyPoints(int loyaltyPoints) {
		this.loyaltyPoints = loyaltyPoints;
	}


	public String getMembership() {
		return membership;
	}


	public void setMembership(String membership) {
		this.membership = membership;
	}

	@Override
	public String toString() {
	    return "Customer{name='" + name + "', lolaltyPoints=" + loyaltyPoints + ", membership=" + membership + '}';
	}
}
