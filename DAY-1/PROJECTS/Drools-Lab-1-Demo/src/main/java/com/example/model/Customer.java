package com.example.model;

public class Customer {
	private String name;
	private String membership;
	private int discount;
	
	public Customer(String name, String membership)
	{
		this.name= name;
		this.membership=membership;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMembership() {
		return membership;
	}
	public void setMembership(String membership) {
		this.membership = membership;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() 
	{
		return "Customer{name='"+name+"', membership='"+membership+"',discount= "+discount+"}";
	}

}
