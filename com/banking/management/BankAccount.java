package com.banking.management;

public class BankAccount {
	
	public static void main(String[] args) {
		
		System.out.println("welcome to banking acct management system!");
		System.out.println();
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		//calculating monthly interest 
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();	
		System.out.println("Monthly balance for saver1 is " + saver1 );
		System.out.println("Monthly balance for saver2 is " + saver2 );
		System.out.println();
		
		//Modifying interest rate
		SavingsAccount.modifyInterestRate(5);
		
		//calculating monthly interest for modified interest rate
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println("Monthly balance for saver1 is " + saver1 );
		System.out.println("Monthly balance for saver2 is " + saver2 );
	}
}
