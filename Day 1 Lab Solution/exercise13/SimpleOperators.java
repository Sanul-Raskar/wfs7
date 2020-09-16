package com.hsbc.exercise13;		//package name

import java.util.Scanner;

//Class name
public class SimpleOperators {

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int gross=0,dozen=0,left=0;
		//taking number of eggs as input
		System.out.println("Enter number of eggs::");
		
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt();
		
		//Close scanner
		sc.close();
		
		//calculating in terms of gross, dozen, left out 
		gross = n / 144;
		dozen = (n % 144) /12 ;
		left = n - dozen * 12 - 144 * gross;
		
		System.out.println("Your number of eggs is "+gross+" gross,"+dozen+" dozen,"+left+" left.");
	}

}
