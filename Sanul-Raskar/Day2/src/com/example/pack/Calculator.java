package com.example.pack;

/*
 * Lab Exercise 14
 * 
 * A calculator class with 4 methods for operation like add, subtract, multiply and division. They all accept 
 * two input parameter and returns computed result.
 * 
 * 
 * Created by Sanul Raskar
 * 
 * */

public class Calculator {

	//Take two input integer number and return the sum
	protected int add(int num1, int num2) {
		return num1 + num2;
	}

	//Take two input integer number and return the difference
	protected int subtract(int num1, int num2) {
		return num1 - num2;
	}

	//Take two input integer number and return the multiplication
	protected int multiply(int num1, int num2) {
		return num1 * num2;
	}

	//Take two input integer number and return the division by type-casting denominator to double
	protected double division(int num1, int num2) {
		return num1 / (double) num2;
	}

	public static void main(String[] args) {
		//Initialize two integers
		int number1 = 7, number2 = 3;
		//Variables to store results returned from methods
		int addResult, subResult, mulResult;
		double divResult;

		//Create new object of calculator
		Calculator calObj = new Calculator();

		//Addition of number1 and number2
		addResult = calObj.add(number1, number2);
		System.out.println("Addition of two numbers: " + addResult);

		//Subtraction of number1 and number2
		subResult = calObj.subtract(number1, number2);
		System.out.println("Subtraction of two numbers: " + subResult);

		//Multiplication of number1 and number2
		mulResult = calObj.multiply(number1, number2);
		System.out.println("Multiplication of two numbers: " + mulResult);

		//Division of number1 and number2
		divResult = calObj.division(number1, number2);
		System.out.println("Division of two numbers: " + divResult);

	}

}
