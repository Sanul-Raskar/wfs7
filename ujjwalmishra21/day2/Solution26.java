package com.hsbc.day2;

/*
		 	Create a class called Calculator which has 4 different methods add, diff, mul and div which 
		accepts two numbers as parameters. Overload the methods such that the parameters can be 
		of the following pattern.
		1.	Both are of int data type.
		2.	Both are of double data type.
		3.	First parameter is of int data type and second parameter is of double data type.
		4.	First parameter is of double data type and second parameter is of int data type.
		                  Create anobject to access these methods and invoke these methods with different type of
		numbers and display the result in the corresponding methods. 

 */

public class Solution26 {

	public static void main(String[] args) {
		
		ModernCalculator modernCalculator = new ModernCalculator();
		
		System.out.println("Addition::");
		modernCalculator.add(12L, 21L);
		modernCalculator.add(12L, 34.23);
		modernCalculator.add(45.12, 34L);
		modernCalculator.add(23.45, 21.90);
		
		System.out.println();
		System.out.println("Difference::");
		modernCalculator.diff(56L, 67L);
		modernCalculator.diff(21L, 2.34);
		modernCalculator.diff(34.13, 11L);
		modernCalculator.diff(23.11, 9.79);
		
		System.out.println();
		System.out.println("Multiplication::");
		modernCalculator.mult(12L, 78L);
		modernCalculator.mult(23.12, 11L);
		modernCalculator.mult(8L, 3.33);
		modernCalculator.mult(9.32, 3.21);
		
		System.out.println();
		System.out.println("Division::");
		modernCalculator.div(34L, 3L);
		modernCalculator.div(124L, 13.9);
		modernCalculator.div(24.9, 13L);
		modernCalculator.div(8.7, 9.34);
		

	}

}

class ModernCalculator extends Calculator{
	public void add(double firstNumber, double secondNumber) {
		double sum = firstNumber + secondNumber;
		System.out.println(firstNumber + " + " + secondNumber +" = " + sum);
	}
	public void diff(double firstNumber, double secondNumber) {
		double difference = firstNumber - secondNumber;
		System.out.println(firstNumber + " - " + secondNumber +" = " + difference);
	}
	public void mult(double firstNumber, double secondNumber) {
		double product = firstNumber * secondNumber;
		System.out.println(firstNumber + " * " + secondNumber +" = " + product);
	}
	public void div(double firstNumber, double secondNumber) {
		double division = firstNumber / secondNumber;
		System.out.println(firstNumber + " / " + secondNumber +" = " + division);
	}
	
	public void add(double firstNumber, long secondNumber) {
		double sum = firstNumber + secondNumber;
		System.out.println(firstNumber + " + " + secondNumber +" = " + sum);
	}
	public void diff(double firstNumber, long secondNumber) {
		double difference = firstNumber - secondNumber;
		System.out.println(firstNumber + " - " + secondNumber +" = " + difference);
	}
	public void mult(double firstNumber, long secondNumber) {
		double product = firstNumber * secondNumber;
		System.out.println(firstNumber + " * " + secondNumber +" = " + product);
	}
	public void div(double firstNumber, long secondNumber) {
		double division = firstNumber / (double)secondNumber;
		System.out.println(firstNumber + " / " + secondNumber +" = " + division);
	}
	
	public void add(long firstNumber, double secondNumber) {
		double sum = firstNumber + secondNumber;
		System.out.println(firstNumber + " + " + secondNumber +" = " + sum);
	}
	public void diff(long firstNumber, double secondNumber) {
		double difference = firstNumber - secondNumber;
		System.out.println(firstNumber + " - " + secondNumber +" = " + difference);
	}
	public void mult(long firstNumber, double secondNumber) {
		double product = firstNumber * secondNumber;
		System.out.println(firstNumber + " * " + secondNumber +" = " + product);
	}
	public void div(long firstNumber, double secondNumber) {
		double division = firstNumber / (double)secondNumber;
		System.out.println(firstNumber + " / " + secondNumber +" = " + division);
	}
}
