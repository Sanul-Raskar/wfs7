/*Arranging numbers in ascending order using selection sort algorithm.*/
package com.day.one;

import java.util.Scanner;

public class SolutionEleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner sc = new Scanner(System.in);  
		   int size, i, j, temp;  	         
	       System.out.print("Enter size of the array: ");  
	       size = sc.nextInt();  
	       int arr[] = new int[size];  
	       System.out.print("Enter Array Elements : ");  
	       for(i=0; i<size; i++)  
	       {  
	           arr[i] = sc.nextInt();  
	       }  
	       
	       for (i = 0; i < size-1; i++)
	        {
	            // Finding the minimum element in unsorted array
	            int min_index = i;
	            for ( j = i+1; j < size; j++)
	                if (arr[j] < arr[min_index])
	                	min_index = j;
	 	           
	            temp = arr[min_index];
	            arr[min_index] = arr[i];
	            arr[i] = temp;
	        }

	       System.out.println("Array after Sorting is ");  
	       for(i=0; i<size; i++)  
	       {  
	           System.out.print(arr[i]+ "  ");  
	       }  
	}

}
