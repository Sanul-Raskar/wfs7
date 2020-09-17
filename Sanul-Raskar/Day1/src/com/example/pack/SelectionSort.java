package com.example.pack;

/*
 * Lab Exercise 11
 * This program is to sort array using Selection Sort Algorithm. 
 * 
 * Created by Sanul Raskar
 * 
 * */

public class SelectionSort {

	private void selectionSortAlgo(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			// Find the minimum element in unsorted array
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[minIndex])
					minIndex = j;
			// swap minimum element found with current arr[i]
			swap(arr, minIndex, i);
		}
	}

	private void swap(int arr[], int minimumIndex, int position) {
		int temp = arr[minimumIndex];
		arr[minimumIndex] = arr[position];
		arr[position] = temp;
	}

	private void printArray(int arr[]) {
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		SelectionSort obj = new SelectionSort();
		int arr[] = { 23, 45, 26, 87, 12 };

		System.out.println("Original array before sorting :");
		obj.printArray(arr);

		// Sort the array
		obj.selectionSortAlgo(arr);

		System.out.println("Array sorted using selection sort :");
		obj.printArray(arr);
	}

}
