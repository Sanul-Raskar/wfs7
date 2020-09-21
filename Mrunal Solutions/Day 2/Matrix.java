
//Program to construct two matrices and display the sum of those
package com.hsbc.day2;

public class Matrix {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] mat1 = new int[][]{ {1,3,4},{2,4,3},{3,4,5} }; 
		int[][] mat2 = new int[][]{ {1,3,4},{2,4,3},{1,2,4} }; 
		
		for(int i=0;i<mat1.length;i++){    
			for(int j=0;j<mat1.length;j++){    
			    //use - for subtraction  
			System.out.print(mat1[i][j] + mat2[i][j]+" ");    
			}    
			System.out.println();//new line    
			}   
	}

}
