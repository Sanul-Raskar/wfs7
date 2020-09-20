package com.example.pack;

/*
 * Lab Exercise 56
 * Create a class such that it resets the value of the objects it used to null after its usage in all 
	cases.
 * */

public class FinalBlock {

	private String str;

	// parameterized constructor
	public FinalBlock(String str) {
		super();
		this.str = str;
	}

	// Getter and Setter
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public static void main(String[] args) {

		// Create new object reference and assign null value to it
		FinalBlock obj = null;
		// Initialize the object
		obj = new FinalBlock("Sanul");
		int index = 2;

		// Catch exception if index access is out of bound
		try {
			char c = obj.getStr().charAt(index);
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		} finally {
			// This block will execute if exception occurred or not occurred
			// At the end of program assign null value to object
			obj = null;
		}
	}

}
