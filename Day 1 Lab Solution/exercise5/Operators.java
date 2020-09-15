package com.hsbc.exercise5;			//Package name

//Class name
public class Operators {

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Printing command line arguments 
		System.out.println("Numbers before swap::"+args[0]+" , "+args[1]);
		
		//Logic to swap numbers in integer form
		args[0] = String.valueOf(Integer.valueOf(args[0]) + Integer.valueOf(args[1])) ;
		args[1] = String.valueOf(Integer.valueOf(args[0]) - Integer.valueOf(args[1])) ; 
		args[0] = String.valueOf(Integer.valueOf(args[0]) - Integer.valueOf(args[1])) ; 
		
		//Printing numbers after swap
		System.out.println("Numbers after swap::"+args[0]+" , "+args[1]);
	}

}
