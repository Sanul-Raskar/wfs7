package com.hsbc.day2;

/*
 Create a class called shape with the following methods
1.	area
2.	perimeter

    Overload the area and perimeter method to calculate for both square and rectangle.
    Create a main class and invoke the area method to calculate the area of the square and 
rectangle. Also invoke the perimeter method to calculate the perimeter of the square 
and rectangle.

 */
public class Solution24 {

	public static void main(String[] args) {
		
		Shape rectangle = new Shape();
		
		System.out.println("Area of Reactangle: " + rectangle.area(3,4));
		System.out.println("Perimeter of Rectangle: " + rectangle.perimeter(3, 4));
		
		Shape square = new Shape();
		
		System.out.println("Area of Square: " + square.area(5));
		System.out.println("Perimeter of Square: " + square.perimeter(5));
	}

}

class Shape{
	
	//Area of square
	public int area(int length) {
		return length*length;
	}
	
	//Area of rectangle
	public int area(int length, int breadth) {
		return length*breadth;
	}
	
	//Perimeter of square
	public int perimeter(int length) {
		return 4*length;
	}
	
	//Perimeter of rectangle
	public int perimeter(int length, int breadth) {
		return 2*(length + breadth);
	}
	
	
}
