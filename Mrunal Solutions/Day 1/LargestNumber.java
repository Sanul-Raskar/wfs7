/**
 * 
 */
package com.hsbc.pack;

/**
 * @author mrunal
 *
 */
//Program to find largest of three numbers
public class LargestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);
		
		if (num1 >= num2 && num1 >= num3)
	         System.out.println( num1 + " is the Largest number.");
	      else if (num2 >= num1 && num2 >= num3)
	         System.out.println( num2 + " is the Largest number.");
	      else
	         System.out.println( num3 + " is the Largest number.");
	   
	}

}
