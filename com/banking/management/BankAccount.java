package com.banking.management;

public class BankAccount {
	
	public static void main(String[] args) {
		
		System.out.println("welcome to banking acct management system!");
		
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();	
		System.out.println(saver1);
		System.out.println(saver2);
		System.out.println();
	
		saver1.modifyInterestRate();
		saver2.modifyInterestRate();
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println(saver1);
		System.out.println(saver2);



	}
}
