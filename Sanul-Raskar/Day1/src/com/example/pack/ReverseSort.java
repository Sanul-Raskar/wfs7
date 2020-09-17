package com.example.pack;

/*
 * Lab Exercise 10
 * This program is to reverse the words in an array and then sort the array. 
 * 
 * Created by Sanul Raskar
 * 
 * */

import java.util.Arrays;

public class ReverseSort {

	public static void main(String[] args) {

		// Create a string array
		String[] arr = { "apple", "mango", "test", "now", "Hi", "gear" };

		// Using StringBuilder class reverse each element for array
		for (int i = 0; i < arr.length; i++) {
			StringBuilder sb = new StringBuilder(arr[i]);
			arr[i] = sb.reverse().toString();
		}

		// Sort the new array
		Arrays.sort(arr);

		// Print sorted array
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}

}
