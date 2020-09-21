package com.example.pack;

/*
 * Lab Exercise 13
 * Consider user has N eggs. Then display the no of eggs in gross (144 eggs make one gross) and 
   no of eggs in dozen (12 eggs make one dozen) and the no of eggs that is left out remaining. 
   The total no of eggs can be got as input through command line. The program should display
   how many gross, how many dozen, and how many left over eggs the user has.
 *  
 *  Created by: Sanul Raskar
 * */

public class EggCount {

	public static void main(String[] args) {

		int eggCount = Integer.parseInt(args[0]), gross, dozen, extraEgg, afterGross;
		gross = eggCount / 144;
		// left over after calculating gross
		afterGross = eggCount % 144;
		// calculate dozens by dividing left over gross eggs by 12
		dozen = afterGross / 12;
		// to calculate extra eggs
		extraEgg = afterGross % 12;

		System.out.println("Your number of eggs is " + gross + " gross," + dozen + " dozen, and " + extraEgg);
	}

}
