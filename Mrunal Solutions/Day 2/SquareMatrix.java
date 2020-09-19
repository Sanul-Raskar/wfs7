
//Program to display the square of the elements of a two dimensional array
package com.hsbc.day2;

public class SquareMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int square[][]= {{1,3,5},{2,4,6}};
		  
		System.out.println("Original Matrix: ");
		  
		  for(int i = 0; i < 2; i++){
		  for(int j = 0; j < 3; j++){
		  System.out.print(square[i][j] + " ");
		  }
		  System.out.println();
		  }
		  
		  for(int i = 0; i <= 1; i++) {
		  for(int j = 0; j <= 2; j++) {
		  square[i][j] = square[i][j] * square[i][j];
		  } 
		  }
		  
		  System.out.println("Matrix after changes: ");
		  
		  for(int i = 0; i < 2; i++){
		  for(int j = 0; j < 3; j++){
		  System.out.print(square[i][j] + " ");
		  }
		  System.out.println();
		  }
	}

}
