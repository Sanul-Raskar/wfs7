package com.example.pack;

import java.util.ArrayList;

/*
 * Lab Exercise 54
  
  	By using multiple catch blocks, write a class to demonstrate the order of the execution of the 
	catch blocks using NegativeArraySizeException,ArrayIndexOutOfBoundsException, 
	StringIndexOutOfBoundsException, IndexOutOfBoundsException, NullPointerException,          
	ArithmeticException and print the stack trace for each exception.

 * Created By: Sanul Raskar
 * */
public class ExceptionsDemo {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String str = "Hello World";

		try {

			// NegativeArraySizeException will occur here as array size must be positive
			int[] intArray = new int[-3];
			// Correct declaration
			// int[] intAray = new int[5];

			// ArrayIndexOutofBoundsException will occur here as arr size is 10
			int num = arr[34];
			// Correct access
			// int num = arr[3];

			// StringIndexOutofBoundsException will occur here as str size is 11
			char c = str.charAt(23);
			// Correct method
			// char c = str.charAt(6);

			ArrayList<String> list = new ArrayList<>();
			list.add("A");
			list.add("B");
			// IndexOutOfBoundException will come here as the length of ArrayList is 2. We
			// can access only index 0 & 1
			System.out.println(list.get(2));

			// NullPointerException will come here as string1 is not initialized
			String string1 = null;
			c = string1.charAt(0);

			// ArithmeticException will occur because we are trying to divide by 0
			double number1 = 2.4, number2 = 0;
			double ans = number1 / number2;

		} catch (NegativeArraySizeException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
