package com.example.pack;

/*
 * Lab Exercise 17
 * String Operations
 * Created by Sanul Raskar
 * 
 * */

public class StringOperations {

	private String str ;
	
	public StringOperations(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	
	private void splitString(String s) {
		//Get index of char 'f' from the string s
		int endIndex = s.indexOf("fox",0);
		
		//create a substring from index 0 to the word fox
		String subString1 = s.substring(0, endIndex + 3);
		
		//create another substring starting after word fox till end
		String subString2 = s.substring(endIndex + 4);
		
		System.out.println("String 1: " + subString1);
		System.out.println("String 2: " + subString2);
	}
	
	private void printAnimalNames(String s) {
		//Get index of letter f
		int foxIndex = s.indexOf("fox");
		//Print substring starting from index of f and end after index + 3
		System.out.println(s.substring(foxIndex, foxIndex+3));
		
		//Get index of letter d
		int dogIndex = s.indexOf("dog");
		//Print substring starting from index of d and end after index + 3
		System.out.println(s.substring(dogIndex, dogIndex+3));
	}
	
	
	public static void main(String[] args) {
		StringOperations obj = new StringOperations("The quick brown fox jumps over the lazy dog");
		
		//Print original string
		System.out.println("Original String: " + obj.getStr());
		
		//Print character at 12th index
		System.out.println("\nCharacter at 12th index: " + obj.getStr().charAt(12));
		
		//Check it string contain 'is'
		System.out.println("\nWeather string contains 'is'?: " + obj.getStr().contains("is"));
		
		//append 'and killed it' to string
		System.out.println("\nAdd the string “and killed it” to the existing string. New string ->: " + obj.getStr().concat(" and killed it"));
		
		//Check whether string ends with 'dogs'
		System.out.println("\nWhether string ends with 'dogs'?: " + obj.getStr().endsWith("dogs"));
		
		//Check whether original string is equal with given string
		System.out.println("\nIs equal with 'The quick brown Fox jumps over the lazy Dog'? (Case sensitive): " + obj.getStr().equals("The quick brown Fox jumps over the lazy Dog"));
		System.out.println("\nIs equal with 'The quick brown Fox jumps over the lazy Dog'? (Case insensitive): " + obj.getStr().equalsIgnoreCase("The quick brown Fox jumps over the lazy Dog"));
		System.out.println("\nIs equal with 'THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG'? (Case sensitive): " + obj.getStr().equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		System.out.println("\nIs equal with 'THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG'? (Case insensitive): " + obj.getStr().equalsIgnoreCase("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		
		//Print first occurred index position of given character
		System.out.println("\nThe index position of the character 'a': " + obj.getStr().indexOf("a"));
		
		
		System.out.println("\nThe last index position of the character 'e': " + obj.getStr().lastIndexOf("e"));
		
		//Print length of string
		System.out.println("\nThe length of string: " + obj.getStr().length());
		
		
		System.out.println("\nWhether the string matches to 'The quick brown Fox jumps over the lazy Dog': " + obj.getStr().matches("The quick brown Fox jumps over the lazy Dog"));
		
		//Replace word in string with given word
		System.out.println("\nReplace the word 'The' with the word 'A'. New String ->" + obj.getStr().replace("The", "A"));
		
		//Split the string such that two animals do not come in single string
		System.out.println("\nSplit the above string into two such that two animal names do not come together :");
		obj.splitString(obj.getStr());
		
		//Print animal names from string
		System.out.println("\nPrint the animal names alone separately from the above string.");
		obj.printAnimalNames(obj.getStr());

		//Print string in uppercase and lowercase
		System.out.println("\nString in completely in lowercase: " + obj.getStr().toLowerCase());
		System.out.println("\nString in completely in uppercase: " + obj.getStr().toUpperCase());


	}

}



/*
OUTPUT:

Original String: The quick brown fox jumps over the lazy dog

Character at 12th index: o

Weather string contains 'is'?: false

Add the string “and killed it” to the existing string. New string ->: The quick brown fox jumps over the lazy dog and killed it

Whether string ends with 'dogs'?: false

Is equal with 'The quick brown Fox jumps over the lazy Dog'? (Case sensitive): false

Is equal with 'The quick brown Fox jumps over the lazy Dog'? (Case insensitive): true

Is equal with 'THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG'? (Case sensitive): false

Is equal with 'THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG'? (Case insensitive): true

The index position of the character 'a': 36

The last index position of the character 'e': 33

The length of string: 43

Whether the string matches to 'The quick brown Fox jumps over the lazy Dog': false

Replace the word 'The' with the word 'A'. New String ->A quick brown fox jumps over the lazy dog

Split the above string into two such that two animal names do not come together :
String 1: The quick brown fox
String 2: jumps over the lazy dog

Print the animal names alone separately from the above string.
fox
dog

String in completely in lowercase: the quick brown fox jumps over the lazy dog

String in completely in uppercase: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG

*/







