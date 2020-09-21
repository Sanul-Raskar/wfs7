
//Program to display the no of objects created for  
//class Sample or the no of times that class is instantiated

package com.hsbc.day2;

public class Sample {
	 static int count;
	
	 Sample(){
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample obj1 = new Sample();
		Sample obj2 = new Sample();
		Sample obj3 = new Sample();
		Sample obj4 = new Sample();
		
		System.out.println("Total no. objects of class Sample are "+ obj4.count);

	}

}
