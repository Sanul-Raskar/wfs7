package com.example.pack;

/*
 * Lab Exercise 43
	Create a class called Shape3D with the following method signatures alone, volume () and 
	surfaceArea (). Then create subclasses like Cylinder, Sphere, and Cube etc and implement 
	these methods. Implement using Interfaces

	Created By: Sanul Raskar
 * */

//Interface of Shape3D
interface IShape3D {
	void volume();

	void surfaceArea();
}

//Class CubeImplementation will implement all the methods declared in IShape3D interface
class CubeImplementaion implements IShape3D {

	private double side;

	public CubeImplementaion() {
		super();
		this.side = 0;
	}

	public CubeImplementaion(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	// Implemented volume method from interface IShape3D to calculate volume of cube
	@Override
	public void volume() {
		System.out.println("Cube Volume: " + Math.pow(this.side, 3));
	}

	// Implemented surfaceArea method from interface IShape3D to calculate surface
	// area of cube
	@Override
	public void surfaceArea() {
		System.out.println("Cube Volume: " + (6 * Math.pow(this.side, 2)));
	}

}

//Class SphereImplementaion will implement all the methods declared in IShape3D interface
class SphereImplementaion implements IShape3D {

	private double radius;

	public SphereImplementaion() {
		super();
		this.radius = 0;
	}

	public SphereImplementaion(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Implemented volume method from interface IShape3D to calculate volume of
	// sphere
	@Override
	public void volume() {
		System.out.println("Shpere Volume: " + (4.0 / 3.0) * Math.PI * Math.pow(this.radius, 3));
	}

	// Implemented surfaceArea method from interface IShape3D to calculate surface
	// area of sphere
	@Override
	public void surfaceArea() {
		System.out.println("Shpere Surface Area: " + (4.0 * Math.PI * Math.pow(this.radius, 2)));
	}

}

//Class CylinderImplementaion will implement all the methods declared in IShape3D interface
class CylinderImplementaion implements IShape3D {

	private double radius;
	private double height;

	public CylinderImplementaion() {
		super();
		this.radius = 0;
		this.height = 0;
	}

	public CylinderImplementaion(double radius, double height) {
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

	// Implemented volume method from interface IShape3D to calculate volume of
	// cylinder
	@Override
	public void volume() {
		System.out.println("Cylinder Volume: " + (Math.PI * this.height * Math.pow(this.radius, 2)));
	}

	// Implemented surfaceArea method from interface IShape3D to calculate surface
	// area of cylinder
	@Override
	public void surfaceArea() {
		System.out.println("Cylinder Surface Area: "
				+ (2.0 * Math.PI * this.radius * this.height + 2.0 * Math.PI * Math.pow(this.radius, 2)));
	}
}

public class ShapeInterface {

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
