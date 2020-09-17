package com.hsbc.day2;

/*
 	a program to declare an array with 8 elements and copy the 8 elements into another 
	array and display the same

 */

public class Solution19 {

	public static void main(String[] args) {
		
		int sampleArray[] = new int[] {1,2,3,4,5,6,7,8};
		
		int duplicateArray[] = new int[sampleArray.length];
		System.out.println("Original Array: ");
		displayArray(sampleArray);
		System.out.println();
		
		for(int i = 0; i < sampleArray.length; i++)
			duplicateArray[i] = sampleArray[i];
		
		System.out.println("Copied Array: ");
		displayArray(duplicateArray);

	}
	
	public static void displayArray(int arr[]) {
	
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");			
		}
		System.out.println();
	}

}
