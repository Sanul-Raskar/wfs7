package com.example.pack;

/*
 * Lab Exercise 47
	Create a class called BankAccount with deposit (), withdraw () and getBalance () methods.
    Create an inner class called InterestAdder and implement the interest calculations and add 
    the interest to the current balance.
    
	Created By: Sanul Raskar
 * */

public class BankAccount {
	private String customerName;
	private double balance;
	private double interest;
	//Object of inner class
	InterestAdder interestAdder = new InterestAdder();

	public BankAccount() {
		super();
		balance = 0;
		customerName = null;
		interest = 0;
	}

	public BankAccount(String customerName, double balance, double interest) {
		super();
		this.customerName = customerName;
		this.balance = balance;
		this.interest = interest;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	private void deposit(double amount) {
		balance += amount;
	}

	private void withdraw(double amount) {
		balance -= amount;
	}

	// Inner class InterestAdder of outer class BankAccount
	private class InterestAdder {
		// Calculate interest
		protected double calculateInterest() {
			return (balance * (interest / 100)) / 12;
		}

		protected void addInterest() {
			balance += calculateInterest();
		}
	}

	public static void main(String[] args) {

		// Create new bank account by passing Customer name, initial balance and
		// interest rate
		BankAccount account = new BankAccount("Sanul", 1000, 5);
		System.out.println("Account balance: " + account.getBalance());

		System.out.println("Adding 150 to account");
		// Deposit 150 to account
		account.deposit(150);

		System.out.println("Withdraw 50 from account");
		// Withdraw 50 from account
		account.withdraw(50);

		// Display Current Balance
		System.out.println("Account balance: " + account.getBalance());

		// add interest to balance
		System.out.println("Interest to be added: " + account.interestAdder.calculateInterest());
		// Add interest to current balance
		account.interestAdder.addInterest();

		// Display current balance
		System.out.println("Account balance: " + account.getBalance());

	}

}