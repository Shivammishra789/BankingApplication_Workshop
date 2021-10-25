package com.banking.management;

public class SavingsAccount {

	public static double annualInterestRate = 4;
	private double savingsBalance;             

	public SavingsAccount(double savingsBalance) {		
		super();
		this.savingsBalance = savingsBalance;
	}

	public void calculateMonthlyInterest() {									//calculated monthly interest
		double monthyInterest = savingsBalance * (annualInterestRate/ (12*100));
		savingsBalance = savingsBalance + monthyInterest;	
	}

	public static void modifyInterestRate(double enteredAnnualInterestRate) {     //taking new interest rate
		annualInterestRate = enteredAnnualInterestRate;
	}

	@Override
	public String toString() {
		return " "+savingsBalance;
	}	
}
