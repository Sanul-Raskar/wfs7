package com.hsbc.day2;

/*
  a program to construct two matrices and display the sum of those
 */
public class Solution21 {
	
	public static void main(String args[]) {
		
		int array1[][] = new int[][] {{2,1,5},{4,3,5},{8,4,6},{2,1,3}};
		int array2[][] = new int[][] {{3,5,9},{-2,4,0},{-1,8,5},{5,1,5}};
		System.out.println("Array1:");
		display(array1);
		
		System.out.println("Array2:");
		display(array2);
		
		int sum[][] = sumMatrix(array1, array2);
		
		System.out.println("Sum:");
		display(sum);
	}
	
	public static void display(int arr[][]) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) 
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}
	
	public static int[][] sumMatrix(int arr1[][], int arr2[][]){
		int sum[][] = new int[arr1.length][arr1[0].length];
		
		for(int i = 0; i < sum.length; i++) {
			for(int j = 0; j < sum[i].length; j++) 
				sum[i][j] = arr1[i][j] + arr2[i][j];			
		}
		return sum;
	}

}
