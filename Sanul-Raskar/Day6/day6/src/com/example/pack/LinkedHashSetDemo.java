package com.example.pack;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import com.example.pack.model.Employee;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Employee> employees = new LinkedHashSet<Employee>();
		employees.add(new Employee("Admin", "Pune", 1));
		employees.add(new Employee("Shubham", "Pimpri", 3));
		employees.add(new Employee("Sanul", "Pune", 2));
		employees.add(new Employee("RootAdmin", "Pune", 1));
		employees.add(new Employee("Admin", "Pune", 1));
		
		 //TreeSet<Employee> tSet = new TreeSet<Employee>( employees);
	
		for (Employee e : employees) {
			System.out.println(e);
		}

		//for (Employee e : tSet) {
		//	System.out.println(e);
		//}
	}

}
