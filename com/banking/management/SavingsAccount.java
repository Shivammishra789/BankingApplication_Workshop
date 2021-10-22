package com.banking.management;

public class SavingsAccount {

	public static double annualInterestRate = 4;
	private double savingsBalance;

	public SavingsAccount(double savingsBalance) {
		super();
		this.savingsBalance = savingsBalance;
	}
	
	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}


	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}


	public double getSavingsBalance() {
		return savingsBalance;
	}


	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}


	public void calculateMonthlyInterest() {
		double monthyInterest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance = savingsBalance + monthyInterest;
		
	}
	public static void modifyInterestRate() {
	annualInterestRate = 6;
	}
	


	@Override
	public String toString() {
		return "SavingsAccount [savingsBalance=" + savingsBalance + "]";
	}
	
}
