package com.hsbc.day3;

	/*
		 Create a class called Vehicle. Create subclasses like Truck, Bus, Car etc. Add common methods 
		in the base class and specific methods in the corresponding class. Create a class called Road 
		and create objects for the Truck, Car, Bus etc and display the appropriate message. 
		
	 */
public class Road {

	public static void main(String[] args) {
		//Using Vehicle class reference with Vehicle object
		Vehicle vehicle = new Vehicle();
		vehicle.move();
		vehicle.display();
		System.out.println();
		
		//Using Vehicle class reference with Truck object
		vehicle = new Truck(8,"TATA Harrier", "Black");
		vehicle.move();
		vehicle.display();
		System.out.println();
		
		//Using Vehicle class reference with Car object
		vehicle = new Car(4,"Mercedes M Class","Gray");
		vehicle.move();
		vehicle.display();
		System.out.println();
		
		//Using Vehicle class reference with Bus object
		vehicle = new Bus(6,"Volvo XYZ","White");
		vehicle.move();	
		vehicle.display();
		System.out.println();
		
		//Using Truck reference with Truck object
        Truck truck = new Truck(12,"Kia Stringer","Red");
        truck.move();
        truck.display();
        System.out.println();
        
        //Using Car reference with Car object
        Car car = new Car(4,"Land Rover Discover","Red");
        car.move();
        car.display();
        System.out.println();
        
        //Using Bus reference with Bus object
        Bus bus = new Bus(10,"TATA Ghost","Green");
        bus.move();		
        bus.display();
        System.out.println();
        
        System.out.println("Using City class");
        City city = new City(truck, car, bus);
        city.displayVehicle();
        
	}

}

class City{
	private Vehicle vehicle1;
	private Vehicle vehicle2;
	private Vehicle vehicle3;
	
	public City(Vehicle vehicle1, Vehicle vehicle2, Vehicle vehicle3) {
		this.vehicle1 = vehicle1;
		this.vehicle2 = vehicle2;
		this.vehicle3 = vehicle3;
	}
	
	public void displayVehicle() {
		this.vehicle1.display();
		this.vehicle2.display();
		this.vehicle3.display();
	}
}


class Vehicle{
	protected int wheels;
	protected String model;
	protected String color;
	
	public Vehicle() {
		super();
		this.wheels = 0;
		this.model = "Not Applicable";
		this.color = "Not Applicable";
	}
	
	public Vehicle(int wheels, String model, String color) {
		this.wheels = wheels;
		this.model = model;
		this.color = color;
	}
	
	public void move() {
		System.out.println("This is Vehicle class");
	}
		
	public void display() {
		System.out.println("Vehicle [wheels=" + wheels + ", model=" + model + ", color=" + color + "]");
	}
	
}

class Truck extends Vehicle{
	
	public Truck() {}
	
	public Truck(int wheels, String model, String color) {
		super(wheels, model, color);
	}
	
	@Override
	public void move() {
		System.out.println("This is Truck class");
	}
}

class Car extends Vehicle{
	
	public Car() {}
	
	public Car(int wheels, String model, String color) {
		super(wheels, model, color);
	}
	
	@Override
	public void move() {
		System.out.println("This is Car class");
	}
}

class Bus extends Vehicle{
	
	public Bus() {}
	
	public Bus(int wheels, String model, String color) {
		super(wheels, model, color);
	}
	
	@Override
	public void move() {
		System.out.println("This is Bus class");
	}
}
