package com.example.pack;

import java.util.TreeSet;

import com.example.pack.model.Employee;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Employee> employees = new TreeSet<Employee>(new EmpIdComparator());
		employees.add(new Employee("Admin", "Pune", 1));
		employees.add(new Employee("Sanul", "Pune", 2));
		employees.add(new Employee("Shubham", "Pimpri", 3));
		employees.add(new Employee("RootAdmin", "Pune", 1));
		
		for (Employee e : employees) {
			System.out.println(e);
		}

	}

}
