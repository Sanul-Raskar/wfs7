/*Checks whether the given year is leap year or not through command line input. */
package com.day.one;

public class SolutionSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=Integer.parseInt(args[0]);
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))// condition for leap year
	         System.out.println(year+" is a leap year");
	      else
	         System.out.println(year+" is not a leap year");
	}

}
