package com.example.pack;

/*
 * Lab Exercise 22
 * 
 * 
 * 
 * Created by Sanul Raskar
 * 
 * */

public class MatrixElementSquare {

	// Function to print Matrix
	private static void printMatrix(int M[][], int rowSize, int colSize) {
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++)
				System.out.print(M[i][j] + " ");

			System.out.println();
		}
	}

	private static int[][] calculateSquare(int arr[][], int size) {
		int i, j;
		int C[][] = new int[size][size];

		for (i = 0; i < size; i++)
			for (j = 0; j < size; j++)
				C[i][j] = (int) Math.pow(arr[i][j], 2);

		return C;
	}

	public static void main(String[] args) {

		int size = 2;

		int A[][] = { { 7, 5 }, { 2, 3 } };

		// Print the matrices A
		System.out.println("\nMatrix A:");
		printMatrix(A, size, size);

		// Add the two matrices
		int B[][] = calculateSquare(A, size);

		// Print the result
		System.out.println("\nResultant Matrix:");
		printMatrix(B, size, size);

	}

}
