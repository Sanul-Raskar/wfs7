package com.hsbc.day2;

/*
		 	Create a class called employee with the following data members
		1.	empName
		2.	empId
		3.	empAge
		4.	empdesgn
		5.	empLocation
		6.	empExpInYrs
		
		All these data members should be initialized using constructors. Use constructor overloading 
		and demonstrate by creating different employee objects with
		
		1.	Employee  name alone
		2.	Employee name and id
		3.	Employee name, id and age
		4.	Employee name, id and designation
		5.	Employee name, id, age and designation
		6.	Employee name, id, age and location
		7.	Employee name, id, age and experience
		8.	 Employee name, id, designation and experience
		9.	Employee name, id, designation, location and experience
		10.	Employee name, id, age, designation,  location and experience

 */

public class Solution25 {

	public static void main(String[] args) {
		Employee[] employees = new Employee[9];
		
		employees[0] = new Employee("Aditya");
		employees[1] = new Employee("Ritesh", 1);
		employees[2] = new Employee("Calvin", 2, 26);
		employees[3] = new Employee("Dhruv", 3, "Intern");
		employees[4] = new Employee("Farhan", 4, 27, 3);
		employees[5] = new Employee("Gurleen", 5, 31, "Senior Developer");
		employees[6] = new Employee("Raju", 6, "Developer", 2);
		employees[7] = new Employee("Ronit", 7, "Manager", "Gurugram", 10);
		employees[8] = new Employee("Rahman", 8, 35, "Technical Lead", "Pune", 13);
		
		for(int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
		System.out.println();
			
	}

}

class Employee{
	
	private String empName;
	private int empId;
	private int empAge;
	private String empDesgn;
	private String empLocation;
	private int expInYears;
	
	public Employee(String empName) {
		this.empName = empName;
		this.empDesgn = "Contract";
	}
	
	public Employee(String empName, int empId) {
		this(empName);
		this.empId = empId;
	}

	public Employee(String empName, int empId, int empAge) {
		this(empName, empId);
		this.empAge = empAge;
	}
	
	
	public Employee(String empName, int empId, String empDesgn) {
		this(empName, empId);
		this.empDesgn = empDesgn;
	}

	public Employee(String empName, int empId, int empAge, String empDesgn) {
		this(empName, empId, empDesgn);
		this.empAge = empAge;
	}

	public Employee(String empName, int empId, int empAge, int expInYears) {
		this(empName, empId, empAge);
		this.expInYears = expInYears;
	}

	public Employee(String empName, int empId, String empDesgn, int expInYears) {
		this(empName, empId, empDesgn);
		this.expInYears = expInYears;
	}

	public Employee(String empName, int empId, String empDesgn, String empLocation, int expInYears) {
		this(empName, empId, empDesgn, expInYears);
		this.empLocation = empLocation;
	}

	public Employee(String empName, int empId, int empAge, String empDesgn, String empLocation, int expInYears) {
		this(empName, empId, empDesgn, expInYears);
		this.empAge = empAge;
		this.empLocation = empLocation;
		
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empAge=" + empAge + ", empDesgn=" + empDesgn
				+ ", empLocation=" + empLocation + ", ExpInYears=" + expInYears + "]";
	}

	
	
	
	
	
	
}
