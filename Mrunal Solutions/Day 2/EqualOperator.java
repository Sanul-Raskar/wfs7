package com.hsbc.day2;


//Program to demonstrate the difference between equals and == operator 

public class EqualOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Test");
		String s1 = new String("Test");
		
		if(s==s1)
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		
		if(s.equals(s1))
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		
		
	}

}
