package com.example.pack.bankimpl;

import com.example.pack.bank.DebitInterest;
import com.example.pack.bank.LoanAcc;

 //HousingLoanAcc implements all methods of LoanAcc and DebitInterest
public class HousingLoanAcc implements LoanAcc, DebitInterest {

	@Override
	public void createAccount() {
		System.out.println("Inside createAccount() of HousingLoanAcc");

	}

	public void calcInt() {
		System.out.println("Inside calcInt() of HousingLoanAcc");

	}

	@Override
	public void deductMonthlyInterest() {
		System.out.println("Inside deductMonthlyInterest() of HousingLoanAcc");

	}

	@Override
	public void deductHalfYearlyInterest() {
		System.out.println("Inside deductHalfYearlyInterest() of HousingLoanAcc");

	}

	@Override
	public void deductAnnualInterest() {
		System.out.println("Inside deductAnnualInterest() of HousingLoanAcc");

	}

	@Override
	public void repayPrincipal() {
		System.out.println("Inside repayPrincipal() of HousingLoanAcc");

	}

	@Override
	public void payInterest() {
		System.out.println("Inside payInterest() of HousingLoanAcc");

	}

	@Override
	public void payPartialPrincipal() {
		System.out.println("Inside payPartialPrincipal() of HousingLoanAcc");

	}

}
