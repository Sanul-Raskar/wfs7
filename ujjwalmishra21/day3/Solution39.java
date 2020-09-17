package com.hsbc.day3;

import com.hsbc.day3.finance.Payable;
/*
  		1. Create a class called Worker. Write classes DailyWorker and SalariedWorker that inherit from
		Worker.Every worker has a name and a salaryrate. Write method Pay (int hours) to compute 
		the week pay of every worker.  A Daily worker is paid on the basis of the number of days 
		she/he works.The salaried worker gets paid the wage for 40 hours a week no matter what the
		actual hours are.  Test this program to calculate the pay of workers. 
		
		2. create a package called finance and within it create an interface called 
			Payable.It should define the getPayInfo() methodthat all the worker classeswillimplement.
            Now display the details of the monthly pay of the workers


 
 */
public class Solution39 {

	public static void main(String[] args) {
		Worker worker1 = new DailyWorker("Ramesh", 2000, 6);
		System.out.println("Daily Worker details: " + worker1);
		System.out.println("Salary: " + worker1.getWeeklySalary());
		System.out.println("Via Interface: ");
		 (new DailyWorker("Ramesh", 2000, 6)).getPayInfo();
		System.out.println();
		
		Worker worker2 = new SalariedWorker("Suresh", 210);
		System.out.println("Salaried Worker details: " + worker2);
		System.out.println("Salary: " + worker2.getWeeklySalary());
		System.out.println("Via Interface: ");
		 (new SalariedWorker("Suresh", 210)).getPayInfo();
	}

}

/*
 	Worker class acting as a super class for DailyWorker,
 	SalariedWorker.
 	
 */
class Worker{
	protected String name;
	protected int salaryRate;
		
	public Worker(String name, int salaryRate) {
		super();
		this.name = name;
		this.salaryRate = salaryRate;
	}
	
	public long getWeeklySalary() {
		return -1; 
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", salaryRate=" + salaryRate + "]";
	}
	
	
}
/*
 	DailyWorker inherits properties of Worker and
 	implements Payable interface.
 	getPayInfo() - method of Payable interface overridden for salary calculation
 */
class DailyWorker extends Worker implements Payable{
	private int days;
	
	public DailyWorker(String name, int salaryRate, int days) {
		super(name, salaryRate);
		this.days = days;
	}
	
	public long getWeeklySalary() {
		return this.salaryRate * this.days;
	}

	@Override
	public void getPayInfo() {
		System.out.println("Inside DailyWorker implementation of getPayInfo()----SALARY: " + this.salaryRate * this.days);
	}
}

/*
	SalariedWorker inherits properties of Worker and
	implements Payable interface.
	getPayInfo() - method of Payable interface overridden for salary calculation
*/
class SalariedWorker extends Worker implements Payable{
	private static final int HOURS = 40;
	
	public SalariedWorker(String name, int salaryRate) {
		super(name, salaryRate);
	}
	
	public long getWeeklySalary() {
		return this.salaryRate * HOURS; 
	}

	@Override
	public void getPayInfo() {
		System.out.println("Inside SalariedWorker implementation of getPayInfo()----SALARY: " + this.salaryRate * HOURS);
		
	}

}
