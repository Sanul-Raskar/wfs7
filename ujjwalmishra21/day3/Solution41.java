package com.hsbc.day3;
/*
 	Program showing usage of abstract classes in order to 
 	compute  volume and total surface area of cylinder, sphere
 	and cube
 */
public class Solution41 {

	public static void main(String[] args) {
		
		Shape3D shape = new Cylinder(5,9);
		
		System.out.println("Volume of Cylinder: " + shape.volume() + " cc unit");
		System.out.println("Total Surface Area of Cylinder: " + shape.totalSurfaceArea() +" sq unit");
		System.out.println();
		
		shape = new Sphere(4);
		System.out.println("Volume of Sphere: " + shape.volume() + " cc unit");
		System.out.println("Total Surface Area of Sphere: " + shape.totalSurfaceArea() +" sq unit");
		System.out.println();
		
		shape = new Cube(6);
		System.out.println("Volume of Cube: " + shape.volume() + " cc unit");
		System.out.println("Total Surface Area of Cube: " + shape.totalSurfaceArea() + " sq unit");
		

	}

}

/*
 	Interface containing declaration of volume(),
 	totalSurfaceArea() and PI constant
 */
abstract class Shape3D{
	protected static final double PI = 3.14159;
	public abstract double volume();
	public abstract double totalSurfaceArea();
}
/*
  	Cylinder:
  		Volume = PI*r*r*h
 		Total Surface Area = 2*PI*r*(r + h)
 	
 	Sphere:
 		Volume = (4/3)*PI*r*r*r
 		Total Surface Area = 4*PI*r*r
 		
 	Cube:
 		Volume = side*side*side
 		Total Surface Area = 6*side*side
 		
 */
class Cylinder extends Shape3D{
	private int height;
	private int radius;
	
	public Cylinder(int height, int radius) {
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

class Sphere extends Shape3D{
	private int radius;

	public Sphere(int radius) {
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

class Cube extends Shape3D{
	private int side;

	public Cube(int side) {
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
