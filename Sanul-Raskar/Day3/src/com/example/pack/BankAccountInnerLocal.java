package com.example.pack;

/*
    Lab Exercise 48
    Create a class called BankAccount with deposit (), withdraw () and getBalance () methods.
    Create a local inner class inside the getBalance() method called InterestAdder and implement 
    the interest calculations and add the interest to the current balance.

	Created By: Sanul Raskar
 */

public class BankAccountInnerLocal {

	private String customerName;
	private double balance;
	private double interest;

	public BankAccountInnerLocal() {
		super();
		this.customerName = "";
		this.balance = 0;
		this.interest = 0;
	}

	public BankAccountInnerLocal(String customerName, double balance, double interest) {
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

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	//to add money to account
	private void deposit(double amount) {
		balance += amount;
	}

	//to subtract money from account
	private void withdraw(double amount) {
		balance -= amount;
	}
	
	private void getBalance() {
		System.out.println("Before adding interest Balance: "+this.balance);
		
		// Local inner class InterestAdderLocal to add interest to balance
		class InterestAdderLocal {
			private double calculateInterest() {
				return (balance * (interest / 100)) / 12;
			}

			private void addInterest() {
				balance += calculateInterest();
			}
		}

		// Create object of Local inner class
		// Scope valid only in getBalanceInnerClass() method
		InterestAdderLocal localClassObj = new InterestAdderLocal();
		// add interest to balance
		localClassObj.addInterest();
		
		System.out.println("After adding interest Balance: "+this.balance);
	}

	public static void main(String[] args) {
		
		BankAccountInnerLocal account = new BankAccountInnerLocal("Sanul", 1000, 5);
		System.out.println("Adding 150 to account");
		// Deposit 150 to account
		account.deposit(150);

		System.out.println("Withdraw 50 from account");
		// Withdraw 50 from account
		account.withdraw(50);
		
		//Show balance and perform adding interest method using local inner class
		account.getBalance();
		

	}

}
