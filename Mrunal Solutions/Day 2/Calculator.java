

// Program to calculation Addition, Subtraction, Multiplication, Division of tow numbers by
// creation a object of class Calculator 
package com.hsbc.day2;

public class Calculator {

	int add(int a, int b){
		return (a+b);
	}
	int mul(int a, int b){
		return (a*b);
	}
	int sub(int a, int b){
		return (a-b);
	}
	int div(int a, int b){
		return (a/b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		Calculator obj = new Calculator();
		
		System.out.println("Addition is "+ obj.add(a, b));
		System.out.println("Subtraction is "+ obj.sub(a, b));
		System.out.println("Multiplication is "+ obj.mul(a, b));
		System.out.println("Division is "+ obj.div(a, b));
				
	}

}
