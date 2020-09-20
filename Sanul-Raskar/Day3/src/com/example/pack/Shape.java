package com.example.pack;

/*
 * Lab Exercise 41
	Create a class called Shape3D with the following method signatures alone, volume () and 
	surfaceArea (). Then create subclasses like Cylinder, Sphere, and Cube etc and implement 
	these methods.

	Created By: Sanul Raskar
 * */

abstract class Shape3D {
	abstract void volume();

	abstract void surfaceArea();
}

class Cube extends Shape3D {
	private double side;

	public Cube() {
		super();
		this.side = 0;
	}

	public Cube(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	// Implemented volume method from Shape3D to calculate volume of cube
	@Override
	void volume() {
		System.out.println("Cube Volume: " + Math.pow(this.side, 3));
	}

	// Implemented surfaceArea method from Shape3D to calculate surface area of cube
	@Override
	void surfaceArea() {
		System.out.println("Cube Volume: " + (6 * Math.pow(this.side, 2)));
	}

}

class Sphere extends Shape3D {

	private double radius;

	public Sphere() {
		super();
		this.radius = 0;
	}

	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Implemented volume method from Shape3D to calculate volume of sphere
	@Override
	void volume() {
		System.out.println("Shpere Volume: " + (4.0 / 3.0) * Math.PI * Math.pow(this.radius, 3));
	}

	// Implemented surfaceArea method from Shape3D to calculate surface area of
	// sphere
	@Override
	void surfaceArea() {
		System.out.println("Shpere Surface Area: " + (4.0 * Math.PI * Math.pow(this.radius, 2)));
	}

}

class Cylinder extends Shape3D {
	private double radius;
	private double height;

	public Cylinder() {
		super();
		this.radius = 0;
		this.height = 0;
	}

	public Cylinder(double radius, double height) {
		super();
		this.radius = radius;
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// Implemented volume method from Shape3D to calculate volume of cylinder
	@Override
	void volume() {
		System.out.println("Cylinder Volume: " + (Math.PI * this.height * Math.pow(this.radius, 2)));
	}

	// Implemented surfaceArea method from Shape3D to calculate surface area of
	// cylinder
	@Override
	void surfaceArea() {
		System.out.println("Cylinder Surface Area: "
				+ (2.0 * Math.PI * this.radius * this.height + 2.0 * Math.PI * Math.pow(this.radius, 2)));
	}

}

public class Shape {

	public static void main(String[] args) {

		// Create Cube object
		Cube cube = new Cube(5.2);
		// Calculate surface area of cube
		cube.surfaceArea();
		// Calculate volume of cube
		cube.volume();

		System.out.println();

		// Create sphere object
		Sphere sphere = new Sphere(8);
		// Calculate surface area of sphere
		sphere.surfaceArea();
		// Calculate volume of sphere
		sphere.volume();

		System.out.println();

		// Create Cylinder object
		Cylinder cylinder = new Cylinder(4, 5);
		// Calculate surface area of Cylinder
		cylinder.surfaceArea();
		// Calculate volume of Cylinder
		cylinder.volume();

		System.out.println();

	}
}
