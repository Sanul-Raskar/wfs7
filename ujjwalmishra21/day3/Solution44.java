package com.hsbc.day3;

	/*
		Create two interfaces namely Drawable and Fillable. Create class called Line, Circle, Square and
		implement following methods through interface.
		
		<I>Drawable ------ drawingColor(), thickness()
		<I>Fillable ---------- fillingColor(), size()
	 */


public class Solution44 {
	
	// Using Drawable & Fillable references to call class objects
	public static void main(String[] args) {
		
		System.out.println("Drawable & Fillable references with Line object:");
		Drawable drawable = new Line();
		Fillable fillable = new Line();
		
//		((Line) lineD).fillingColor();
		drawable.drawingColor();
		drawable.thickness();
		fillable.fillingColor();
		fillable.size();
		System.out.println();
		
		System.out.println("Drawable & Fillable references with Circle object:");
		drawable = new Circle();
		fillable = new Circle();
		
		drawable.drawingColor();
		drawable.thickness();
		fillable.fillingColor();
		fillable.size();
		System.out.println();
		
		System.out.println("Drawable & Fillable references with Square object:");
		drawable = new Square();
		fillable = new Square();
		
		drawable.drawingColor();
		drawable.thickness();
		fillable.fillingColor();
		fillable.size();	
		System.out.println();

	}

}


interface Drawable {
	public void drawingColor();
	public void thickness();
}

interface Fillable {
	public void fillingColor();
	public void size();
}

// Line implements all methods of Drawable, Fillable interface
class Line implements Drawable, Fillable {

	@Override
	public void fillingColor() {
		System.out.println("Inside fillingColor() of Line");		
	}

	@Override
	public void size() {
		System.out.println("Inside size() of Line");
	}

	@Override
	public void drawingColor() {
		System.out.println("Inside drawingColor() of Line");
	}

	@Override
	public void thickness() {
		System.out.println("Inside thickness() of Line");		
	}
	
}

//Circle implements all methods of  Drawable, Fillable interface
class Circle implements Drawable, Fillable {

	@Override
	public void fillingColor() {
		System.out.println("Inside fillingColor() of Circle");		
	}

	@Override
	public void size() {
		System.out.println("Inside size() of Circle");
	}

	@Override
	public void drawingColor() {
		System.out.println("Inside drawingColor() of Circle");
	}

	@Override
	public void thickness() {
		System.out.println("Inside thickness() of Circle");		
	}
	
}
//Square implements all methods of  Drawable, Fillable interface
class Square implements Drawable, Fillable {

	@Override
	public void fillingColor() {
		System.out.println("Inside fillingColor() of Square");		
	}

	@Override
	public void size() {
		System.out.println("Inside size() of Square");
	}

	@Override
	public void drawingColor() {
		System.out.println("Inside drawingColor() of Square");
	}

	@Override
	public void thickness() {
		System.out.println("Inside thickness() of Square");		
	}
	
}


