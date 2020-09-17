package com.example.pack;

/*
 * Lab Exercise 15
 * 
 * Create a class called Sample. Write a program to display the no of objects created for that 
 * class or the no of times that class is instantiated
 * 
 * Created by Sanul Raskar
 * 
 * */


public class Sample {

	//static variable
	static int objCount = 0;

	//default constructor
	public Sample() {
		//increase static count whenever new object is created
		objCount++;
	}

	public static void main(String[] args) {
		//Create three new objects of class Sample
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = new Sample();

		//Print the value static variable which holds the count of number of objects created
		System.out.println("Total object created: " + objCount);

	}

}
