package com.example.pack;

/*
 * Lab Exercise 1
 * This program is to demonstrate the usage of java comments
 * 
 * Created by Sanul Raskar
 * 
 * */

public class UserComments {

	/** This is Java documentation comment. */
	public void run() {
		System.out.println("Run method...");
	}

	public static void main(String[] args) {
		// I will not execute because I'm a single line comment

		/*
		 * I'm a multi line comment. This is next line
		 */

		UserComments obj = new UserComments();
		obj.run();

	}

}
