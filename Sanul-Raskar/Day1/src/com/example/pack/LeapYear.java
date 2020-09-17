package com.example.pack;

/*
 * Lab Exercise 6
 * This program is to find whether the given year is leap year or not.
 * The checkLeapYear() method will print whether it is leap year or not
 * 
 * Created by Sanul Raskar
 * 
 * */

import java.util.Scanner;

public class LeapYear {

	// Class variable
	private int year;

	// Constructor to initialize year variable
	public LeapYear(int year) {
		this.year = year;
	}

	private void checkLeapYear() {

		boolean flag; // Local Variable

		// if the year is divisible by 4 then proceed else not leap year
		if (this.year % 4 == 0) {
			if (this.year % 100 == 0) {
				// year is divisible by 400, hence the year is a leap year
				if (this.year % 400 == 0)
					flag = true;
				else
					flag = false;
			} else
				flag = true;
		} else
			flag = false;

		// Print whether the year is leap or not based on flag variable
		if (flag)
			System.out.println(this.year + " is a leap year.");
		else
			System.out.println(this.year + " is not a leap year.");
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Ask user to enter a year in console
		System.out.println("Enter a year: ");

		// Read the integer (year) from console
		int year1 = scan.nextInt();

		// Closing Scanner
		scan.close();

		// Create object of class LeapYear and initialize with year1
		LeapYear yearObj = new LeapYear(year1);

		// Call checkLeapYear method using object1
		yearObj.checkLeapYear();

	}

}
