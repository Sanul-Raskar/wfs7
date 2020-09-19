package com.example.pack;

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

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {

	// Static variable initialized to 1
	private static int counter = 1;

	private int rollNo;
	private String studName;
	private double marksInEng;
	private double marksInMaths;
	private double marksInScience;

	public Student(String studName, double marksInEng, double marksInMaths, double marksInScience) {
		// Static variable used to assign roll number dynamically
		this.rollNo = counter++;
		this.studName = studName;

		// Check if user entered negative marks then assign 0
		if (marksInEng < 0)
			this.marksInEng = 0;
		else
			this.marksInEng = marksInEng;

		if (marksInMaths < 0)
			this.marksInMaths = 0;
		else
			this.marksInMaths = marksInMaths;

		if (marksInScience < 0)
			this.marksInScience = 0;
		else
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
		double total = this.calculateTotalMarks();
		if (total > 0) {
			return ((total / 150) * 100);
		} else {
			return 0;
		}

	}

	public double totalMathsScience() {
		return this.marksInMaths + this.marksInScience;
	}

}

//StudentRankHelper class is used to store total marks and percentage while calculating rank
class StudentRankHelper implements Comparable<StudentRankHelper> {
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

	// Sort array in ascending order using student percentage as parameter
	@Override
	public int compareTo(StudentRankHelper s) {
		if (this.getPercentage() < s.getPercentage())
			return -1;
		if (this.getPercentage() > s.getPercentage())
			return 1;
		else
			return 0;
	}

}

//Used to compare list elements based on roll number. Sorts in ascending order
class RollNoCompare implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		if (s1.getRollNo() < s2.getRollNo())
			return -1;
		if (s1.getRollNo() > s2.getRollNo())
			return 1;
		else
			return 0;
	}
}

//Used to compare list elements based on maths mark. Sorts in ascending order
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

//Used to compare list elements based on total marks of maths and Science. Sorts in ascending order
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

//Used to compare list elements based on percentage. Sorts in ascending order
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

public class Standard {

	// To print double data type upto two decimal points
	private static DecimalFormat df2 = new DecimalFormat("#.##");

	// Print array of student objects
	private void printList(ArrayList<Student> stud) {
		for (Student s : stud) {
			System.out.println("Roll No.:" + s.getRollNo() + " Name:" + s.getStudName() + " English:"
					+ s.getMarksInEng() + " Maths:" + s.getMarksInMaths() + " Science:" + s.getMarksInScience());
		}
	}

	private void rankStudents(ArrayList<Student> stud) {
		// Create new array of objects of class StudentRankHelper
		ArrayList<StudentRankHelper> studentsRankHelperList = new ArrayList<StudentRankHelper>();

		// Add student object,total marks and percentage to the array
		for (Student s : stud) {
			studentsRankHelperList.add(new StudentRankHelper(s, s.calculateTotalMarks(), s.calculatePercentage()));
		}

		// Use Collection sort method to sort student array based on percentage
		Collections.sort(studentsRankHelperList);

		System.out.println("Students displayed in descending order based on their rank");
		for (int i = 0, j = studentsRankHelperList.size(); i < studentsRankHelperList.size() && j > 0; i++, j--) {
			StudentRankHelper s = studentsRankHelperList.get(i);
			System.out.println("Rank:" + j + ", Percentage:" + df2.format(s.percentage) + ", Total:" + s.totalMarks
					+ ", Roll No.:" + s.stud.getRollNo() + ", Name:" + s.stud.getStudName());
		}
		System.out.println();

	}

	private void printRollNoAscending(ArrayList<Student> student) {
		// Create a object of comparator class RollNoCompare
		RollNoCompare rollNoCompare = new RollNoCompare();
		// Use Collection sort method to sort student array based on Roll number
		Collections.sort(student, rollNoCompare);

		// Display complete array
		System.out.println("Students displayed in ascending order based on their roll number:");
		this.printList(student);
		System.out.println();

	}

	private void highestMath(ArrayList<Student> student) {
		// Create a object of comparator class MathsCompare
		MathsCompare mathsCompare = new MathsCompare();
		// Use Collection sort method to sort student array based on maths marks
		Collections.sort(student, mathsCompare);
		// As array sorted in ascending order, highest maths mark student will be last
		Student highestMaths = student.get(student.size() - 1);

		// Print roll number,name and maths marks of the student with highest marks
		System.out.println("Student with highest marks in Maths: Roll No.: " + highestMaths.getRollNo() + " Name: "
				+ highestMaths.getStudName() + " Maths:" + highestMaths.getMarksInMaths());
		System.out.println();
	}

	private void highestPercentage(ArrayList<Student> student) {
		// Create a object of comparator class PercentageCompare
		PercentageCompare percentComapre = new PercentageCompare();
		// Use Collection sort method to sort student array based on percentage
		Collections.sort(student, percentComapre);
		// As array sorted in ascending order, highest percentage student will be last
		Student highestPercent = student.get(student.size() - 1);

		// Print roll number and name of the student with highest marks
		System.out.println("Student with highest percentage: Roll No.: " + highestPercent.getRollNo() + " Name: "
				+ highestPercent.getStudName());
		System.out.println();
	}

	private void listTotalMathScience(ArrayList<Student> student) {
		// Create a object of comparator class TotalMathsScienceCompare
		TotalMathsScienceCompare totalMathScience = new TotalMathsScienceCompare();
		// Use Collection sort method to sort student array based on total marks
		// obtained in Maths and science
		Collections.sort(student, totalMathScience);

		// Display complete sorted list
		System.out.println("List of student in ascending order based on total marks of Maths and Science");
		this.printList(student);
		System.out.println();

	}

	public static void main(String[] args) {

		// Create an object of Standard class
		Standard standardObj = new Standard();
		// Create an array of Student objects
		ArrayList<Student> student = new ArrayList<Student>();

		// Create new students and add to array
		student.add(new Student("Sanul", 35, 41, 48));
		student.add(new Student("Rahul", 20, 32, 28));
		student.add(new Student("Manas", 10, 30, 28));
		student.add(new Student("Sachin", 30, 20, 37));
		student.add(new Student("Pratik", 30, 42, 46));
		student.add(new Student("Prashant", 23, 34, 38));
		student.add(new Student("Ram", 0, 0, -34));
		student.add(new Student("Shubham", 20, 40, 38));

		System.out.println("Initial List:");
		standardObj.printList(student);
		System.out.println();

		// Invoke all methods
		standardObj.highestMath(student);

		standardObj.highestPercentage(student);

		standardObj.listTotalMathScience(student);

		standardObj.rankStudents(student);

		standardObj.printRollNoAscending(student);

	}
}

/*
 Output:
 
Initial List:
Roll No.:1 Name:Sanul English:35.0 Maths:41.0 Science:48.0
Roll No.:2 Name:Rahul English:20.0 Maths:32.0 Science:28.0
Roll No.:3 Name:Manas English:10.0 Maths:30.0 Science:28.0
Roll No.:4 Name:Sachin English:30.0 Maths:20.0 Science:37.0
Roll No.:5 Name:Pratik English:30.0 Maths:42.0 Science:46.0
Roll No.:6 Name:Prashant English:23.0 Maths:34.0 Science:38.0
Roll No.:7 Name:Ram English:0.0 Maths:0.0 Science:0.0
Roll No.:8 Name:Shubham English:20.0 Maths:40.0 Science:38.0

Student with highest marks in Maths: Roll No.: 5 Name: Pratik Maths:42.0

Student with highest percentage: Roll No.: 1 Name: Sanul

List of student in ascending order based on total marks of Maths and Science
Roll No.:7 Name:Ram English:0.0 Maths:0.0 Science:0.0
Roll No.:4 Name:Sachin English:30.0 Maths:20.0 Science:37.0
Roll No.:3 Name:Manas English:10.0 Maths:30.0 Science:28.0
Roll No.:2 Name:Rahul English:20.0 Maths:32.0 Science:28.0
Roll No.:6 Name:Prashant English:23.0 Maths:34.0 Science:38.0
Roll No.:8 Name:Shubham English:20.0 Maths:40.0 Science:38.0
Roll No.:5 Name:Pratik English:30.0 Maths:42.0 Science:46.0
Roll No.:1 Name:Sanul English:35.0 Maths:41.0 Science:48.0

Students displayed in descending order based on their rank
Rank:8, Percentage:0, Total:0.0, Roll No.:7, Name:Ram
Rank:7, Percentage:45.33, Total:68.0, Roll No.:3, Name:Manas
Rank:6, Percentage:53.33, Total:80.0, Roll No.:2, Name:Rahul
Rank:5, Percentage:58, Total:87.0, Roll No.:4, Name:Sachin
Rank:4, Percentage:63.33, Total:95.0, Roll No.:6, Name:Prashant
Rank:3, Percentage:65.33, Total:98.0, Roll No.:8, Name:Shubham
Rank:2, Percentage:78.67, Total:118.0, Roll No.:5, Name:Pratik
Rank:1, Percentage:82.67, Total:124.0, Roll No.:1, Name:Sanul

Students displayed in ascending order based on their roll number:
Roll No.:1 Name:Sanul English:35.0 Maths:41.0 Science:48.0
Roll No.:2 Name:Rahul English:20.0 Maths:32.0 Science:28.0
Roll No.:3 Name:Manas English:10.0 Maths:30.0 Science:28.0
Roll No.:4 Name:Sachin English:30.0 Maths:20.0 Science:37.0
Roll No.:5 Name:Pratik English:30.0 Maths:42.0 Science:46.0
Roll No.:6 Name:Prashant English:23.0 Maths:34.0 Science:38.0
Roll No.:7 Name:Ram English:0.0 Maths:0.0 Science:0.0
Roll No.:8 Name:Shubham English:20.0 Maths:40.0 Science:38.0


 * */