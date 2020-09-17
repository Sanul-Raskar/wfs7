package com.hsbc.assignments;
/*
 	Program prints int, float, double and 
 	long numbers
 */
public class Solution4 {

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
