package com.example.pack.bankimpl;

import com.example.pack.bank.DebitInterest;
import com.example.pack.bank.LoanAcc;

 
//PersonalLoanAcc implements all methods of LoanAcc and DebitInterest interfaces
public class PersonalLoanAcc implements LoanAcc, DebitInterest {

	@Override
	public void createAccount() {
		System.out.println("Inside createAccount() of PersonalLoanAcc");

	}

	public void calcInt() {
		System.out.println("Inside calcInt() of PersonalLoanAcc");

	}

	@Override
	public void deductMonthlyInterest() {
		System.out.println("Inside deductMonthlyInterest() of PersonalLoanAcc");

	}

	@Override
	public void deductHalfYearlyInterest() {
		System.out.println("Inside deductHalfYearlyInterest() of PersonalLoanAcc");

	}

	@Override
	public void deductAnnualInterest() {
		System.out.println("Inside deductAnnualInterest() of PersonalLoanAcc");

	}

	@Override
	public void repayPrincipal() {
		System.out.println("Inside repayPrincipal() of PersonalLoanAcc");

	}

	@Override
	public void payInterest() {
		System.out.println("Inside payInterest() of PersonalLoanAcc");

	}

	@Override
	public void payPartialPrincipal() {
		System.out.println("Inside payPartialPrincipal() of PersonalLoanAcc");

	}

}
