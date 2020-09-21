package com.example.pack;

/*
	Lab Exercise 49
	Create a class called BankAccount with deposit (), withdraw () and getBalance () methods.
    Create an anonymous inner class in the getBalance() method to do the interest calculations 
	and add the interest to the current balance.

	Created By: Sanul Raskar
*/

interface AddInterest {
	void addInterestAnonymousClassMethod();
}

public class BankAccountInnerAnonymous {
	private String customerName;
	private double balance;
	private double interest;

	public BankAccountInnerAnonymous() {
		this.customerName = "";
		this.balance = 0;
		this.interest = 0;
	}

	public BankAccountInnerAnonymous(String customerName, double balance, double interest) {
		super();
		this.customerName = customerName;
		this.balance = balance;
		this.interest = interest;
	}

	private void deposit(double amount) {
		balance += amount;
	}

	private void withdraw(double amount) {
		balance -= amount;
	}

	private void getBalance() {
		System.out.println("Before adding interest Balance: " + this.balance);

		// Declare Anonymous inner class
		AddInterest anonymous = new AddInterest() {
			// implement the interface AddInterest method
			@Override
			public void addInterestAnonymousClassMethod() {
				balance += (balance * (interest / 100) / 12);

			}
		};

		// Invoke the above implemented method of Anonymous Inner class
		anonymous.addInterestAnonymousClassMethod();

		System.out.println("After adding interest Balance: " + this.balance);
	}

	public static void main(String[] args) {
		//Create new object
		BankAccountInnerAnonymous account = new BankAccountInnerAnonymous("Sanul", 1000, 5);
		System.out.println("Adding 150 to account");
		// Deposit 150 to account
		account.deposit(150);

		System.out.println("Withdraw 50 from account");
		// Withdraw 50 from account
		account.withdraw(50);

		// Show balance and perform adding interest method using anonymous inner class
		account.getBalance();

	}

}
