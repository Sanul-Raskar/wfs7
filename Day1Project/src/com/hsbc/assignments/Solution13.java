package com.hsbc.assignments;
/*
 	Consider user has N eggs. Then display the no of eggs in gross (144 eggs make one gross) and 
no of eggs in dozen (12 eggs make one dozen) and the no of eggs that is left out remaining. 
The total no of eggs can be got as input through command line. The program should display
how many gross, how many dozen, and how many left over eggs the user has.

 */
public class Solution13 {
	/*
	 	Inside this following steps are followed:
	 	1. Gross of eggs is computed and then eggCount is updated
	 	2. Dozen of remaining eggs is computed and then eggCount is updated
	 	3. Finally the gross, dozen and remaining eggs are printed
	 */
	public static void main(String[] args) {
		
		try {
			int eggCount = Integer.parseInt(args[0]);
			int gross = eggsInBase(eggCount, 144);
			System.out.print("Your number of eggs is ");
			if(gross > 0) {
				eggCount -= gross * 144;
				System.out.print(gross + " gross, ");
			}
			int dozen = eggsInBase(eggCount, 12);
			if(dozen > 0) {
				eggCount -= dozen * 12;
				System.out.print(dozen + " dozen, ");
			}
			if(eggCount > 0)
				System.out.println(" and " + eggCount);
			
		}catch(Exception exception) {
			System.out.println("Exception: " + exception.getMessage());
		}
	}
	/*
	 	Method returns the number of groups 
	 	of eggs for the given base
	 */
	public static int eggsInBase(int eggCount, int base) {
		if(base > eggCount)
			return 0;
		
		return (eggCount / base);
		
	}

}
