package com.hsbc.assignments;
/*
Program to swap long numbers
with using additional variable
*/
public class Solution5 {

	public static void main(String[] args) {
		try {
			
			long firstNumber = Long.parseLong(args[0]);
			long secondNumber = Long.parseLong(args[1]);
			System.out.println("Before Swap:");
			System.out.println("First Number - " + firstNumber + ", Second Number - " + secondNumber);
			
			firstNumber = firstNumber + secondNumber;
			secondNumber = firstNumber - secondNumber;
			firstNumber = firstNumber - secondNumber;
			
			System.out.println("\nAfter Swap:");
			System.out.println("First Number - " + firstNumber + ", Second Number - " + secondNumber);
			
		}catch(Exception exception) {
			System.out.println("Exception: " + exception.getMessage());
		}

	}

}
