package com.example.pack;

/*
 * Lab Exercise 15
 * 
 * 
 * 
 * 
 * Created by Sanul Raskar
 * 
 * */


public class Sample {

	static int objCount = 0;

	public Sample() {
		objCount++;
	}

	public static void main(String[] args) {
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = new Sample();

		System.out.println("Total object created: " + objCount);

	}

}
