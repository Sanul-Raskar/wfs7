package com.example.pack;

/*
 * Lab Exercise 44
	Create two interfaces namely Drawable and Fillable. Create class called Line, Circle, Square and
	implement following methods through interface.
	<I>Drawable ------ drawingColor(), thickness()
	<I>Fillable ---------- fillingColor(), size()

	Created By: Sanul Raskar
 * */

//Interface Drawable with methods drawingColor and thickness
interface Drawable {
	void drawingColor();

	void thickness();
}

//Interface Fillable with methods fillingColor and size
interface Fillable {
	void fillingColor();

	void size();
}

//Line implements both the interfaces Drawable and Fillable
//Line class has implemented all the methods from both interfaces
class Line implements Drawable, Fillable {

	@Override
	public void fillingColor() {
		System.out.println("Line Class filling color method");
	}

	@Override
	public void size() {
		System.out.println("Line Class size method");
	}

	@Override
	public void drawingColor() {
		System.out.println("Line Class drawing color method");
	}

	@Override
	public void thickness() {
		System.out.println("Line Class thickness method");
	}

}

//Circle implements both the interfaces Drawable and Fillable
//Circle class has implemented all the methods from both interfaces
class Circle implements Drawable, Fillable {

	@Override
	public void fillingColor() {
		System.out.println("Circle Class filling color method");
	}

	@Override
	public void size() {
		System.out.println("Circle Class size method");
	}

	@Override
	public void drawingColor() {
		System.out.println("Circle Class drawing color method");
	}

	@Override
	public void thickness() {
		System.out.println("Circle Class thickness method");
	}

}

//Square implements both the interfaces Drawable and Fillable
//Square class has implemented all the methods from both interfaces
class Square implements Drawable, Fillable {

	@Override
	public void fillingColor() {
		System.out.println("Square Class filling color method");
	}

	@Override
	public void size() {
		System.out.println("Square Class size method");
	}

	@Override
	public void drawingColor() {
		System.out.println("Square Class drawing color method");
	}

	@Override
	public void thickness() {
		System.out.println("Square Class thickness method");
	}

}

public class Draw {

	public static void main(String[] args) {
		// Create Line object and invoke all it's class methods
		Line line = new Line();
		line.drawingColor();
		line.fillingColor();
		line.thickness();
		line.size();

		System.out.println();

		// Create Circle object and invoke all it's class methods
		Circle circle = new Circle();
		circle.drawingColor();
		circle.fillingColor();
		circle.thickness();
		circle.size();

		System.out.println();

		// Create Square object and invoke all it's class methods
		Square square = new Square();
		square.drawingColor();
		square.fillingColor();
		square.thickness();
		square.size();

	}

}
