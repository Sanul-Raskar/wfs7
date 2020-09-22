package org.example.model;

public class PermanentEmployee extends Employee {

	private int experience;
	private int certificate;

	public PermanentEmployee(String empName, int experience, int certificate, String designation) {
		super(empName, designation);
		this.experience = experience;
		this.certificate = certificate;

	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getCertificate() {
		return certificate;
	}

	public void setCertificate(int certificate) {
		this.certificate = certificate;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [experience=" + experience + ", certificate=" + certificate + ", designation="
				+ designation + ", empName=" + empName + ", salary=" + salary + "]";
	}

	public double showSalary() {

		if (designation.equals(EmployeeType.PROJECT_MANAGER.name())) {
			salary = 1000 * experience;
			return salary;
		} else if (designation.equals(EmployeeType.TECHNICAL_ASSOCIATE.name())) {
			salary = 5000 * experience + 1000 * certificate;
			return salary;
		}

		return 0;
	}

	public double getMediClaim() {
		if (designation.equals(EmployeeType.PROJECT_MANAGER.name())) {
			return salary;
		} else if (designation.equals(EmployeeType.TECHNICAL_ASSOCIATE.name())) {
			return 2 * salary;
		}

		return 0;
	}

}
