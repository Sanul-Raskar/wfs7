package com.example.pack;

import java.util.Collections;
import java.util.HashSet;

import com.example.pack.model.Employee;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee("Admin", "Pune", 1));
		employees.add(new Employee("Sanul", "Pune", 2));
		employees.add(new Employee("Shubham", "Pimpri", 3));
		employees.add(new Employee("RootAdmin", "Pune", 1));
		
		for (Employee e : employees) {
			System.out.println(e);
		}
		
		//System.out.println();
		//System.out.println(employees.get(1));
		
		//employees.add(1,new Employee("Ram", "Shirur", 5));
		
		System.out.println();
		for (Employee e : employees) {
			System.out.println(e);
		}
		
		System.out.println();
		//EmpIdComparator empIdCompare = new EmpIdComparator();
		//Collections.sort(employees,empIdCompare);
		System.out.println();
		for (Employee e : employees) {
			System.out.println(e);
		}
		
		System.out.println();
		
		//Collections.sort(employees,new CityComparator());
		System.out.println();
		for (Employee e : employees) {
			System.out.println(e);
		}

	}

}
