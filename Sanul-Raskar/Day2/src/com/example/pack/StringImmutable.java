package com.example.pack;

/*
 * Lab Exercise 18
 * 
 * Write a program to demonstrate the difference between equals and == operator.
 * 
 * Created by Sanul Raskar
 * 
 * */

public class StringImmutable {

	public static void main(String[] args) {
		String s1 = new String("Sanul");
		String s2 = new String("Sanul");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
