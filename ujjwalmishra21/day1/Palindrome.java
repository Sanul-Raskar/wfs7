package com.hsbc.assignments;

/* Programs checks whether 
given number is a palindrome or not*/
class Palindrome{
	
	public static void main(String args[]){
	    long number = 1441441L;
	    if(checkPalindrome(String.valueOf(number)))
	        System.out.println(number + " is a Palindrome");
	    else      
	        System.out.println(number + " is not a Palindrome");
	}
	/*
	    methods simultaneously checks for a match for 
	    -start and last character ,if does not match return false
	    -1st from start and 1st from last position, if does not match return false 
	    ...
	     return true
	
	    true - is a palindrome
	    false - not a palindrome
	*/   
	public static boolean checkPalindrome(String value){
	    
	    int startIndex = 0;
	    int lastIndex = value.length()-1;
	
	    while(startIndex < lastIndex){
	        if(value.charAt(startIndex) != value.charAt(lastIndex))
	            return false;
	        startIndex++;
	        lastIndex--;
	    }
	    return true;
	}
}