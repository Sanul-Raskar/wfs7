package com.example.pack;

/*
 * Lab Exercise 27
 * 
 * Write a class called Computer such that the object of that class should be created only when 
 * the class is loaded
 * 
 * Created by Sanul Raskar
 * 
 * */

public class Computer {
	// Static block is executed only once when the class is loaded into memory
	static {
		System.out.println("Class loaded.....");
		//Create new Computer class object
		Computer comObj = new Computer();
		System.out.println("Object Created");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
	}

}
