/**
 * 
 */
package com.hsbc.pack;

/**
 * @author mrunal
 *
 */
public class OperatorsDemo {

	/**
	 * @param args
	 *
	 */
	//Program to swap two numbers without using third variable.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		
		if(args.length>0){
			
			System.out.println("Before Swapping value of a is "+a+" and b is "+b);
			
			a=a+b;
			b=a-b;
			a=a-b;
			
			System.out.println("After Swapping value of a is "+a+" and b is "+b);
		}
	}

}
