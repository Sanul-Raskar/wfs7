package com.example.pack;

/*
 * Lab Exercise 7
 * This program is to find the largest of three numbers using conditional statements. 
 * 
 * Created by Sanul Raskar
 * 
 * */

public class LargestNumber {

	public static void main(String[] args) {

		int number1 = 3, number2 = 6, number3 = 2;

		// if number 1 is greater than number2 and number1 is greater than number3 then
		// largest number is number1
		if (number1 >= number2 && number1 >= number3)
			System.out.println(number1 + " is the largest number.");

		// if number2 is greater than both number1 and number3 then largest number is
		// number2
		else if (number2 >= number1 && number2 >= number3)
			System.out.println(number2 + " is the largest number.");

		// if both above conditions are false, number3 is the largest
		else
			System.out.println(number3 + " is the largest number.");

	}

}
