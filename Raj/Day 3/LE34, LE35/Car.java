package com.vechicle;

public class Car extends Vechile {
	private int noofseat;
	private String property;

	public Car(String regNo, String brand, String color, int noofwheels, int noofseat, String property) {
		super(regNo, brand, color, noofwheels);
		this.noofseat = noofseat;
		this.property = property;
	}

	int getNoofseat() {
		return noofseat;
	}

	void setNoofseat(int noofseat) {
		this.noofseat = noofseat;
	}

	String getProperty() {
		return property;
	}

	void setProperty(String property) {
		this.property = property;
	}

	void speed() {
		System.out.println("Speed is : 110kmph");
	}

	void mileage() {
		System.out.println("Mileage is : 20kmph");
	}

	public void display() {
		super.display();
		System.out.println(getNoofseat());
		System.out.println(getProperty());
	}
}
