package com.example.pack;

import com.example.pack.finance.IPayable;

/*
 * Lab Exercise 39
	Create a class called Worker. Write classes DailyWorker and SalariedWorker that inherit from
	Worker.Every worker has a name and a salaryrate. Write method Pay (int hours) to compute 
	the week pay of every worker.  A Daily worker is paid on the basis of the number of days 
	she/he works.The salaried worker gets paid the wage for 40 hours a week no matter what the
	actual hours are.  Test this program to calculate the pay of workers.
	
	Lab Exercise 45
	In Lab Exercise 39, create a package called finance and within it create an interface called 
	Payable.It should define the getPayInfo() method that all the worker classes will implement.
    Now display the details of the monthly pay of the workers.


	Created By: Sanul Raskar
 * */

class Worker {
	private String name;
	private double salaryRate;

	public Worker(String name, double salaryRate) {
		this.name = name;
		this.salaryRate = salaryRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalaryRate() {
		return salaryRate;
	}

	public void setSalaryRate(double salaryRate) {
		this.salaryRate = salaryRate;
	}

	//This function will be implemented by overriding by DailyWorker and SalariedWorker
	protected void pay(int hours) {
		System.out.println("Worker Pay Implementation");
	}

}

class DailyWorker extends Worker implements IPayable {
	private int days;

	public DailyWorker(String name, double salaryRate) {
		super(name, salaryRate);
	}

	public DailyWorker(String name, double salaryRate, int days) {
		super(name, salaryRate);
		this.days = days;
	}

	//For Exercise 39
	//Takes hour as input and prints payment (hour x salaryRate)
	//Function is overridden of superclass Worker
	@Override
	protected void pay(int hours) {
		System.out.println("Daily Worker Payment: " + hours * this.getSalaryRate());
	}

	// For exercise problem 45
	// Showing pay info by implementing Payable Interface
	@Override
	public void getPayInfo() {
		System.out.println("[Interface Implementation] Daily worker payment:" + this.days * this.getSalaryRate());

	}

}

class SalariedWorker extends Worker implements IPayable {

	//Salaried worker hours are fixed for a week
	private static final int HOURS = 40;

	public SalariedWorker(String name, double salaryRate) {
		super(name, salaryRate);
	}

	//For Exercise 39
	//Takes hour as input and prints payment (hour x salaryRate)
	//Function is overridden of superclass Worker
	@Override
	protected void pay(int hours) {
		System.out.println("Salaried Worker Payment: " + hours * this.getSalaryRate());
	}

	// For exercise problem 45
	// Showing pay info by implementing Payable Interface
	@Override
	public void getPayInfo() {
		System.out.println("[Interface Implementation] Salaried worker payment:" + HOURS * this.getSalaryRate());
	}

}

public class PayInfo {

	public static void main(String[] args) {

		//Create an object of type Worker
		Worker dailyWorker = new DailyWorker("Ram", 750);
		//Even though dailyworker is Worker type object, it will execute pay method defined in DailyWorker class
		dailyWorker.pay(3);
		System.out.println();
		//Create an object of type Worker
		Worker salaryWorker = new SalariedWorker("Sanul", 900);
		//Even though salaryworker is Worker type object, it will execute pay method defined in SalariedWorker class
		salaryWorker.pay(40);

		//Interface Payable is declared in com.example.pack.finance
		System.out.println("\nUsing Interface:");
		DailyWorker dailyWorker1 = new DailyWorker("Ram", 750, 3);
		dailyWorker1.getPayInfo();
		System.out.println();
		SalariedWorker salaryWorker1 = new SalariedWorker("Sanul", 900);
		salaryWorker1.getPayInfo();
	}
}