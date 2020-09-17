package com.example.pack;

/*
 * Lab Exercise 28
 * 
 * A calculator class with methods add and subtract which accepts variable arguments as input. 
 * We can provide any number of integers as input arguments to these methods
 * 
 * Created by Sanul Raskar
 * 
 * */

public class CalculatorVarArgs {

	// Variable Arguments have been passed. So the values passed to method add are
	// stored in num array
	private int add(int... num) {
		int result = 0;
		for (int i = 0; i < num.length; i++) {
			result += num[i];
		}
		return result;
	}

	// Variable Arguments have been passed. So the values passed to method subtract
	// are stored in num array
	private int subtract(int... num) {
		int result = num[0];

		for (int i = 1; i < num.length; i++) {
			result -= num[i];
		}
		return result;
	}

	private int multiply(int num1, int num2) {
		return num1 * num2;
	}

	private double division(int num1, int num2) {
		return num1 / (double) num2;
	}

	public static void main(String[] args) {

		// Object of class CalculatorVarArgs created
		CalculatorVarArgs obj = new CalculatorVarArgs();

		// add method called with different number of input arguments and printed the
		// result
		System.out.println("Addition with two input numbers: " + obj.add(1, 2));
		System.out.println("Addition with three input numbers: " + obj.add(1, 2, 3));

		// subtract method called with different number of input arguments and printed
		// the result
		System.out.println("Subtraction with two input numbers: " + obj.subtract(12, 5));
		System.out.println("Subtraction with three input numbers: " + obj.subtract(14, 2, 3));

		System.out.println("Multiplication with two input numbers: " + obj.multiply(4, 2));
		System.out.println("Division with two input numbers: " + obj.division(6, 3));
	}

}
