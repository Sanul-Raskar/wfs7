package com.example.pack;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		String name, degree;
		double totalMarks, percentage;
		int age;

		try {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter your name: ");
			name = in.nextLine();

			System.out.print("Enter your age:");
			age = in.nextInt();

			System.out.print("Enter your degree:");
			degree = in.next();

			System.out.print("Enter your total marks:");
			totalMarks = in.nextDouble();

			System.out.print("Enter your percentage:");
			percentage = in.nextDouble();
			in.close();

			System.out.println();
			System.out.println("Name is: " + name);
			System.out.println("Age is: " + age);
			System.out.println("Degree is: " + degree);
			System.out.println("Total mark is: " + totalMarks);
			System.out.println("Percentage is: " + percentage);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
