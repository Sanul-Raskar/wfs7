
//Program to construct an array with 10 elements and to find the number of    
//occurrences of each element in the Array.

package com.hsbc.day2;

import java.util.Arrays;

public class Frequency {
	
			public static void countFreq(int arr[], int n) 
			{ 
			    boolean visited[] = new boolean[n]; 
			      
			    for (int i = 0; i < n; i++) { 
			  			        
			        if (visited[i] == true) 
			            continue; 
			  			      
			        int count = 1; 
			        for (int j = i + 1; j < n; j++) { 
			            if (arr[i] == arr[j]) { 
			                visited[j] = true; 
			                count++; 
			            } 
			        } 
			        	System.out.println(arr[i] + " --> " + count); 
			    } 
			} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 }; 
		     
		    countFreq(arr, arr.length); 
	}

}
