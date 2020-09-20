package com.example.pack;

/*
 * Lab Exercise 47
	Create a class called BankAccount with deposit (), withdraw () and getBalance () methods.
    Create an inner class called InterestAdder and implement the interest calculations and add 
    the interest to the current balance.
    
    Lab Exercise 48
    Create a class called BankAccount with deposit (), withdraw () and getBalance () methods.
    Create a local inner class inside the getBalance() method called InterestAdder and implement 
    the interest calculations and add the interest to the current balance.

	Lab Exercise 49
	Create a class called BankAccount with deposit (), withdraw () and getBalance () methods.
    Create an anonymous inner class in the getBalance() method to do the interest calculations 
	and add the interest to the current balance.


	Created By: Sanul Raskar
 * */

public class BankAccount {
	private String customerName;
	private double balance;
	private double interest;
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

	// Method to declare Local inner class
	private void getBalanceLocalInnerClass() {
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
	}

	// Method to declare Anonymous inner class
	private void getBalanceAnonymousClass() {
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

		System.out.println("Adding interest to balance using local inner class");
		// Add interest using local inner class
		account.getBalanceLocalInnerClass();
		// Display current balance
		System.out.println("Account balance: " + account.getBalance());

		System.out.println("Adding interest to balance using Anonymous inner class");
		// Add interest using Anonymous inner class
		account.getBalanceAnonymousClass();
		;
		// Display current balance
		System.out.println("Account balance: " + account.getBalance());

	}

}

//The methods in this interface will be implemented by Anonymous Inner class
interface AddInterest {
	void addInterestAnonymousClassMethod();
}