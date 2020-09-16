package com.hsbc.exercise9;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first = 0, t2 = 1;
        System.out.print("Fibonacci numbers from 0 to 200 are:: ");

        //While loop
        while (first <= 200)
        {
            System.out.print(first + " ");	//Printing number 
            int sum = first + t2;				//Adding next term to the number
            first = t2;							
            t2 = sum;							//Maintaing sum count
        }
	}

}
