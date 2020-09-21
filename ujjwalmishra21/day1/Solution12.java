package com.hsbc.assignments;

/*
 : A shopkeeper sells three products whose retail prices are as follows: 
Product 1 - 22.50
              Product 2 - 44.50 
              Product 3 - 9.98
Write an application that reads a series of pairs of numbers as follows:
 a) Product number 
 b) Quantity sold

                The application should use a switch statement to determine the retail price for each product. It 
should calculate and display the total retail value of all products sold

 */
public class Solution12 {
	/*args contains pair of number with
	 first of the pair - productNumber
	 second of the pair - quantity*/	
	public static void main(String args[]) {
		try {
			double totalCost = 0;
			
			for(int i = 0; i < args.length; i += 2) {
				double cost = getProductPrice(Integer.parseInt(args[i]));
				int quantity = Integer.parseInt(args[i+1]);
				totalCost += cost*quantity;
			}
			
			System.out.println("Total Cost: " + totalCost);
			
		}catch(Exception exception) {
			System.out.println("Exception: " + exception.getMessage());
		}
		
	}
	/*
	 * Method is used to get the price of product on the basis of productNumber
	 */
	public static double getProductPrice(int productNumber) {
		double price = 0;
		switch(productNumber) {
			case 1:
				price = 22.50;
				break;
			case 2:
				price = 44.50;
				break;
			case 3:
				price = 9.98;
				break;
			default:
				break;
		}
		
		return price;
	}

}
