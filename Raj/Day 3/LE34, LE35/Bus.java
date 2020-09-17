package com.vechicle;

public class Bus extends Vechile {
	private String service;
	private String type;

	public Bus(String regNo, String brand, String color, int noofwheels, String service, String type) {
		super(regNo, brand, color, noofwheels);
		this.service = service;
		this.type = type;
	}

	String getService() {
		return service;
	}

	void setService(String service) {
		this.service = service;
	}

	String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}

	void speed() {
		System.out.println("Speed is : 70kmph");
	}

	void mileage() {
		System.out.println("Mileage is : 38kmph");
	}

	public void display() {
		super.display();
		System.out.println(getService());
		System.out.println(getType());
	}
}
