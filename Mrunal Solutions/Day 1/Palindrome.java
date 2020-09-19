/**
 * 
 */
package com.hsbc.pack;

/**
 * @author mrunal
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	//program to check whether a number is a palindrome or not. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,temp;    
		int num=Integer.parseInt(args[0]);
		  
		  temp=num;    
		  while(num>0){    
		   r=num%10;  
		   sum=(sum*10)+r;    
		   num=num/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");   
	}

}
