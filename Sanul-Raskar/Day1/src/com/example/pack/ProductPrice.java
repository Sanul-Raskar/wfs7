package com.example.pack;

/*
 * Lab Exercise 12
 * A shopkeeper sells three products whose retail prices are as follows: 
 *	 Product 1 - 22.50
 *   Product 2 - 44.50 
 *   Product 3 - 9.98
 * Write an application that reads a series of pairs of numbers as follows:
 *		a) Product number 
 *		b) Quantity sold
 *
 *  The application should use a switch statement to determine the retail price for each product. It 
 *	should calculate and display the total retail value of all products sold. 
 
 * 
 * Created by Sanul Raskar
 * 
 * */


//Product Class
class Product {
	int productID;
	int quantity;
	double price;

	public Product() {
	}

	// Parameterized constructor
	public Product(int productID, int quantity, double price) {
		this.productID = productID;
		this.quantity = quantity;
		this.price = price;
	}

	// get product price by passing productID
	double getPrice(int productID) {
		switch (productID) {

		case 1:
			return 22.50;

		case 2:
			return 44.50;

		case 3:
			return 9.98;

		default:
			System.out.println("Product not found");
		}
		return 0.0;
	}

}

//Main driver class
public class ProductPrice {

	// Pass array of Product objects
	private double calculateTotal(Product[] arr, int j) {
		double total = 0.0;
		for (int i = 0; i < j; i++) {
			System.out.println("Product Details: ProductID:" + arr[i].productID + " Quantity:" + arr[i].quantity
					+ " Price:" + arr[i].price);
			total += arr[i].price * arr[i].quantity;
		}

		return total;
	}

	public static void main(String[] args) {
		int j = 0;
		// Create array of objects of class Product to save each product data
		Product[] productArray = new Product[10];
		for (int i = 0; i < args.length - 1; i = i + 2) {
			// create new product object by getting data from command line arguments
			Product product = new Product();
			double productPrice = product.getPrice(Integer.parseInt(args[i]));
			// push Product object to array
			productArray[j] = new Product(Integer.parseInt(args[i]), Integer.parseInt(args[i + 1]), productPrice);
			j++;
		}

		ProductPrice obj = new ProductPrice();

		// calculate total by passing object array
		double result = obj.calculateTotal(productArray, j);
		System.out.println("Total retail value of all products sold: " + result);
	}

}



/*
 OUTPUT:
 
PS C:\Users\Sanul Raskar\eclipse-workspace\Day1\src\com\example\pack> javac ProductPrice.java
PS C:\Users\Sanul Raskar\eclipse-workspace\Day1\src\com\example\pack> java ProductPrice 1 3 2 4 3 1
Product Details: ProductID:1 Quantity:3 Price:22.5
Product Details: ProductID:2 Quantity:4 Price:44.5
Product Details: ProductID:3 Quantity:1 Price:9.98
Total retail value of all products sold: 255.48
PS C:\Users\Sanul Raskar\eclipse-workspace\Day1\src\com\example\pack>
  
 * */
