package com.example;

public class Customer {
	
	private String name;
    private int loyaltyYears;
    private boolean Eligible;
	public Customer(String name, int loyaltyYears) {
		super();
		this.name = name;
		this.loyaltyYears = loyaltyYears;
		this.Eligible=false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLoyaltyYears() {
		return loyaltyYears;
	}
	public void setLoyaltyYears(int loyaltyYears) {
		this.loyaltyYears = loyaltyYears;
	}
	public boolean isEligible() {
		return Eligible;
	}
	public void setEligible(boolean eligible) {
		Eligible = eligible;
	}
    
    


}
