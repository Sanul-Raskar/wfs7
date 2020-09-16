/* Displaying gross, dozen, and left over eggs the user has.*/
package com.day.one;

public class SolutionThirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,gross,remaining_eggs,dozen,remaining;
		n=Integer.parseInt(args[0]);
		gross=n / 144;
		remaining_eggs=n%144;
		dozen=remaining_eggs/12;
		remaining=remaining_eggs%12;
		System.out.println("number of eggs is "+gross+" gross, "+dozen+" dozen, and "+remaining);

	}

}
