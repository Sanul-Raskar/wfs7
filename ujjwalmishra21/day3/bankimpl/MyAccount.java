package com.hsbc.day3.bankimpl;
/*
 	Q46
 	Program shows multiple inheritance among interfaces
 	in which:
 		>> Account is parent interface for DepositAcc & LoanAcc
 		>> Interest is parent interface for CreditInterest & DebitInterest
 */
public class MyAccount {

	public static void main(String[] args) {
		System.out.println("FD Account:");
		FDAcc fdAcc = new FDAcc();
		fdAcc.addAnnualInterest();
		fdAcc.addHalfYearlyInterest();
		fdAcc.addMonthlyInterest();
		fdAcc.calcInt();
		fdAcc.createAccount();
		fdAcc.deposit();
		fdAcc.getBalance();
		fdAcc.withdraw();
		System.out.println();
		
		System.out.println("Savings Account:");
		SavingsAcc savingsAcc = new SavingsAcc();
		savingsAcc.addAnnualInterest();
		savingsAcc.addHalfYearlyInterest();
		savingsAcc.addMonthlyInterest();
		savingsAcc.calcInt();
		savingsAcc.createAccount();
		savingsAcc.deposit();
		savingsAcc.getBalance();
		savingsAcc.withdraw();
		System.out.println();
		
		System.out.println("Personal Loan Account:");
		PersonalLoanAcc personalLoanAcc = new PersonalLoanAcc();
		personalLoanAcc.calcInt();
		personalLoanAcc.createAccount();
		personalLoanAcc.deductAnnualInterest();
		personalLoanAcc.deductHalfYearlyInterest();
		personalLoanAcc.deductMonthlyInterest();
		personalLoanAcc.payInterest();
		personalLoanAcc.payPartialPrincipal();
		personalLoanAcc.repayPrincipal();
		System.out.println();
		
		System.out.println("Housing Loan Account:");
		HousingLoanAcc housingLoanAcc = new HousingLoanAcc();
		housingLoanAcc.calcInt();
		housingLoanAcc.createAccount();
		housingLoanAcc.deductAnnualInterest();
		housingLoanAcc.deductHalfYearlyInterest();
		housingLoanAcc.deductMonthlyInterest();
		housingLoanAcc.payInterest();
		housingLoanAcc.payPartialPrincipal();
		housingLoanAcc.repayPrincipal();
		System.out.println();
		

	}

}
