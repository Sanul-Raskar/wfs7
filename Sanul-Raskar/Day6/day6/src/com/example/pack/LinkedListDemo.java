package com.example.pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import com.example.pack.model.Employee;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Employee> employees = new LinkedList<>();
		employees.add(new Employee("Admin", "Pune", 1));
		employees.add(new Employee("Sanul", "Pune", 2));
		
		employees.addFirst(new Employee("FirstName", "Delhi", 4));

		for (Employee e : employees) {
			System.out.println(e);
		}
		
		System.out.println();
		System.out.println(employees.get(1));
		
		employees.add(1,new Employee("Ram", "Shirur", 5));
		
		System.out.println();
		for (Employee e : employees) {
			System.out.println(e);
		}
		
		System.out.println();
		EmpIdComparator empIdCompare = new EmpIdComparator();
		Collections.sort(employees,empIdCompare);
		System.out.println();
		for (Employee e : employees) {
			System.out.println(e);
		}
		
		System.out.println();
		
		Collections.sort(employees,new CityComparator());
		System.out.println();
		for (Employee e : employees) {
			System.out.println(e);
		}

	}
}
