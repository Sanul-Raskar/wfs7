package org.example.model;

public class Employee {
	protected String empName;
	protected double salary;
	protected String designation;

	public Employee(String empName, String designation) {
		this.empName = empName;
		this.salary = 0;
		if (designation.equalsIgnoreCase("PROJECT_MANAGER"))
			this.designation = "PROJECT_MANAGER";
		else
			this.designation = "TECHNICAL_ASSOCIATE";
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", salary=" + salary + ", designation=" + designation + "]";
	}

	public double showSalary() {
		System.out.println("In employee class showSalary Method");
		return 0;
	}

	public double getMediClaim() {
		System.out.println("In employee class getMediClaim Method");
		return 0;
	}

}
