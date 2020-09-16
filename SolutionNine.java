/*display the Fibonacci series starting from 0 till 200.*/
package com.day.one;

public class SolutionNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c=0;
		//Initializing values
		a=0;
		b=1;
		c=1;
		System.out.print(a+", ");
		while(c<=200){
			System.out.print(c+", ");
			c=a+b;			
			a=b;//exchanging values for further number
			b=c;
			
		}
	}

}
