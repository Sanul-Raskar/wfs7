package org.example.model;

public class ContractEmployee extends Employee {

	private double hours;
	private double wage;

	public ContractEmployee(String empName, String designation, double hours, double wage) {
		super(empName, designation);
		this.hours = hours;
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	@Override
	public String toString() {
		return "ContractEmployee [hours=" + hours + ", wage=" + wage + ", empName=" + empName + ", salary=" + salary
				+ ", designation=" + designation + "]";
	}

	public double showSalary() {
		if (designation.equals(EmployeeType.TECHNICAL_ASSOCIATE.name())) {
			if (hours <= 40) {
				salary = hours * wage;
				return salary;
			} else {
				salary = 40 * wage + (hours - 40) * wage * 2;
				return salary;
			}

		}

		return 0;
	}

}
