package com.hsbc.assignments;

import java.util.Arrays;

/*
 * Program to display use of comments
*/
public class Solution3 {
	/*
 	Program reverses each string 
 	from an array of strings
 	and sorts the resulting array
	 */
	public static void main(String[] args) {
		
		String stringArray[] = new String[] {"java", "cpp", "python", "nodejs", "golang"};
				
		/*reverses each string of the array by:
		  1. converting the string to stringbuilder
		  2. calling reverse() on the stringbuilder
		  3. storing the resulting stringbuilder back to the string 
		  */
		for(int i = 0; i < stringArray.length; i++) {
			StringBuilder sb = new StringBuilder(stringArray[i]);
			stringArray[i] = sb.reverse().toString();
		}
		//Sorts the reversed string array
		Arrays.sort(stringArray);
		
		for(String string: stringArray) {
			System.out.print(string + " ");
		}
		System.out.println();
	}

}
