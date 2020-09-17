package com.hsbc.day3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 	Program allows employees to:
 	>> register for various courses avaliable
 	>> de-register for the courses
 	>> list employees enrolled in a course
 	>> list courses
 	
 */
/*
 	Employees attributes :
 	empId, empName - stored as key-value pair in hashMap 
 					with key as empId and value as empName
 */

public class Solution42 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Course course1 = new OfflineCourse(1, "Java Spring Boot", false);
		Course course2 = new OfflineCourse(2, "Google Cloud Developer", true);
		
		Course course3 = new OnlineCourse(3, "React FrontEnd", true);
		Course course4 = new OnlineCourse(4, "Angular FrontEnd", false);
		
		Course []courses = {course1, course2, course3, course4};
		
		HashMap<Integer, String> employees = new HashMap<Integer, String>();
		employees.put(1,"Aditya");
		employees.put(2,"Mohit");
		employees.put(3,"Shalabh");
		employees.put(4,"Rachit");
		employees.put(5,"Vareesh");
		employees.put(6,"Tribhuvan");
		
		boolean exit = false;
		while(!exit) {
			System.out.println("Enter the number of the choice you want to choose:");
			System.out.println("1. To register for a course");
			System.out.println("2. To deregister for a course");
			System.out.println("3. To list the courses offered");
			System.out.println("4. To list employees for specific course\n");
			
			int num = sc.nextInt();
			
			switch(num) {
				case 1:
					register(courses, employees);
					break;
				case 2:
					deRegister(courses, employees);
;					break;
				case 3:
					listCourses(courses);
					break;
				case 4:
					listEmployeesByCourse(courses, employees);
					break;
				default:
					System.out.println("Exiting......");
					System.out.println();
					exit = true;
					break;
			}
		}
		
		
	}
	/*
	 	Following stages for register:
	 	1. Employee inputs employee id
	 	2. If employee id valid then courses are listed
	 	3. Employee inputs then a course id to be  enrolled.
	 	4. If course id valid then user is registered
	 */
	
	public static void register(Course courses[], HashMap<Integer, String> employees) {
		System.out.println("Enter your Employee ID: ");
		int empId = sc.nextInt();
		System.out.println();
		
		if(!employees.containsKey(empId)) {
			System.out.println("Employee ID does not exist");
			System.out.println();
			return;
		}
		
		System.out.println("Course Available: ");
		listCourses(courses);
		
		System.out.println("Enter single Course ID to enroll: ");
		int courseId = sc.nextInt();
		
		if(courseId <= 0 || courseId > courses.length) {
			System.out.println("Invalid CourseId");
			System.out.println();
			return;
		}
		
		String response = courses[courseId - 1].registerEmployee(empId, employees.get(empId));
		System.out.println(response);
		
	}
	
	/*
	 		Following stages for de-register:
	 	1. Employee inputs employee id
	 	2. If employee id valid then courses are listed to unenrollment
	 	3. Employee inputs the a course id to de-register.
	 	4. If course id valid then user is de-registered
	 */
	
	public static void deRegister(Course courses[], HashMap<Integer, String> employees) {
		System.out.println("Enter your Employee ID: ");
		int empId = sc.nextInt();
		System.out.println();
		
		if(!employees.containsKey(empId)) {
			System.out.println("Employee ID does not exist");
			System.out.println();
			return;
		}
		
		System.out.println("Course Available: ");
		listCourses(courses);
		
		System.out.println("Enter Course ID to de-register: ");
		int courseId = sc.nextInt();
		
		if(courseId <= 0 || courseId > courses.length) {
			System.out.println("Invalid CourseId");
			System.out.println();
			return;
		}
		
		String response = courses[courseId - 1].deRegisterEmployee(empId, employees.get(empId));
		System.out.println(response);
		
	}
	
	public static void listCourses(Course courses[]) {
		
		for(Course course : courses)
			System.out.println(course.getCourseDetails());
		System.out.println();
	}
	/*
	 	Following steps followed to list employees in a course:
	 	1. User inputs course id
	 	2. If course id valid then employee ids for the course are returned
	 	3. Employee ids are mapped to corresponding name and displayed
	 */
	
	public static void listEmployeesByCourse(Course courses[], HashMap<Integer, String> employees) {
		System.out.println("Type Course ID to get employees list:");
		listCourses(courses);
		int courseId = sc.nextInt();
		if(courseId <= 0 || courseId > courses.length)
			return;
		Set<Integer> employeesId = courses[courseId - 1].getEmployees();
		if (employees.size() == 0) {
			System.out.println("No registrations yet!");
			return;
		}
		
		for(int empId : employeesId) {
			System.out.println("Employee[ ID:" + empId + ", " + employees.get(empId) + " ]");
		}
		System.out.println();
	}
}
/*
 	>>Course contains courseId, courseName, isFullTime(to find out whether course is full-time or part-time
 	>>A Set is used to store all the employees enrolled in a course
 	>>Set containing employee ids is used to store employees registered for a course.
 	>>To de-register employee from a course, employee  id is removed from the course.
 */
abstract class Course{
	public abstract String getCourseDetails();
	public abstract String registerEmployee(int empId, String empName);
	public abstract String deRegisterEmployee(int empId, String empName);
	public abstract Set<Integer> getEmployees();
	
}

class OfflineCourse extends Course{
	int courseId;
	String courseName;
	boolean isFullTime;
	Set<Integer> employees;
	
	public OfflineCourse(int courseId, String courseName, boolean isFullTime) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.isFullTime = isFullTime;
		employees = new HashSet<Integer>();
	}

	public String getCourseDetails() {
		String type = (this.isFullTime) ? "Full Time" : "Part Time";
		return "Course[ Offline, " + courseId + ", " + courseName + ", " + type + "]";
	}

	@Override
	public String registerEmployee(int empId, String empName) {
		this.employees.add(empId);
		return "Employee[" + empId + ", " + empName +"] successfully registered";
	}

	@Override
	public String deRegisterEmployee(int empId, String empName) {
		if(!this.employees.contains(empId))
				return "Employee should register for the course";
		this.employees.remove(empId);
		return "Employee[" + empId + ", " + empName +"] successfully de-registered";
	}

	@Override
	public Set<Integer> getEmployees() {
		return this.employees;
	}
	
}

class OnlineCourse extends Course{
	int courseId;
	String courseName;
	boolean isFullTime;
	Set<Integer> employees;
	
	public OnlineCourse(int courseId, String courseName, boolean isFullTime) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.isFullTime = isFullTime;
		employees = new HashSet<Integer>();
	}

	public String getCourseDetails() {
		String type = (this.isFullTime) ? "Full Time" : "Part Time";
		return "Course[ Online, " + courseId + ", " + courseName + ", " + type + "]";
	}

	@Override
	public String registerEmployee(int empId, String empName) {
		this.employees.add(empId);
		return "Employee[" + empId + ", " + empName +"] successfully registered";
	}

	@Override
	public String deRegisterEmployee(int empId, String empName) {
		if(!this.employees.contains(empId))
				return "Employee should register for the course";
		this.employees.remove(empId);
		return "Employee[" + empId + ", " + empName +"] successfully de-registered";
	}

	@Override
	public Set<Integer> getEmployees() {
		return this.employees;
	}
	
}



class Employee{
	private int empId;
	private String empName;
	
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}
	
}
