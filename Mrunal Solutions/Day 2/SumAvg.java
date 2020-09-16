
//program to display the sum and the average of elements in the array
package com.hsbc.day2;

public class SumAvg {
	
	int sum(int[] arr){
		int sum=0;
		 
		for(int i=0; i<arr.length;i++)
			sum=sum+arr[i];
		
		return sum;
	}
	
	float avg(int[] arr,int sum){
		float avg=0;
		
		avg=sum/arr.length;
		
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8 }; 
		SumAvg arr = new SumAvg();
		
		System.out.println("Sum is " + arr.sum(intArray));
		System.out.println("Average is " + arr.avg(intArray, arr.sum(intArray)));
		
	}

}
