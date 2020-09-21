package com.example.model;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 8289385328439598701L;
	private String productName;
	private int productPrice;

	public Product() {
		super();
		this.productName = "";
		this.productPrice = 0;
	}

	public Product(String productName, int productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productPrice=" + productPrice + "]";
	}

}
