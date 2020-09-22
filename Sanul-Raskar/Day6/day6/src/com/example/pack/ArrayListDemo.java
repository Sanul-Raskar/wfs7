package com.example.pack;

import java.util.ArrayList;
import java.util.Collections;

import com.example.pack.model.Employee;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Admin", "Pune", 1));
		employees.add(new Employee("Sanul", "Pune", 2));

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
