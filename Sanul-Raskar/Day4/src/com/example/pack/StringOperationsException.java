package com.example.pack;

public class StringOperationsException {

	private String str;

	public StringOperationsException(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	private void splitString(String s) {
		// Catch exception if out of bound index is tried to access
		try {
			// Get index of char 'f' from the string s
			int endIndex = s.indexOf("fox", 0);

			// create a substring from index 0 to the word fox
			String subString1 = s.substring(0, endIndex + 3);

			// create another substring starting after word fox till end
			String subString2 = s.substring(endIndex + 4);

			System.out.println("String 1: " + subString1);
			System.out.println("String 2: " + subString2);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

	private void printAnimalNames(String s) {
		// Catch exception if out of bound index is tried to access
		try {
			// Get index of letter f
			int foxIndex = s.indexOf("fox");
			// Print substring starting from index of f and end after index + 3
			System.out.println(s.substring(foxIndex, foxIndex + 3));

			// Get index of letter d
			int dogIndex = s.indexOf("dog");
			// Print substring starting from index of d and end after index + 3
			System.out.println(s.substring(dogIndex, dogIndex + 3));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		StringOperationsException obj = new StringOperationsException("The quick brown fox jumps over the lazy dog");

		try {
			// Print original string
			System.out.println("Original String: " + obj.getStr());

			// Catch Exception if program tries to access index out of bound
			try {
				// Print character at 12th index
				System.out.println("\nCharacter at 12th index: " + obj.getStr().charAt(12));
			} catch (StringIndexOutOfBoundsException e) {
				System.out.println(e);
			}

			// Check it string contain 'is'
			System.out.println("\nWeather string contains 'is'?: " + obj.getStr().contains("is"));

			// append 'and killed it' to string
			System.out.println("\nAdd the string “and killed it” to the existing string. New string ->: "
					+ obj.getStr().concat(" and killed it"));

			// Check whether string ends with 'dogs'
			System.out.println("\nWhether string ends with 'dogs'?: " + obj.getStr().endsWith("dogs"));

			// Check whether original string is equal with given string
			System.out.println("\nIs equal with 'The quick brown Fox jumps over the lazy Dog'? (Case sensitive): "
					+ obj.getStr().equals("The quick brown Fox jumps over the lazy Dog"));
			System.out.println("\nIs equal with 'The quick brown Fox jumps over the lazy Dog'? (Case insensitive): "
					+ obj.getStr().equalsIgnoreCase("The quick brown Fox jumps over the lazy Dog"));
			System.out.println("\nIs equal with 'THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG'? (Case sensitive): "
					+ obj.getStr().equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
			System.out.println("\nIs equal with 'THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG'? (Case insensitive): "
					+ obj.getStr().equalsIgnoreCase("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));

			// Print first occurred index position of given character
			System.out.println("\nThe index position of the character 'a': " + obj.getStr().indexOf("a"));

			System.out.println("\nThe last index position of the character 'e': " + obj.getStr().lastIndexOf("e"));

			// Print length of string
			System.out.println("\nThe length of string: " + obj.getStr().length());

			System.out.println("\nWhether the string matches to 'The quick brown Fox jumps over the lazy Dog': "
					+ obj.getStr().matches("The quick brown Fox jumps over the lazy Dog"));

			// Replace word in string with given word
			System.out.println(
					"\nReplace the word 'The' with the word 'A'. New String ->" + obj.getStr().replace("The", "A"));

			// Split the string such that two animals do not come in single string
			System.out.println("\nSplit the above string into two such that two animal names do not come together :");
			obj.splitString(obj.getStr());

			// Print animal names from string
			System.out.println("\nPrint the animal names alone separately from the above string.");
			obj.printAnimalNames(obj.getStr());

			// Print string in uppercase and lowercase
			System.out.println("\nString in completely in lowercase: " + obj.getStr().toLowerCase());
			System.out.println("\nString in completely in uppercase: " + obj.getStr().toUpperCase());
		} catch (NullPointerException e) {
			System.out.println(e);
		}

	}
}
