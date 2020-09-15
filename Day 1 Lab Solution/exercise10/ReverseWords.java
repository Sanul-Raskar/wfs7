package com.hsbc.exercise10;			//Package name

import java.util.Arrays;

//Class name
public class ReverseWords {

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Defining array of strings
		String [] s = {"my","preference","java","HSBC"};
		String [] result=new String[s.length];
		
		//for loop to iterate over String array s
		for(int i=0; i<s.length; i++) {
			
			// getBytes() method to convert string into bytes[].
			byte[] temp = s[i].getBytes();
			byte[] res = new byte[temp.length];
			
			// Store result in reverse order into the res byte[] 
	        for (int j = 0; j < temp.length; j++) 
	            res[j] = temp[temp.length - j - 1]; 
	        
	        //Store word in reverse format to result array
	        result[i] = new String(res);
	        
		}
		
		//Now sort array of words
		Arrays.sort(result,String.CASE_INSENSITIVE_ORDER);
		
		System.out.println("Final words are:: ");
		
		for (int a = 0; a < result.length; a++) {
	         System.out.println(result[a]);
	      }
	}

}
