package com.example.pack;

/*
 * Lab Exercise 20
 * 
 * 
 * 
 * Created by Sanul Raskar
 * 
 * */

public class ArrayAverage {

	private static void calculateAverage(int arr[]) {
		double total = 0, average = 0;

		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}

		System.out.println("Sum: " + total);

		average = total / arr.length;

		System.out.println("Average: " + average);

	}

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		calculateAverage(array);

	}

}
