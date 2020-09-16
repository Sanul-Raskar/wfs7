package com.hsbc.assignments;
/*
Program prints the command line arguments
if passed else print nothing 
*/
public class Solution2{
	public static void main(String args[]){
	    
	    if(args.length == 1)
	        System.out.println("Message: " + args[0]);
	    else if(args.length > 1){
	        
	        String content = "";
	
	        for(String arg:args)
	            content += arg + " ";
	        
	        System.out.println("Message: " + content);
	    }      
	}
}