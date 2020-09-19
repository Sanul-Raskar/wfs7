package com.hsbc.day3.bankimpl;

import com.hsbc.day3.bank.CreditInterest;
import com.hsbc.day3.bank.DepositAcc;

/*
 	SavingsAcc implements all methods of DepositAcc and CreditInterest interfaces
 */
public class SavingsAcc implements DepositAcc, CreditInterest {

	@Override
	public void createAccount() {
		System.out.println("Inside createAccount() of SavingsAcc");

	}

	public void calcInt() {
		System.out.println("Inside calInt() of SavingsAcc");

	}

	@Override
	public void addMonthlyInterest() {
		System.out.println("Inside addMonthlyInterest() of SavingsAcc");

	}

	@Override
	public void addHalfYearlyInterest() {
		System.out.println("Inside addHalfYearlyInterest() of SavingsAcc");

	}

	@Override
	public void addAnnualInterest() {
		System.out.println("Inside addAnnualInterest() of SavingsAcc");

	}

	@Override
	public void withdraw() {
		System.out.println("Inside withdraw()  of SavingsAcc");

	}

	@Override
	public void deposit() {
		System.out.println("Inside deposit() of SavingsAcc");

	}

	@Override
	public void getBalance() {
		System.out.println("Inside getBalance() of SavingsAcc");

	}

}
