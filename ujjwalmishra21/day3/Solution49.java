package com.hsbc.day3;

public class Solution49 {

	public static void main(String[] args) {
		BankAccountNew bankAccount = new BankAccountNew();
		bankAccount.deposit(25000);
		bankAccount.withdraw(1400);
		bankAccount.getBalance();

	}

}


/*
 	interface  to make anonymous class implement it 
 	for interest computation
 */
interface InterestAdd {
	void updateBalanceWithInterest();
}

/*
BankAccount class implements:
 >> deposit of money to the account
 >> withdrawl of money from the account
 >> retrieval of balance
 >> inner class that consist of method to update balance with interest
*/

class BankAccountNew2 {
	private double balance;
	
	public BankAccountNew2() {
		this.balance = 0;
	}
	
	public BankAccountNew2(double balance) {
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
		System.out.println("Current Balance: $ " + this.balance );
		/*
	 	Anonymous class implementing updating of interest using inner class
		 */
	
		InterestAdd interestAdd = new InterestAdd() {
			public void updateBalanceWithInterest() {
				double interest = (balance * 0.12)/12;
				balance += interest;
				System.out.println("Balance after interest addition: $ " + balance);
			}
			
		};
		
		interestAdd.updateBalanceWithInterest();
		
	}



}
