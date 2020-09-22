package com.example.pack.model;

public class Employee implements Comparable<Employee> {
	private String empName;
	private String empCity;
	private int empID;

	public Employee(String empName, String empCity, int empID) {
		super();
		this.empName = empName;
		this.empCity = empCity;
		this.empID = empID;
	}
	
	

	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmpCity() {
		return empCity;
	}


	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}


	public int getEmpID() {
		return empID;
	}


	public void setEmpID(int empID) {
		this.empID = empID;
	}



	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empCity=" + empCity + ", empID=" + empID + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empCity == null) ? 0 : empCity.hashCode());
		result = prime * result + empID;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empCity == null) {
			if (other.empCity != null)
				return false;
		} else if (!empCity.equals(other.empCity))
			return false;
		if (empID != other.empID)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}



	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.getEmpID() - o.getEmpID();
	}




	
}
