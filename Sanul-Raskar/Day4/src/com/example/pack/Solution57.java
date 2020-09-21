package com.example.pack;

/*
 * Lab Exercise 57
 * 
 * Create a class such that a method uses the try catch block with the return type of String.
 * 
 * Created By: Sanul Raskar
 * */

public class Solution57 {
	private String str;

	public Solution57() {
		this.str = "";
	}

	public Solution57(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	private String getSubstring() {
		String result = "";
		int startIndex = 0, endIndex = 6;
		boolean exceptionFlag = false;

		// Handle exception if illegal index of string is tried to access
		try {
			// Store sub string in result variable
			result = str.substring(startIndex, endIndex);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
			exceptionFlag = true;
		} finally {
			// If exception occurred then return empty string
			if (exceptionFlag)
				result = "";
		}

		// return generated substring
		return result;
	}

	public static void main(String[] args) {
		// Create new object and initialize the str variable
		Solution57 obj = new Solution57("Hello World");

		// Get substring from method
		String s = obj.getSubstring();

		// if exception occurs then the getSubstring method will return empty string or
		// else print obtained string
		if (s.equals(""))
			System.out.println("Empty String");
		else
			System.out.println("Substring: " + s);

	}

}
