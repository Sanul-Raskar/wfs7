package com.example.pack;

/*
 * Lab Exercise 21
 * 
 * 
 * 
 * Created by Sanul Raskar
 * 
 * */

public class MatrixSum {

	// Function to print Matrix
	static void printMatrix(int M[][], int rowSize, int colSize) {
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++)
				System.out.print(M[i][j] + " ");

			System.out.println();
		}
	}

	// Function to add the two matrices
	// and store in matrix C
	static int[][] add(int A[][], int B[][], int size) {
		int i, j;
		int C[][] = new int[size][size];

		for (i = 0; i < size; i++)
			for (j = 0; j < size; j++)
				C[i][j] = A[i][j] + B[i][j];

		return C;
	}

	public static void main(String[] args) {
		int size = 2;

		int A[][] = { { 1, 1 }, { 2, 2 } };
		// Print the matrices A
		System.out.println("\nMatrix A:");
		printMatrix(A, size, size);

		int B[][] = { { 3, 3 }, { 4, 4 } };
		// Print the matrices B
		System.out.println("\nMatrix B:");
		printMatrix(B, size, size);

		// Add the two matrices
		int C[][] = add(A, B, size);

		// Print the result
		System.out.println("\nResultant Matrix:");
		printMatrix(C, size, size);
	}

}
