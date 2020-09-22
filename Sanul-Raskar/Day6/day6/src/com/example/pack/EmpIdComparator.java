package com.example.pack;

import java.util.Comparator;

import com.example.pack.model.Employee;

public class EmpIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpID() - o2.getEmpID();
	}

}
