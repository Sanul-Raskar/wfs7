package com.example.pack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.example.pack.model.Employee;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, Employee> employees = new HashMap<Integer,Employee>();
		employees.put(1,new Employee("Admin", "Pune", 1));
		employees.put(3,new Employee("Shubham", "Pimpri", 3));
		employees.put(2,new Employee("Kaustubh", "Shirur", 2));
		employees.put(4,new Employee("Manthan", "Shirur", 4));
		
		ArrayList<Employee> strList = new ArrayList<Employee>();
		strList.add(new Employee("Admin1", "Pune", 7));
		strList.add(new Employee("Shubham1", "Pimpri", 8));
		
		HashMap<Integer, ArrayList<Employee>> employee = new HashMap<Integer,ArrayList<Employee> >();
		employee.put(4,strList);
		
		System.out.println(employee.get(4));
		
		
		System.out.println();
		
		Map map = Collections.synchronizedMap(employees);
		Set set = map.entrySet();
		
		synchronized (map) {
			Iterator i = set.iterator();
			
			while(i.hasNext()) {
				Map.Entry me = (Map.Entry)i.next();
				System.out.println(me.getKey());
				System.out.println(me.getValue());
			}
		}
	}

}
