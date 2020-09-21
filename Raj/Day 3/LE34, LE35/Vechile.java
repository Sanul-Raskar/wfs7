package com.vechicle;

public class Vechile {
	private String regNo;
	private String brand;
	private String color;
	private int noofwheels;

	public Vechile() {
		super();
		this.regNo = "BH01AX4567";
		this.brand = "Tata";
		this.color = "Black";
		this.noofwheels = 4;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	int getNoofwheels() {
		return noofwheels;
	}

	void setNoofwheels(int noofwheels) {
		this.noofwheels = noofwheels;
	}

	public Vechile(String regNo, String brand, String color, int noofwheels) {
		super();
		this.regNo = regNo;
		this.brand = brand;
		this.color = color;
		this.noofwheels = noofwheels;
	}

	String getRegNo() {
		return regNo;
	}

	void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	void speed() {
		System.out.println("Speed is : 78kmph");
	}

	void mileage() {
		System.out.println("Mileage is : 19kmph");
	}

	public void display() {
		System.out.println(getBrand());
		System.out.println(getColor());
		System.out.println(getNoofwheels());
		System.out.println(getRegNo());
	}
}
