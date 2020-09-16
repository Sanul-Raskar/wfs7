package com.hsbc.day2;

public class Solution14 {
	
	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		calculator.add(21, 13);
		calculator.diff(34, 56);
		calculator.mult(21, 17);
		calculator.div(473,23);
	}
}
/*
 * Calculator class contains:
 * add(a,b) - prints sum of a and b (a+b)
 * diff(a,b) - prints subtraction of a and b (a-b)
 * mult(a,b) - prints multiplcation of a and b (a-b)
 * div(a,b) - prints division a by b (a/b)
 */
class Calculator{
	public void add(long firstNumber, long secondNumber) {
		long sum = firstNumber + secondNumber;
		System.out.println(firstNumber + " + " + secondNumber +" = " + sum);
	}
	public void diff(long firstNumber, long secondNumber) {
		long difference = firstNumber - secondNumber;
		System.out.println(firstNumber + " - " + secondNumber +" = " + difference);
	}
	public void mult(long firstNumber, long secondNumber) {
		long product = firstNumber * secondNumber;
		System.out.println(firstNumber + " * " + secondNumber +" = " + product);
	}
	public void div(long firstNumber, long secondNumber) {
		double division = firstNumber / (double)secondNumber;
		System.out.println(firstNumber + " / " + secondNumber +" = " + division);
	}
}