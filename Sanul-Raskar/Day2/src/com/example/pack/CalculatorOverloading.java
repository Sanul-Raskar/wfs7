package com.example.pack;

import java.text.DecimalFormat;

/*
 * Lab Exercise 26
 * 
 * A calculator class with 4 methods for operation like add, subtract, multiply and division. They all accept 
 * two input parameter and returns computed result. CalculatorOverloading class inherits Calculator class. 
 * Methods to accepts two integers have been implemented in Calculator class. Methods to accepts two parameters
 *  like (double,double) (int,double) and (double,int) are implemented in this class using method overloading.
 * 
 * Created by Sanul Raskar
 * 
 * */

public class CalculatorOverloading extends Calculator {

	// To print double data type upto two decimal points
	private static DecimalFormat df2 = new DecimalFormat("#.##");

	// Method implementations of add,subtract,multiply and division using two
	// input parameters(different/same data types) and returns the result

	private double add(double num1, double num2) {
		return num1 + num2;
	}

	private double subtract(double num1, double num2) {
		return num1 - num2;
	}

	private double multiply(double num1, double num2) {
		return num1 * num2;
	}

	private double division(double num1, double num2) {
		double result = 0;

		// add exception handling to check division by zero
		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("You Shouldn't divide a number by zero");
		}

		return result;
	}

	private double add(int num1, double num2) {
		return (double) num1 + num2;
	}

	private double subtract(int num1, double num2) {
		return (double) num1 - num2;
	}

	private double multiply(int num1, double num2) {
		return (double) num1 * num2;
	}

	private double division(int num1, double num2) {
		double result = 0;

		// add exception handling to check division by zero
		try {
			result = (double) num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("You Shouldn't divide a number by zero");
		}

		return result;
	}

	private double add(double num1, int num2) {
		return num1 + (double) num2;
	}

	private double subtract(double num1, int num2) {
		return num1 - (double) num2;
	}

	private double multiply(double num1, int num2) {
		return num1 * (double) num2;
	}

	private double division(double num1, int num2) {
		double result = 0;

		try {
			result = num1 / (double) num2;
		} catch (ArithmeticException e) {
			System.out.println("You Shouldn't divide a number by zero");
		}

		return result;
	}

	public static void main(String[] args) {

		// Initialize the variables to give as input to calculator operations
		int number1 = 6, number2 = 4;
		double number3 = 6.4, number4 = 3.8;

		// Create CalculatorOverloading object
		CalculatorOverloading obj = new CalculatorOverloading();

		// Print the results
		// Addition by passing different data types
		
		
		System.out.println("Addition of " + number1 + " and " + number2 + ": " + df2.format(obj.add(number1, number2)));
		System.out.println("Addition of " + number3 + " and " + number4 + ": " + df2.format(obj.add(number3, number4)));
		System.out.println("Addition of " + number1 + " and " + number3 + ": " + df2.format(obj.add(number1, number3)));
		System.out.println("Addition of " + number4 + " and " + number2 + ": " + df2.format(obj.add(number4, number2)));

		// Subtraction by passing different data types
		System.out.println("Subtraction of " + number1 + " and " + number2 + ": " + df2.format(obj.subtract(number1, number2)));
		System.out.println("Subtraction of " + number3 + " and " + number4 + ": " + df2.format(obj.subtract(number3, number4)));
		System.out.println("Subtraction of " + number1 + " and " + number3 + ": " + df2.format(obj.subtract(number1, number3)));
		System.out.println("Subtraction of " + number4 + " and " + number2 + ": " + df2.format(obj.subtract(number4, number2)));

		// Multiplication by passing different data types
		System.out.println("Multiplication of " + number1 + " and " + number2 + ": " + df2.format(obj.multiply(number1, number2)));
		System.out.println("Multiplication of " + number3 + " and " + number4 + ": " + df2.format(obj.multiply(number3, number4)));
		System.out.println("Multiplication of " + number1 + " and " + number3 + ": " + df2.format(obj.multiply(number1, number3)));
		System.out.println("Multiplication of " + number4 + " and " + number2 + ": " + df2.format(obj.multiply(number4, number2)));

		// Division by passing different data types
		System.out.println("Division of " + number1 + " and " + number2 + ": " + df2.format(obj.division(number1, number2)));
		System.out.println("Division of " + number3 + " and " + number4 + ": " + df2.format(obj.division(number3, number4)));
		System.out.println("Division of " + number1 + " and " + number3 + ": " + df2.format(obj.division(number1, number3)));
		System.out.println("Division of " + number4 + " and " + number2 + ": " + df2.format(obj.division(number4, number2)));

	}

}



/*
 * Output:
Addition of 6 and 4: 10
Addition of 6.4 and 3.8: 10.2
Addition of 6 and 6.4: 12.4
Addition of 3.8 and 4: 7.8
Subtraction of 6 and 4: 2
Subtraction of 6.4 and 3.8: 2.6
Subtraction of 6 and 6.4: -0.4
Subtraction of 3.8 and 4: -0.2
Multiplication of 6 and 4: 24
Multiplication of 6.4 and 3.8: 24.32
Multiplication of 6 and 6.4: 38.4
Multiplication of 3.8 and 4: 15.2
Division of 6 and 4: 1.5
Division of 6.4 and 3.8: 1.68
Division of 6 and 6.4: 0.94
Division of 3.8 and 4: 0.95
 * */
