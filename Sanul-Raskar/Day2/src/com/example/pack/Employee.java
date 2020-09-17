package com.example.pack;

/*
 * Lab Exercise 25
 * 
 * All the data members should be initialized using constructors. Use constructor overloading and
 * demonstrate by creating different employee objects.
 * 
 * Created by Sanul Raskar
 * 
 * */

public class Employee {

	private String empName;
	private int empId;
	private int empAge;
	private String empdesgn;
	private String empLocation;
	private int empExpInYrs;

	// Getters and Setters
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpdesgn() {
		return empdesgn;
	}

	public void setEmpdesgn(String empdesgn) {
		this.empdesgn = empdesgn;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public int getEmpExpInYrs() {
		return empExpInYrs;
	}

	public void setEmpExpInYrs(int empExpInYrs) {
		this.empExpInYrs = empExpInYrs;
	}

	// Initialize Employee name
	public Employee(String empName) {
		this.empName = empName;
		this.empId = 0;
		this.empAge = 20;
		this.empdesgn = "Intern";
		this.empLocation = "Hyderabad";
		this.empExpInYrs = 0;
	}

	// Initialize Employee name and id
	public Employee(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
		this.empAge = 20;
		this.empdesgn = "Intern";
		this.empLocation = "Hyderabad";
		this.empExpInYrs = 0;
	}

	// Initialize Employee name, id and age
	public Employee(String empName, int empId, int empAge) {
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empdesgn = "Intern";
		this.empLocation = "Hyderabad";
		this.empExpInYrs = 0;
	}

	// Initialize Employee name, id and designation
	public Employee(String empName, int empId, String empdesgn) {
		this.empName = empName;
		this.empId = empId;
		this.empAge = 20;
		this.empdesgn = empdesgn;
		this.empLocation = "Hyderabad";
		this.empExpInYrs = 0;
	}

	// Initialize Employee name, id, age and designation
	public Employee(String empName, int empId, int empAge, String empdesgn) {
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empdesgn = empdesgn;
		this.empLocation = "Hyderabad";
		this.empExpInYrs = 0;
	}

	// Initialize Employee name, id, age and location
	public Employee(String empName, int empId, String empLocation, int empAge) {
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empdesgn = "Intern";
		this.empLocation = empLocation;
		this.empExpInYrs = 0;
	}

	// Initialize Employee name, id, age and experience
	public Employee(String empName, int empId, int empAge, int empExpInYrs) {
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empdesgn = "Intern";
		this.empLocation = "Hyderabad";
		this.empExpInYrs = empExpInYrs;
	}

	// Initialize Employee name, id, designation and experience
	public Employee(int empId, String empName, String empdesgn, int empExpInYrs) {
		this.empName = empName;
		this.empId = empId;
		this.empAge = 20;
		this.empdesgn = empdesgn;
		this.empLocation = "Hyderabad";
		this.empExpInYrs = empExpInYrs;
	}

	// Initialize Employee name, id, designation, location and experience
	public Employee(String empName, int empId, String empdesgn, String empLocation, int empExpInYrs) {
		this.empName = empName;
		this.empId = empId;
		this.empAge = 20;
		this.empdesgn = empdesgn;
		this.empLocation = empLocation;
		this.empExpInYrs = empExpInYrs;
	}

	// Initialize Employee name, id, age, designation, location and experience
	public Employee(String empName, int empId, int empAge, String empdesgn, String empLocation, int empExpInYrs) {
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empdesgn = empdesgn;
		this.empLocation = empLocation;
		this.empExpInYrs = empExpInYrs;
	}

	public static void main(String[] args) {

		// Object array
		Employee empArray[] = new Employee[10];

		// Create new objects and add to empArray object array
		// Initialize objects using different parameterized constructor
		empArray[0] = new Employee("Sanul1R");
		empArray[1] = new Employee("Sanul2R", 2);
		empArray[2] = new Employee("Sanul3R", 3, 25);
		empArray[3] = new Employee("Sanul4R", 4, "TSE");
		empArray[4] = new Employee("Sanul5R", 5, 30, "SD");
		empArray[5] = new Employee("Sanul6R", 6, 26, "Pune");
		empArray[6] = new Employee("Sanul7R", 7, 27, 5);
		empArray[7] = new Employee(8, "Sanul8R", "Manager", 9);
		empArray[8] = new Employee("Sanul9R", 9, "SD", "Mumbai", 2);
		empArray[9] = new Employee("SanulR", 10, 22, "Manager", "Delhi", 4);

		// Print array to display object contents
		for (int i = 0; i < 10; i++) {
			System.out.println("EmpID:" + empArray[i].getEmpId() + ", Name:" + empArray[i].getEmpName() + ", Age:"
					+ empArray[i].getEmpAge() + ", Designation:" + empArray[i].getEmpdesgn() + ", Experience:"
					+ empArray[i].getEmpExpInYrs() + ", Location:" + empArray[i].getEmpLocation());
		}

	}

}
