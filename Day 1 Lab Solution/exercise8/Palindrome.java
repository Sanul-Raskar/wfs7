package com.hsbc.exercise8;

public class Palindrome {

	public static void main(String[] args) {
		int i,sum=0,temp;    
		int n=5008005;//It is the number variable to be checked for palindrome  
		  
		temp=n;    
		while(n>0){    
			i=n%10;  // remainder storing in variable i  
			sum=(sum*10)+i;    
			n=n/10;    
		}    
		  
		if(temp==sum)    
		   System.out.println("Given number is palindrome");    
		else    
		   System.out.println("Given number is not a palindrome");
	}
}
