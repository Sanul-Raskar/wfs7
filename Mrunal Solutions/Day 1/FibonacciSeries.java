/**
 * 
 */
package com.hsbc.pack;

/**
 * @author mrunal
 *
 */
public class FibonacciSeries {

	/**
	 * @param args
	 */
	//Program to print the Fibonacci series starting from 0 till 200.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3,i,count=200; 
		
		 System.out.print(n1+" "+n2);   
		    
		 for(i=2;i<count;++i)   
		 {    
			  n3=n1+n2;    
			  System.out.print(" "+n3);    
			  n1=n2;    
			  n2=n3;    
		 }    
	}

}
