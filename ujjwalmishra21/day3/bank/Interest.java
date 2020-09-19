package com.hsbc.day3.bank;

public interface Interest {
	public double SAVINGS_INTEREST = 3;
	public double FIXED_DEPOSIT_INTEREST = 6;
	public double PERSONAL_LOAN_INTEREST = 12;
	public double HOME_LOAN_INTEREST = 10;
	public void calcInt();
}
