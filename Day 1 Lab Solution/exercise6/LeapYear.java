package com.hsbc.exercise6;		//Package name

//Class name
public class LeapYear {

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// If a year is multiple of 400 a, then it is a leap year
	    if (Integer.valueOf(args[0]) % 400 == 0)  
	    	System.out.println("Given year is a leap year!"); 
	    
	    // Else If a year is muliple of 100, then it is not a leap year
	    else if (Integer.valueOf(args[0]) % 100 == 0)  
	    	System.out.println("Given year is not a leap year."); 
	    
	    // Else If a year is muliple of 4, then it is a leap year
	    else if(Integer.valueOf(args[0]) % 4 == 0)
	    	System.out.println("Given year is a leap year!");
	    
	    // it is not a leap year  
	    else  
	    	System.out.println("Given year is not a leap year."); 
	  
	      
	    
			
	}

}
