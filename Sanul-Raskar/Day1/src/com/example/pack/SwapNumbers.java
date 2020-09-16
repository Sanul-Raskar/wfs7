package com.example.pack;

/*
 * Lab Exercise 5
 * This program is to swap two integer numbers without using temp variable
 * 
 * Created by Sanul Raskar
 * 
 * */

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {

		// Create object of Scanner class to take input
		Scanner scan = new Scanner(System.in);

		// Ask user to enter first integer in console
		System.out.println("Enter first number: ");
		// Read the integer from console
		int number1 = scan.nextInt();

		// Ask user to enter second integer in console
		System.out.println("Enter second number: ");
		// Read the integer from console
		int number2 = scan.nextInt();

		// Closing Scanner
		scan.close();

		// Print variables before swapping
		System.out.println("Numbers before swapping: Number1: " + number1 + " Number2: " + number2);

		// Swap numbers
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;

		// Print variables after swapping
		System.out.println("Numbers after swapping: Number1: " + number1 + " Number2: " + number2);

	}

}
