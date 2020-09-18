package com.example.pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Lab Exercise 16
 * 
	Create a class called Student with the following details: RollNo, StudName, MarksInEng, 
	MarksInMaths and MarksInScience. Write getters and setters for the all variables. RollNo
	should be automatically generated whenever a new student is added.

	Create a class called Standard with 8 students’ details and write separate method for each of 
	the following tasks and invoke the same.
		1.	To display the entire roll no and the name of the students in the class in the ascending order of roll no.
		2.	To display the roll no and the name of the student who has got the highest percentage.
		3.	To display the roll no and the name of the student who scored highest mark in mathematics.
		4.	To display the roll no and the name of the student in the ascending order of the total marks in mathematics and science alone.
		5.	To display the roll no, name, total marks, percentage and rank of all the students in the descending order of rank.

  
 * Created by Sanul Raskar
 * 
 * */

class Student {

	private static int counter = 1;

	private int rollNo;
	private String studName;
	private double marksInEng;
	private double marksInMaths;
	private double marksInScience;

	public Student(String studName, double marksInEng, double marksInMaths, double marksInScience) {
		this.rollNo = counter++;
		this.studName = studName;
		this.marksInEng = marksInEng;
		this.marksInMaths = marksInMaths;
		this.marksInScience = marksInScience;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public double getMarksInEng() {
		return marksInEng;
	}

	public void setMarksInEng(int marksInEng) {
		this.marksInEng = marksInEng;
	}

	public double getMarksInMaths() {
		return marksInMaths;
	}

	public void setMarksInMaths(int marksInMaths) {
		this.marksInMaths = marksInMaths;
	}

	public double getMarksInScience() {
		return marksInScience;
	}

	public void setMarksInScience(int marksInScience) {
		this.marksInScience = marksInScience;
	}
	
	public double calculateTotalMarks() {
		return this.getMarksInEng() + this.getMarksInMaths() + this.getMarksInScience();
	}

	public double calculatePercentage() {
		double average = this.calculateTotalMarks() / 3;
		return average * 100;
	}

	public double totalMathsScience() {
		return this.marksInMaths + this.marksInScience;
	}

}

class MathsCompare implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		if (s1.getMarksInMaths() < s2.getMarksInMaths())
			return -1;
		if (s1.getMarksInMaths() > s2.getMarksInMaths())
			return 1;
		else
			return 0;
	}
}

class TotalMathsScienceCompare implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		if (s1.totalMathsScience() < s2.totalMathsScience())
			return -1;
		if (s1.totalMathsScience() > s2.totalMathsScience())
			return 1;
		else
			return 0;
	}
}

class PercentageCompare implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		if (s1.calculatePercentage() < s2.calculatePercentage())
			return -1;
		if (s1.calculatePercentage() > s2.calculatePercentage())
			return 1;
		else
			return 0;
	}
}

class StudentRankHelper{
	Student stud;
	double totalMarks;
	double percentage;
	
	public StudentRankHelper(Student stud, double totalMarks, double percentage) {
		super();
		this.stud = stud;
		this.totalMarks = totalMarks;
		this.percentage = percentage;
	}
	
	public Student getStud() {
		return stud;
	}
	
	public void setStud(Student stud) {
		this.stud = stud;
	}
	
	public double getTotalMarks() {
		return totalMarks;
	}
	
	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	public double getPercentage() {
		return percentage;
	}
	
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
}

public class Standard {
	private void printList(ArrayList<Student> stud) {
		for (Student s : stud) {
			System.out.println("Roll No.:" + s.getRollNo() + " Name:" + s.getStudName() + " English:"
					+ s.getMarksInEng() + " Maths:" + s.getMarksInMaths() + " Science:" + s.getMarksInScience());
		}
	}
	
	private void rankStudents(ArrayList<Student> stud) {
		ArrayList<StudentRankHelper> studentsRankHelperList = new ArrayList<StudentRankHelper>();
		for(Student s:stud) {
			studentsRankHelperList.add(new StudentRankHelper(s, s.calculateTotalMarks(), s.calculatePercentage()));
		}
	}

	public static void main(String[] args) {

		Standard standardObj = new Standard();
		ArrayList<Student> student = new ArrayList<Student>();

		student.add(new Student("Sanul", 35, 41, 48));
		student.add(new Student("Rahul", 20, 32, 28));
		student.add(new Student("Manas", 10, 30, 28));
		student.add(new Student("Sachin", 30, 20, 37));
		student.add(new Student("Pratik", 30, 42, 46));
		student.add(new Student("Prashant", 23, 34, 38));
		student.add(new Student("Ram", 30, 30, 28));
		student.add(new Student("Shubham", 20, 40, 38));

		System.out.println("Initial List:");
		standardObj.printList(student);
		System.out.println();

		MathsCompare mathsCompare = new MathsCompare();
		Collections.sort(student, mathsCompare);

		Student highestMaths = student.get(student.size() - 1);
		System.out.println("Student with highest marks in Maths: Roll No.: " + highestMaths.getRollNo() + " Name: "
				+ highestMaths.getStudName() + " Maths:" + highestMaths.getMarksInMaths());
		System.out.println();

		PercentageCompare percentComapre = new PercentageCompare();
		Collections.sort(student, percentComapre);
		Student highestPercent = student.get(student.size() - 1);
		System.out.println("Student with highest percentage: Roll No.: " + highestPercent.getRollNo() + " Name: "
				+ highestPercent.getStudName());
		System.out.println();
		
		
		
		TotalMathsScienceCompare totalMathScience = new TotalMathsScienceCompare();
		Collections.sort(student,totalMathScience);
		System.out.println("List of student in ascending order based on total marks of Maths and Science");
		standardObj.printList(student);
		System.out.println();

		
	}
}
