package com.hsbc.assignments;

/*
Program to find largest
of three numbers
*/
public class Solution7 {
	public static void main(String[] args) {
		
		long firstNum = -123;
	    long secondNum = 134;
	    long thirdNum = 72;
	    long largestNum = (firstNum > secondNum) ? (firstNum > thirdNum ? firstNum : thirdNum) : (secondNum > thirdNum ? secondNum : thirdNum); 
	
	    System.out.println("Largest out of '" + firstNum + " ," + secondNum + ", " + thirdNum +"' : " + largestNum);
		
	}
}
