/*Swaping the values of two numbers without using a temporary variable*/
package com.day.one;

public class SolutionFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.println("Numbers before swaping:");
		System.out.println("First number: "+a+"    Second number: "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Numbers after swaping:");
		System.out.println("First number: "+a+"    Second number: "+b);
	}

}
