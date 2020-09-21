package com.example.pack;

/*
 * Lab Exercise 9
 * This program is to display the Fibonacci series starting from 0 till 200.
 * 
 * Created by Sanul Raskar
 * 
 * */

public class Fibonacci {

	public static void main(String[] args) {
		int sum = 0, term1 = 0, term2 = 1; // initialize variables
		System.out.println("Fibonacci series till 200:");

		// the sum of last two numbers should be less than or equal to 200
		while (term1 <= 200) {
			// print sum of last two terms
			System.out.print(term1 + " ");

			sum = term1 + term2;
			term1 = term2;
			term2 = sum;
		}

	}

}
