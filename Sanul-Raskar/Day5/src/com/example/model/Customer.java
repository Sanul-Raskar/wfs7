package com.example.model;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 4965183320418830424L;
	private String customerName;
	private Address address;

	public Customer() {
		super();
		this.customerName = "";
	}

	public Customer(String customerName, Address address) {
		super();
		this.customerName = customerName;
		this.address = address;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", address=" + address + "]";
	}

}
