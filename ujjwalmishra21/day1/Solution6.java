package com.hsbc.assignments;

//Programs checks whether given year is a leap year or not

public class Solution6{
	 public static void main(String args[]){
	     try{
	         int year = Integer.parseInt(args[0]);
	         if(checkLeapYear(year))
	             System.out.println(year + " is a Leap Year");
	         else
	             System.out.println(year + " is not a Leap Year");
	             
	     }catch(Exception exception) {
				System.out.println("Exception: " + exception.getMessage());
			}
	 }
	 /*
	     Method checks for leap year
	     returns true  - if year is a leap year 
	     //  ( year%400 == 0 ) or (year % 100 != 0 && year % 4 == 0)
	      
	     returns false - if year is not a leap year  
	 */
	 public static boolean checkLeapYear(int year){
	     if(year % 400 == 0)
	         return true;
	     else if(year % 100 == 0)
	         return false;
	     else if(year % 4 == 0)
	         return true;
	     
	     return false;
	 }
}