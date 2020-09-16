package com.day.one;

import java.util.Scanner;

public class SolutionTwelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		double retail=0;
		while(true){
		System.out.println("Enter 1 for: Product 1, 22.50");
		System.out.println("Enter 2 for: Product 2, 44.50");
		System.out.println("Enter 3 for: Product 3, 9.98");
		System.out.println("4 - Exit program");
		System.out.print("Enter product number: ");
		int productnumber=sc.nextInt();		
		if(productnumber==4){
		break;//exiting program
		}
		System.out.print("Enter quantity sold: ");
		int quantitySold=sc.nextInt();
		switch(productnumber){
		case 1:
		retail+=22.50*quantitySold;
		break;
		case 2:
		retail+=44.50*quantitySold;
		break;
		case 3:
		retail+=9.98*quantitySold;
		break;
		}
		System.out.println("\nThe total retail value of all products sold: $"+retail);
		}

	}

}
