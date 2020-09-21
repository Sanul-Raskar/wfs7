package com.example.pack;

/*
 * Lab Exercise 24

	Create a class called shape with the following methods
		1.	area
		2.	perimeter

	Overload the area and perimeter method to calculate for both square and rectangle.
	Create a main class and invoke the area method to calculate the area of the square and 
	rectangle. Also invoke the perimeter method to calculate the perimeter of the square 
	and rectangle.
 * Created by Sanul Raskar
 * 
 * */

public class Shape {

	// Calculates square area
	// Method with single input argument to calculate area.
	private void area(double side) {
		System.out.println("Area of square with side " + side + " is: " + Math.pow(side, 2));
	}

	// Calculates rectangle area
	// Method with two input argument to calculate area.
	private void area(double length, double breadth) {
		System.out.println(
				"Area of rectangle with length " + length + " and breadth " + breadth + " is: " + length * breadth);
	}

	// Calculates square perimeter
	// Method with one input argument to calculate perimeter.
	private void perimeter(double side) {
		System.out.println("Perimeter of square with side " + side + " is: " + 4 * side);
	}

	// Calculates rectangle perimeter
	// Method with two input argument to calculate perimeter.
	private void perimeter(double length, double breadth) {
		double perimeter = 2 * (length + breadth);
		System.out.println("Area of rectangle with length " + length + " and breadth " + breadth + " is: " + perimeter);
	}

	public static void main(String[] args) {

		// Create new Shape object
		Shape obj = new Shape();

		// Calculate square area
		obj.area(5);

		// Calculate rectangle area
		obj.area(3.2, 4.5);

		// Calculate perimeter of square
		obj.perimeter(5);

		// Calculate perimeter of rectangle
		obj.perimeter(3, 4.6);

	}

}
