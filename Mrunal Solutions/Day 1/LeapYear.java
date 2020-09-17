/**
 * 
 */
package com.hsbc.pack;

/**
 * @author mrunal
 *
 */
public class LeapYear {

	/**
	 * @param args
	 */
	//Program to check year is Leap year or not
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = Integer.parseInt(args[0]);
		
		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Year is a leap year");
	      else
	         System.out.println("Year is not a leap year");
	}

}
