package com.hsbc.day3.bankimpl;

import com.hsbc.day3.bank.CreditInterest;
import com.hsbc.day3.bank.DepositAcc;
/*
 	FDAcc implements all methods of DepositAcc and CreditAcc interfaces
 */
public class FDAcc implements DepositAcc, CreditInterest {

	@Override
	public void createAccount() {
		System.out.println("Inside createAccount() of FDAcc");

	}

	public void calcInt() {
		System.out.println("Inside calInt() of FDAcc");

	}

	@Override
	public void addMonthlyInterest() {
		System.out.println("Inside addMonthlyInterest() of FDAcc");

	}

	@Override
	public void addHalfYearlyInterest() {
		System.out.println("Inside addHalfYearlyInterest() of FDAcc");

	}

	@Override
	public void addAnnualInterest() {
		System.out.println("Inside addAnnualInterest() of FDAcc");

	}

	@Override
	public void withdraw() {
		System.out.println("Inside withdraw()  of FDAcc");

	}

	@Override
	public void deposit() {
		System.out.println("Inside deposit() of FDAcc");

	}

	@Override
	public void getBalance() {
		System.out.println("Inside getBalance() of FDAcc");

	}

}
