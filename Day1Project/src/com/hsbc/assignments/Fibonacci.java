package com.hsbc.assignments;


public class Fibonacci {
	/*
	 	Method prints the fibonacci series
	 	with last number of series being
	 	less than given number
	 */
	public static void fibonacciSeries(int lastNumber) {
		int first = 0;
		int second = 1;
		while(first < lastNumber) {
			System.out.print(first + " ");			
			int next = first + second;
			first = second;
			second = next;
		}
		System.out.println();		
	}
	
	public static void main(String[] args) {
		fibonacciSeries(200);
	}

}
