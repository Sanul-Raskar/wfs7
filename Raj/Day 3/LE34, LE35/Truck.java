package com.vechicle;

public class Truck extends Vechile {
	private int noofseats;
	private String permit;

	public Truck(String regNo, String brand, String color, int noofwheels, int noofseats, String permit) {
		super(regNo, brand, color, noofwheels);
		this.noofseats = noofseats;
		this.permit = permit;
	}

	int getNoofseats() {
		return noofseats;
	}

	void setNoofseats(int noofseats) {
		this.noofseats = noofseats;
	}

	String getPermit() {
		return permit;
	}

	void setPermit(String permit) {
		this.permit = permit;
	}

	void speed() {
		System.out.println("Speed is : 60kmph");
	}

	void mileage() {
		System.out.println("Mileage is : 28kmph");
	}

	public void display() {
		super.display();
		System.out.println(getNoofseats());
		System.out.println(getPermit());

	}
}
