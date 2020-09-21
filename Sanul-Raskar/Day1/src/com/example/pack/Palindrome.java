package com.example.pack;

/*
 * Lab Exercise 8
 * This program is to find the whether a number is palindrome or not. 
 * 
 * Created by Sanul Raskar
 * 
 * */

public class Palindrome {

	public static void main(String[] args) {
		int originalNumber, number = 123321, digit, reverse = 0;

		originalNumber = number;

		System.out.println("The number: " + originalNumber);

		// in do while loop last digit of number variable is removed and added to
		// reverse variable
		do {
			digit = number % 10;
			reverse = (reverse * 10) + digit;
			number = number / 10;
		} while (number != 0); // while loop will execute till all digits are removed from number variable

		System.out.println("Reverse of the number: " + reverse);

		// if original number and reversed numbers are same then it is palindrome
		if (originalNumber == reverse)
			System.out.println("The number is a palindrome");
		else
			System.out.println("The number is not a palindrome");
	}

}
