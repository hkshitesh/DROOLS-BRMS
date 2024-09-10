package com.example.model;

public class Order {

	private Product product;
	private int quantity;
	private double totalPrice;
	private boolean discountApplied;
	
		
	public Order(Product product, int quantity) 
	{
		super();
		this.product = product;
		this.quantity = quantity;
		this.totalPrice = product.getPrice()*quantity;
		this.discountApplied = false;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
		this.totalPrice= product.getPrice()*quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}



	public boolean isDiscountApplied() {
		return discountApplied;
	}

	public void setDiscountApplied(boolean discountApplied) {
		this.discountApplied = discountApplied;
	}


	@Override
	public String toString() {
		return "Order [product=" + product + ", quantity=" + quantity + ", totalPrice=" + totalPrice
				+ ", discountApplied=" + discountApplied + "]";
	}
	
	
	


}
