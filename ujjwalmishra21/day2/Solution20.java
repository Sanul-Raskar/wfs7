package com.hsbc.day2;

/*
 	a program to display the sum and the average of elements in the array.
 */
public class Solution20 {

	public static void main(String[] args) {
		
		int sampleArr[] = new int[] {23, 34, 78, 89, 10, 22, 89, 11};
		
		int sum = computeSum(sampleArr);
		
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + (sum/(double)sampleArr.length));
	}
	
	public static int computeSum(int arr[]) {
		int sum = 0;
		for(int temp : arr)
			sum += temp;
		return sum;
	}
	
	

}
