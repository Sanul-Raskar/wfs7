package com.hsbc.assignments;
/* Programs sorts the given array of integer elements
 	using selection sort
 */
public class SelectionSort {
	//method sorts the integer array using Selection sort
	public static void selectionSort(int elements[]) {
		for(int i = 0; i < elements.length; i++) {
			int minimum = elements[i];
			int index = i;
			
			//this loop pick the minimum element after the current 'i' index
			for(int j = i + 1 ; j < elements.length; j++) {
				if(elements[j] < minimum) {
					index = j;
					minimum = elements[j];
				}
			}
			
			//the minimum element after 'i' is swapped with current 'i' element
			swap(elements,i,index);
		}
		
	}
	// method swaps the given indexes in the array
	public static void swap(int elements[], int firstIndex, int secondIndex) {
		int tempElement = elements[firstIndex];
		elements[firstIndex] = elements[secondIndex];
		elements[secondIndex] = tempElement;
	}
	
	public static void main(String[] args) {
		
		int elements[] = {28, -6, 7, 15, 78, -20, 11};
		selectionSort(elements);
		
		for(int element: elements) {
			System.out.print(element + " ");
		}
		System.out.println();		

	}

}
