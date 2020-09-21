
//program to declare an array with 8 elements and copy the 8 elements into another 
//array and display the same

package com.hsbc.day2;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8 }; 
		int[] intArray2 = intArray;
		
		for(int i=0;i<intArray2.length;i++ )
			System.out.println(intArray2[i]);
	}

}
