package com.example.pack;

/*
 * Lab Exercise 4
 * Write a program which declares variables of int, float, double data types and a constant of  
   long data type and displays all with an appropriate message. Follow the naming conventions 
   for all the variables and literals.
 * 
 * Created by Sanul Raskar
 * 
 * */

public class DataVariables {

	public static void main(String[] args) {

		int integerNumber = 123;
		float floatNumber = 12.45F;
		double doubleNumber = 134.56387;
		long longNumber = 1341L;
		long hexaDecimalNumber = 0xFF19EAL;
		long binaryNumber = 0b10111011101L;

		System.out.println("Integer Number: " + integerNumber);
		System.out.println("Float Number: " + floatNumber);
		System.out.println("Double Number: " + doubleNumber);
		System.out.println("Long Number: " + longNumber);
		System.out.println("Hexa Decimal Number to Decimal: " + hexaDecimalNumber);
		System.out.println("Binary Number to Decimal: " + binaryNumber);

	}

}
