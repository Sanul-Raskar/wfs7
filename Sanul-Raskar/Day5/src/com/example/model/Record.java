package com.example.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Record implements Comparable<Record>, Serializable {

	private static final long serialVersionUID = -7138485731048789908L;
	private Customer cust;
	private ArrayList<Product> prod;

	public Record(Customer cust, ArrayList<Product> prod) {
		super();
		this.cust = cust;
		this.prod = prod;
	}

	private int getTotalPrice() {
		int result = 0;
		for (int i = 0; i < this.prod.size(); i++) {
			result = result + this.prod.get(i).getProductPrice();
		}
		
		return result;
	}

	@Override
	public int compareTo(Record o) {
		return o.getTotalPrice() - this.getTotalPrice();
	}

	@Override
	public String toString() {
		return "Record [cust=" + cust + ", prod=" + prod + "]";
	}

}
