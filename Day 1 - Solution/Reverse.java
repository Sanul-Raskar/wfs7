/**
 * 
 */
package com.hsbc.pack;

import java.util.Arrays;

/**
 * @author mrunal
 *
 */
public class Reverse {

	/**
	 * @param args
	 */
	
	//Program to declare a set of 5 words and reverse each word and arrange the resulting words in alphabetical order and display the same

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//String[] result = null;
			
			/*for(int j=0;j<args.length;j++){
				for (int i = (args[j].length()) - 1; i >= 0; i--)
				{
					result[j] += args[j][i];
				}
			}*/
			
			for(int j=0;j<args.length;j++) //Reverse Function
			{
				StringBuilder sb = new StringBuilder(args[j]);
				args[j]=sb.reverse().toString();
			}
			
			Arrays.sort(args); //Sorting
		
		for(int i=0; i<args.length;i++){
					System.out.println(args[i]);
				}
		 
	}

}
