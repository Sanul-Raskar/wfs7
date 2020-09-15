/**
 * 
 */
package com.hsbc.pack;

/**
 * @author mrunal
 *
 */

// Eggs gross, dozen, leftover calculations
public class Eggs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalEggs = Integer.parseInt(args[0]);
		
		int gross = totalEggs/144;
		int remain = totalEggs%144;
		int dozen = remain/12;
		remain=remain%12;
		
		  System.out.println(gross +" gross eggs");    
		  System.out.println(dozen +" dozen eggs");    
		  System.out.println(remain +" leftover eggs");    
				 
	}

}
