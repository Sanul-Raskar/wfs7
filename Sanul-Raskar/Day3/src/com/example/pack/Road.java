package com.example.pack;

/*
 * Lab Exercise 34
 * Create a class called Vehicle. Create subclasses like Truck, Bus, Car etc. Add common methods 
 * in the base class and specific methods in the corresponding class. Create a class called Road 
 * and create objects for the Truck, Car, Bus etc and display the appropriate message.  
 *  
 *  Lab Exercise 35
 *  In the Lab Exercise 34, in the Vehicle class constructor initialize few variables like color, no of 
	wheels, model etc. Give appropriate values for these variables from the invoking subclass.  
	
	Lab Exercise 36
	In the Lab Exercise 35, create another class called City which creates an object for the Car, 
	Truck and Bus class and displays the details through a display () method in the Vehicle class. 
	The other methods and data members should not be accessible by the City class.

	
 *  Created by Sanul Raskar
 * 
 * */

//Vehicle is Super Class
class Vehicle {
	private String color;
	private int wheels;
	private String model;

	// Default Constructor
	public Vehicle() {
		System.out.println("Vehicle default constructor");
	}

	// Parameterized constructor
	public Vehicle(String color, int wheels, String model) {
		this.color = color;
		this.wheels = wheels;
		this.model = model;
		System.out.println("Vehicle parameterized constructor");
	}

	protected void move() {
		System.out.println("Vehicle is moving");
	}

	protected void display() {
		System.out.println("Vehicle [color=" + color + ", wheels=" + wheels + ", model=" + model + "]");
	}
}

//Bus is subclass of Vehicle
class Bus extends Vehicle {

	public Bus(String color, int wheel, String busModel) {
		super(color, wheel, busModel);
		System.out.println("Bus parameterized Constructor");
	}

	public Bus() {
		super("NA", 0, "NA");
		System.out.println("Bus default Constructor");
	}

	// Add new feature in Bus with existing features from Vehicle
	protected void busMethod() {
		System.out.println("New feature in Bus class");
	}

}

//Truck is subclass of Vehicle
class Truck extends Vehicle {
	public Truck(String color, int wheel, String truckModel) {
		super(color, wheel, truckModel);
		System.out.println("Truck parameterized Constructor");
	}

	public Truck() {
		super("NA", 0, "NA");
		System.out.println("Truck default Constructor");
	}

	// Add new feature in Truck with existing features from Vehicle
	protected void truckMethod() {
		System.out.println("New feature in Truck class");
	}

}

class City {
	public void cityMethod() {
		Bus bus = new Bus("Orange", 6, "MyNewBus");
		bus.display();
		System.out.println();
		Truck truck = new Truck("Grey", 8, "MyNewTruck");
		truck.display();

	}
}

public class Road {

	public static void main(String[] args) {

		// Create a new object of class Bus
		Bus busObj = new Bus("Red", 6, "MyBUS");
		// Invoke busMethod() defined in Bus Class
		busObj.busMethod();
		// Invoke move() defined in superclass Vehicle by using subclass Bus object
		busObj.move();
		// Display object
		busObj.display();
		System.out.println();

		// Create a new object of class Truck
		Truck truckObj = new Truck("Black", 8, "myTruck");
		// Invoke truckMethod() defined in Bus Class
		truckObj.truckMethod();
		// Invoke move() defined in superclass Vehicle by using subclass Truck object
		truckObj.move();
		// Display object
		truckObj.display();
		System.out.println();

		// For problem 36
		// City object to create objects of bus and truck and display all details
		City city = new City();
		city.cityMethod();
	}

}

/*
Vehicle parameterized constructor
Bus parameterized Constructor
New feature in Bus class
Vehicle is moving
Vehicle [color=Red, wheels=6, model=MyBUS]

Vehicle parameterized constructor
Truck parameterized Constructor
New feature in Truck class
Vehicle is moving
Vehicle [color=Black, wheels=8, model=myTruck]

Vehicle parameterized constructor
Bus parameterized Constructor
Vehicle [color=Orange, wheels=6, model=MyNewBus]

Vehicle parameterized constructor
Truck parameterized Constructor
Vehicle [color=Grey, wheels=8, model=MyNewTruck]
 */
