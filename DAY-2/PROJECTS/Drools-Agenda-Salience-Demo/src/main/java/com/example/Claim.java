package com.example;

public class Claim {
	
	private String id;
    private double amount;
    private boolean Valid;
    private boolean Assessed;
    private boolean Approved;
	public Claim(String id, double amount) {
		super();
		this.id = id;
		this.amount = amount;
		this.Valid = false;
		this.Assessed=false;
		this.Approved=false;				
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public boolean isValid() {
		return Valid;
	}
	public void setValid(boolean valid) {
		Valid = valid;
	}
	public boolean isAssessed() {
		return Assessed;
	}
	public void setAssessed(boolean assessed) {
		Assessed = assessed;
	}
	public boolean isApproved() {
		return Approved;
	}
	public void setApproved(boolean approved) {
		Approved = approved;
	}


}
