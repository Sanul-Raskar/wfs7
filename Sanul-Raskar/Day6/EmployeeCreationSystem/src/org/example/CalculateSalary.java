package org.example;

import org.example.model.ContractEmployee;
import org.example.model.Employee;
import org.example.model.PermanentEmployee;

public class CalculateSalary {

	public static void main(String[] args) {

		Employee em1 = new PermanentEmployee("Sanul", 3, 2, "TECHNICAL_ASSOCIATE");
		Employee em2 = new PermanentEmployee("Ram", 5, 6, "Project_Manager");
		Employee em3 = new ContractEmployee("Shubham", "Technical_Associate", 34, 700);

		System.out.println(em1);
		System.out.println(em2);
		System.out.println(em3);
		System.out.println();

		System.out.println("Salary for Permanent Employee Technical Associate [Sanul]: " + em1.showSalary());
		System.out.println("Salary for Permanent Employee Project Manager [Ram]: " + em2.showSalary());
		System.out.println("Salary for Contract Employee Technical Associate [Shubham]: " + em3.showSalary());
		System.out.println("MediClaim Permanent Employee Sanul: " + em1.getMediClaim());
		System.out.println("MediClaim Permanent Employee Ram: " + em2.getMediClaim());
	}

}
