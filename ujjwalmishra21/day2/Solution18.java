package com.hsbc.day2;

/*
 	program to demonstrate the difference between equals and == operator with 
	appropriate example

 */

public class Solution18 {

	public static void main(String[] args) {
		
		String string1 = new String("Java");
		
		String string2 = new String("Java");
				
		String string3 = "NodeJS";
		
		String string4 = "NodeJS";
		
		String string5 = "Java";
		
		System.out.println("String1 using 'new': " + string1);
		System.out.println("String2 using 'new': " + string2);
		System.out.println("String3 without 'new': " + string3);
		System.out.println("String4 without 'new': " + string4);
		System.out.println("String5 without 'new': " + string5);
		
		if(string1 == string2) {
			System.out.println("String1 and String2 equals on ==");
		}else {
			System.out.println("String1 and String2 differ on ==");
		}
		
		if(string1.contentEquals(string2)) {
			System.out.println("String1 and String2 equal on equals()");
		}else {
			System.out.println("String1 and String2 differ on equals()");
		}
		
		if(string1 == string3) {
			System.out.println("String1 and String3 equal on ==");
		}else {
			System.out.println("String1 and String3 differ on ==");
		}
		
		if(string1.contentEquals(string3)) {
			System.out.println("String1 and String3 equal on equals()");
		}else {
			System.out.println("String1 and String3 differ on equals()");
		}
		

		if(string3 == string4) {
			System.out.println("String3 and String4 equal on ==");
		}else {
			System.out.println("String3 and String4 differ on ==");
		}
		
		if(string3.contentEquals(string4)) {
			System.out.println("String3 and String4 equal on equals()");
		}else {
			System.out.println("String3 and String4 differ on equals()");
		}
				
		
		if(string1 == string5) {
			System.out.println("String1 and String5 equals on ==");
		}else {
			System.out.println("String1 and String5 differ on ==");
		}
		
		if(string1.contentEquals(string5)) {
			System.out.println("String1 and String5 equal on equals()");
		}else {
			System.out.println("String1 and String5 differ on equals()");
		}
		
	}

}
