/*Program to determine whether a number is a palindrome or not. */
package com.day.one;

import java.util.Scanner;

public class SolutionEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n,n1,r,sum=0; 
		System.out.println("Enter a number");
		n=sc.nextInt();  
		n1=n;//Creating copy of variable    
		while(n>0){    
		   r=n%10;  //remainder  
		   sum=(sum*10)+r;//reversing 
		   n=n/10;    
		 }    
		if(n1==sum)    
		   System.out.println(n1+" is a palindrome number ");    
		else    
		   System.out.println(n1+" is a not palindrome");  
	}

}
