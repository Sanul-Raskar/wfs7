package com.hsbc.day3;

/*
 	Program showing usage of interfaces to compute 
 	volume and total surface area of Cylinder, Sphere & Cube
 */
public class Solution43 {

	public static void main(String[] args) {
		Shape3DNew cylinder = new CylinderNew(5,9);
		
		System.out.println("Volume of Cylinder: " + cylinder.volume() + " cc unit");
		System.out.println("Total Surface Area of Cylinder: " + cylinder.totalSurfaceArea() +" sq unit");
		System.out.println();
		
		Shape3DNew sphere = new SphereNew(4);
		System.out.println("Volume of Sphere: " + sphere.volume() + " cc unit");
		System.out.println("Total Surface Area of Sphere: " + sphere.totalSurfaceArea() +" sq unit");
		System.out.println();
		
		Shape3DNew cube = new CubeNew(6);
		System.out.println("Volume of Cube: " + cube.volume() + " cc unit");
		System.out.println("Total Surface Area of Cube: " + cube.totalSurfaceArea() + " sq unit");

	}

}

// Interface defining the volume() & totalSurfaceArea()
interface Shape3DNew{
	static final double PI = 3.14159;
	public double volume();
	public double totalSurfaceArea();
}

// Cylinder implementation of interface
class CylinderNew implements Shape3DNew{
	private int height;
	private int radius;
	
	public CylinderNew(int height, int radius) {
		super();
		this.height = height;
		this.radius = radius;
	}

	@Override
	public double volume() {
		return PI * Math.pow(this.radius, 2) * this.height;
	}

	@Override
	public double totalSurfaceArea() {
		return 2 * PI * (this.radius) * (this.radius + this.height);
	}
	
}

//Sphere implementation of interface
class SphereNew implements Shape3DNew{
	private int radius;

	public SphereNew(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double volume() {
		return (4/3) * PI * Math.pow(this.radius, 3);
	}

	@Override
	public double totalSurfaceArea() {
		return 4 * PI * Math.pow(this.radius, 2);
	}
	
}

//Cube implementation of interface
class CubeNew implements Shape3DNew{
	private int side;

	public CubeNew(int side) {
		super();
		this.side = side;
	}

	@Override
	public double volume() {
		return Math.pow(this.side, 3);
	}

	@Override
	public double totalSurfaceArea() {
		return 6 * Math.pow(this.side, 2);
	}
	
}