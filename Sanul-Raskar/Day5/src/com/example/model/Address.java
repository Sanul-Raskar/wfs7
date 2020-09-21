package com.example.model;

import java.io.Serializable;

public class Address implements Serializable {

	private static final long serialVersionUID = 77072375773031122L;
	private String city;
	private String state;

	public Address() {
		super();
		this.city = "";
		this.state = "";
	}

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}

}
