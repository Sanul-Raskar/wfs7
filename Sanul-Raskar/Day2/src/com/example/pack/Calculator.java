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

	private int add(int num1, int num2) {
		return num1 + num2;
	}

	private int subtract(int num1, int num2) {
		return num1 - num2;
	}

	private int multiply(int num1, int num2) {
		return num1 * num2;
	}

	private float division(int num1, int num2) {
		return num1 / (float) num2;
	}

	public static void main(String[] args) {
		//Initialize two integers
		int number1 = 3, number2 = 7;
		//Variables to store results returned from methods
		int addResult, subResult, mulResult;
		float divResult;

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
