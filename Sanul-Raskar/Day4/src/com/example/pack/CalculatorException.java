package com.example.pack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorException {

	// Take two input integer number and return the sum
	protected int add(int num1, int num2) {
		return num1 + num2;
	}

	// Take two input integer number and return the difference
	protected int subtract(int num1, int num2) {
		return num1 - num2;
	}

	// Take two input integer number and return the multiplication
	protected int multiply(int num1, int num2) {
		return num1 * num2;
	}

	// Take two input integer number and return the division by type-casting
	// denominator to double
	protected double division(int num1, int num2) {
		double result = 0;

		try {
			result = (double) num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("You Shouldn't divide a number by zero");
			result = 0;
		}

		return result;
	}

	public static void main(String[] args) {
		// Initialize two integers
		int number1 = 0, number2 = 0;
		// Variables to store results returned from methods
		int addResult, subResult, mulResult;
		double divResult;

		boolean validInput = false;
		Scanner in = new Scanner(System.in);

		// Run this loop till user enters valid input
		while (!validInput) {
			try {
				System.out.println("Enter number 1:");
				number1 = in.nextInt();
				// if valid value then break the loop using this flag
				validInput = true;
			} catch (InputMismatchException e) {
				// Print exception if user enters value other than integer
				System.out.println("Please enter interger value");
			}
			in.nextLine();
		}

		validInput = false;
		// Run this loop till user enters valid input
		while (!validInput) {
			try {
				System.out.print("Enter number 2:");
				number2 = in.nextInt();
				validInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Please enter interger value");
			}
			in.nextLine();
		}

		// Close the scanner object
		in.close();

		// Create new object of calculator
		CalculatorException calObj = new CalculatorException();

		System.out.println();
		// Addition of number1 and number2
		addResult = calObj.add(number1, number2);
		System.out.println("Addition of two numbers: " + addResult);

		// Subtraction of number1 and number2
		subResult = calObj.subtract(number1, number2);
		System.out.println("Subtraction of two numbers: " + subResult);

		// Multiplication of number1 and number2
		mulResult = calObj.multiply(number1, number2);
		System.out.println("Multiplication of two numbers: " + mulResult);

		// Division of number1 and number2
		divResult = calObj.division(number1, number2);
		System.out.println("Division of two numbers: " + divResult);

	}

}
