package com.hsbc.pack;

public class SecondProgramSwith {

	
	public static void main(String p[]) {
		
		String color ="Bluee";
		String shirt =" Shirt";
		switch(color) {
		case "Red":
			shirt="Red" +shirt;
			break;
		case "Blue":
			shirt="Blue" +shirt;
			break;
		default:
			shirt="White"+shirt;
		
		}
		System.out.println("Value is "+shirt);
		
	}
}
