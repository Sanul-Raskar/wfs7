package com.hsbc.day2;

/*
 	In the calculator (Lab exercise - 14) program, make the add and diff method to accept var-args
	and demonstrate.
 */

public class Solution28 {

	public static void main(String[] args) {
		
		System.out.println("21 + 34 = " + add(21, 34));
		System.out.println("32 + 45 + 18 + 81 = " + add(32, 45, 18, 81));
		
		System.out.println("21 - 53 = " + diff(21,53));
		System.out.println("54 - 12 - 8 - 28 - 67 = " + diff(54,12, 8, 28, 67));

	}
	
	public static int add(int ...numbers) {
		
		int sum = 0;
		for(int number : numbers)
			sum += number;
		return sum;
	}
	
	public static int diff(int ...numbers) {
		int difference = numbers[0];
		if(numbers.length > 1) {
			for(int i = 1; i < numbers.length; i++)
				difference -= numbers[i];
		}
		return difference;
	}

}
