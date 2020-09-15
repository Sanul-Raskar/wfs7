//This program determines the largest of three numbers.
package com.day.one;

public class SolutionSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		/*Taking input from command line*/
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		z=Integer.parseInt(args[2]);
		if(x > y && x > z)	//comparing for the first number is largest or not         
	            System.out.println("Largest number is: "+x);	        
	        else if(y > z)  //comparing for the first number is largest or not
	            System.out.println("Largest number is: "+y);
	        else           //if first two numbers are not greater then the third number is graeter 
	            System.out.println("Largest number is: "+z);
	}

}
