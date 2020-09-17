package com.example.pack;

/*
 * Lab Exercise 20
 * 
 * Program to display the sum and the average of elements in the array.
 * 
 * Created by Sanul Raskar
 * 
 * */

public class ArrayAverage {

	private static void calculateAverage(int arr[]) {
		//Initialize variables
		double total = 0, average = 0;

		//Calculate sum by iterating through array elements and add them
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}

		System.out.println("Sum: " + total);

		//Calculate average by dividing total by number of elements in array
		average = total / arr.length;

		System.out.println("Average: " + average);

	}

	public static void main(String[] args) {
		//Create new array
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		
		calculateAverage(array);

	}

}
