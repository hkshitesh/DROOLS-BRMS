package com.example.model;

public class Product {
	
	private String type;
	private int price;
	private boolean available;
	
	public Product(String type, int price, boolean available)
	{
		this.type = type;
		this.price= price;
		this.available=available;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	@Override
	public String toString() {
	    return "Product{type='" + type + "', price=" + price + ", available=" + available + '}';
	}

}
