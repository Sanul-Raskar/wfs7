package com.hsbc.day2;
/*
 * Program counts the number of
 * objects created
 */
public class Solution15 {

	public static void main(String[] args) {
		new Sample();
		new Sample();
		new Sample();
		System.out.println("Objects Count: " + Sample.getObjectCount());
		new Sample();
		new Sample();
		new Sample();
		new Sample();
		new Sample();
		new Sample();
		System.out.println("Objects Count: " + Sample.getObjectCount());
	}

}

class Sample {
	private static int objectsCount = 0;
	
	public Sample() {
		objectsCount++;
	}
	
	public static int getObjectCount() {
		return objectsCount;
	}
	
}
