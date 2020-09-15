package com.hsbc.pack;

public class ForthProgramDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=11;
		do {
			System.out.println("Do While Example");
			System.out.println("Value of i is "+i);
			i++;
			
		}while(i<10);
		
		while(i<10) {
			System.out.println("While Example");
			
			System.out.println("Value of i is "+i);
			i++;
		}
		System.out.println("Program exit");
	}

}
