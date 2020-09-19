package com.example.pack;

/*
 * Lab Exercise 23
 * 
 * Write a program to construct an array with 10 elements and to find the number of    
 * occurrences of each element in the Array.
 * 
 * Created by Sanul Raskar
 * 
 * */

public class ElementFreqArray {

	public static void main(String[] args) {

		//Declare and initialize array
		int[] arr = new int[] { 1, 2, 4, 5, 3, 5, 5, 2, 3, 2 };

		// Array freq will store frequencies of element
		//declare it with size equal to number of elements in given array
		int[] freq = new int[arr.length];
		int visited = -1;

		//Iterate through all the elements of array
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			//from current element index to last index iterate
			for (int j = i + 1; j < arr.length; j++) {
				//if same element found then increase count variable

				if (arr[i] == arr[j]) {
					count++;
					// To avoid counting same element again
					freq[j] = visited;
				}
			}
			
			//Save the count in freq array
			if (freq[i] != visited)
				freq[i] = count;
		}
		
		
		//Print the element from array and the frequency of occurrences

		System.out.println(" Element | Frequency");
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != visited)
				System.out.println("    " + arr[i] + "    |    " + freq[i]);
		}

	}
}
