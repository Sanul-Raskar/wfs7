package com.hsbc.exercise11;			//Package name

//Class name
public class SelectionSort {
	
	// Main Method
	public static void main(String args[]) {
		
		//Defining class object
		SelectionSort ob = new SelectionSort();
		
		//Defining array of integers
		int array[] = { 767, 56, 34, 1, 80 };
		
		ob.sortCustom(array);
		System.out.println("Sorted array is:");
		
		//Print the elements of an array
		int n = array.length;
		for (int i = 0; i < n; ++i)
			System.out.print(array[i] + " ");
		System.out.println();
	}
	
	// Selection Sort Algorithm code 
		void sortCustom(int array[]) {
			
			int n = array.length;
			
			for (int i = 0; i < n - 1; i++) {
				int min_element = i;
				
				for (int j = i + 1; j < n; j++) {
					if (array[j] < array[min_element])
						min_element = j;
				}
					
				int temp = array[min_element];
				array[min_element] = array[i];
				array[i] = temp;
			}
			
		}
}