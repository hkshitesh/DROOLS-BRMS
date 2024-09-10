package com.example;

public class Customer {
	
	private String name;
	private boolean Notified;
	public Customer(String name) {		
		this.name = name;
		Notified = false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isNotified() {
		return Notified;
	}
	public void setNotified(boolean notified) {
		Notified = notified;
	}
	

}
