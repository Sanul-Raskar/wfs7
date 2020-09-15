package com.hsbc.exercise12;		//package name

import java.util.Scanner;

//Class Name
public class RetailProducts {

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//taking product values in double datatype
		double p1_Price = 22.50, p2_price = 44.50, p3_price = 9.98;
		double totalAmount=0;
		
		System.out.println("Enter number in pairs of Product number and Quantity (eg. 2 10)");

		//taking input from user
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			int a=sc.nextInt();
			double b=sc.nextInt();
			//intArr[a] = b;
			
			//Switch statment to decide price for each
			switch(a) {
			 	
			case 1:
				totalAmount+= b * p1_Price;
				break;
				
			case 2:
				totalAmount+= b * p2_price;
				break;
			
			case 3:
				totalAmount+= b * p3_price;
				break;
			default:
				break;
			}
		}
		//Close scanner 
		sc.close();
		System.out.println("Total retail value of all products is::"+totalAmount);
	}

}
