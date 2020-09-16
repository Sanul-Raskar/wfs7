package com.hsbc.exercise7;		//Package name

//Class name
public class LargestNumber {

	//Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// defining three numbers
		int a=999,b=45,c=876,largest;	
		
		if(a>b) {
			if(a>c) 
				largest=a;
			else
				largest=c;
		}
		
		else if(b>c) {
			largest=b;
		}
		
		else
			largest=c;
		
		System.out.println("Largest of three numbers is::"+largest);
	}

}
