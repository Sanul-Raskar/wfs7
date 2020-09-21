package com.example.pack;

/*
 * Lab Exercise 22
 * 
 * Write a program to display the square of the elements of a two dimensional array.
 * 
 * Created by Sanul Raskar
 * 
 * */

public class MatrixElementSquare {

	// Print Matrix
	//It takes input as matrix (2D array), row size and column size of matrix
	private static void printMatrix(int[][] M, int rowSize, int colSize) {
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++)
				System.out.print(M[i][j] + " ");

			System.out.println();
		}
	}

	//Calculate square of each element in the matrix
	//It takes input as matrix (2D array), row size and column size of matrix
	private static int[][] calculateSquare(int[][] arr, int rowSize, int colSize) {
		int i, j;
		//Create new matrix C to store result
		int[][] C = new int[rowSize][colSize];

		//Iterate through all elements and save square of element in matrix C
		for (i = 0; i < rowSize; i++)
			for (j = 0; j < colSize; j++)
				C[i][j] = (int) Math.pow(arr[i][j], 2);

		return C;
	}

	public static void main(String[] args) {


		int rowSize = 2,colSize = 2;

		//Create 2x2 matrix

		int A[][] = { { 7, 5 }, { 2, 3 } };

		// Print the matrices A
		System.out.println("\nMatrix A:");
		printMatrix(A, rowSize, colSize);

		// Calculate square and save returned result on matrix B
		int[][] B = calculateSquare(A, rowSize,colSize);

		// Print the result matrix B
		System.out.println("\nResultant Matrix:");
		printMatrix(B, rowSize, colSize);

	}

}
