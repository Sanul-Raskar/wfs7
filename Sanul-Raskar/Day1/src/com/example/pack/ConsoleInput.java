package com.example.pack;

/*
 * Lab Exercise 2
 * This program prints the argument given while executing the file
 * 
 *  $ javac ConsoleInput.java
 *  $ java ConsoleInput Hello World
 *  
 *  The above code will print Hello World
 *  
 *  
 *  Created by Sanul Raskar
 * 
 * */

public class ConsoleInput {

	public static void main(String[] args) {

		// args string array contains token words provided in console which were space
		// seperated

		System.out.print("Message from Command line arguments: ");
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + " ");

		}

	}

}
