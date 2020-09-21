package com.hsbc.day3;

import com.hsbc.day3.BankAccount.InterestAdder;

public class Solution48 {

	public static void main(String[] args) {
		BankAccountNew bankAccount = new BankAccountNew();
		bankAccount.deposit(25000);
		bankAccount.withdraw(1400);
		bankAccount.getBalance();
	}

}

/*
	BankAccount class implements:
	 >> deposit of money to the account
	 >> withdrawl of money from the account
	 >> retrieval of balance
	 >> inner class to inner class that consist of method to update balance with interest
*/
class BankAccountNew {
	private double balance;
	
	public BankAccountNew() {
		this.balance = 0;
	}
	
	public BankAccountNew(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("$ " + amount + " deposited into account");
	}
	
	
	public void withdraw(double amount) {
		if(amount > this.balance)
			System.out.println("Insuffient balance for withdrawl");
		else {
			this.balance -= amount;
			System.out.println("$ " + amount + " withdrawn from account");
		}
			
	}
	public void getBalance() {
		System.out.println("Balance before interest addition: $ " + this.balance );
		/*
	 	Inner class implementing updating of interest using inner class
	 */	
	
		class InterestAdder{
			
			private void updateBalanceWithInterest() {
				double interest = (balance * 0.12)/12;
				balance += interest;
				System.out.println("Balance after interest addition: $ " + balance);
			}
			
		}
		InterestAdder interestAdder = new InterestAdder();
		interestAdder.updateBalanceWithInterest();
	}
	
}

