/**
 * 
 */
package com.hsbc.pack;

/**
 * @author mrunal
 *
 */
public class Product {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2 }, { 3, 4 }, {2, 5} };
		
		for(int i=0; i<arr.length;i++){
			
			switch (arr[i][0]){
			case 1:
				  System.out.println("Retail Price: 22.50 ");    
				  System.out.println("Total Retail Value:  " + (arr[i][1])* 22.50);    
					break;	 
			case 2:
				  System.out.println("Retail Price: 44.50 ");    
				  System.out.println("Total Retail Value:  " + (arr[i][1])* 44.50);    
					break;
			case 3:
				  System.out.println("Retail Price: 9.98 ");    
				  System.out.println("Total Retail Value:  " + (arr[i][1])* 9.98);    
					break;
			
			}
			
		}  
		
	}

}
