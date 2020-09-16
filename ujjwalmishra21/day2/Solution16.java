package com.hsbc.day2;

import java.util.Arrays;

public class Solution16 {

	public static void main(String[] args) {
		
		Student[] students = new Student[8];
		
		students[0] = new Student("Amit", 56, 91.5, 86.5);
		students[1] = new Student("Aditya", 87, 78, 84);
		students[2] = new Student("Dinesh", 67.5, 82, 65);
		students[3] = new Student("Sanchit", 91, 98, 89);
		students[4] = new Student("Ramesh", 56, 33, 46);
		students[5] = new Student("Dinkar", 76, 73, 79);
		students[6] = new Student("Sachin", 93.5, 91.5, 98.5);
		students[7] = new Student("Aayush", 95, 95, 76);
		
		for(int i = 0; i < students.length; i++)
			students[i].getDetails();
		
		System.out.println();
		
		Student.getEnglishMax();
		Student.getMathsMax();
		Student.getScienceMax();	
		
		System.out.println();
		
		Arrays.sort(students);
		for(int i = 0; i < students.length; i++) {
			int rank = i + 1;
			System.out.println("Rank " + rank + " : " + students[i]);
		}

	}

}

class Student implements Comparable<Student>{
	private static int count = 0;
	private static double maxMarksInEng = Double.MIN_VALUE;
	private static int maxMarksEnglishRollNo = -1;
	
	private static double maxMarksInMaths = Double.MIN_VALUE;
	private static int maxMarksMathsRollNo = -1;
			
	private static double maxMarksInScience = Double.MIN_VALUE;
	private static int maxMarksScienceRollNo = -1; 
	
	private int rollNo;
	private String studName;
	
	private double marksInEng;
	private double marksInMaths;
	private double marksInScience;
	private double averageMarks;
	private double total;
	
	public Student(String studName, double marksInEng, double marksInMaths, double marksInScience) {
		super();
		count++;
		this.rollNo = count;
		this.studName = studName;
		this.marksInEng = marksInEng;
		this.marksInMaths = marksInMaths;
		this.marksInScience = marksInScience;	
		this.total = (marksInEng + marksInMaths + marksInScience);
		this.averageMarks = this.total / (double)3;
		this.computeMaxMarks();	
	}
	
	public void computeMaxMarks() {
		if(this.marksInEng > maxMarksInEng) {
			maxMarksInEng = this.marksInEng;
			maxMarksEnglishRollNo = this.rollNo;
		}
		if(this.marksInMaths > maxMarksInMaths) {
			maxMarksInMaths = this.marksInMaths;
			maxMarksMathsRollNo = this.rollNo;			
		}
		if(this.marksInScience > maxMarksInScience) {
			maxMarksInScience = this.marksInScience;
			maxMarksScienceRollNo = this.rollNo;
		}
	}
	
	public static void getMathsMax() {
		System.out.println("Max marks in Maths: " + maxMarksInMaths);
		System.out.println("Obtained by Roll No.: " + maxMarksMathsRollNo);
		System.out.println();
	}
	
	public static void getEnglishMax() {
		System.out.println("Max marks in English: " + maxMarksInEng);
		System.out.println("Obtained by Roll No.: " + maxMarksEnglishRollNo);
		System.out.println();
	}
	
	public static void getScienceMax() {
		System.out.println("Max marks in Science: " + maxMarksInScience);
		System.out.println("Obtained by Roll No.: " + maxMarksScienceRollNo);
		System.out.println();
	}
	
	public void getDetails() {
		System.out.println("Roll No.:" + this.rollNo + "  Name: " + this.studName);
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
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getAverageMarks() {
		return averageMarks;
	}

	public void setAverageMarks(double averageMarks) {
		this.averageMarks = averageMarks;
	}

	public void setMarksInEng(double marksInEng) {
		this.marksInEng = marksInEng;
	}
	public double getMarksInMaths() {
		return marksInMaths;
	}
	public void setMarksInMaths(double marksInMaths) {
		this.marksInMaths = marksInMaths;
	}
	public double getMarksInScience() {
		return marksInScience;
	}
	public void setMarksInScience(double marksInScience) {
		this.marksInScience = marksInScience;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studName=" + studName + ", averageMarks=" + averageMarks + ", total="
				+ total + "]";
	}

	@Override
	public int compareTo(Student student) {
		return (int)(student.total - this.total);
	}
	
	
}
