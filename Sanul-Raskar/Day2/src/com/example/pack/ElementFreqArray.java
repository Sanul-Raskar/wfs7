package com.example.pack;

/*
 * Lab Exercise 23
 * 
 * 
 * 
 * Created by Sanul Raskar
 * 
 * */

public class ElementFreqArray {

	public static void main(String[] args) {

		// Initialize array
		int[] arr = new int[] { 1, 2, 4, 5, 3, 5, 5, 2, 3, 2 };

		// Array freq will store frequencies of element
		int[] freq = new int[arr.length];
		int visited = -1;

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					// To avoid counting same element again
					freq[j] = visited;
				}
			}
			if (freq[i] != visited)
				freq[i] = count;
		}

		System.out.println(" Element | Frequency");
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != visited)
				System.out.println("    " + arr[i] + "    |    " + freq[i]);
		}

	}
}
