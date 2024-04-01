package com.banking.account;

public class Transaction {
	public void Withdraw(double amt,Account a1) {
		if(amt>=0 && a1.getBal()>=amt) {
			a1.setBal(a1.getBal()-amt);
			checkbal(a1);
		}
		else {
			System.out.println("Insufficient bal.");
		}
	}
	public void Deposite(double amt,Account a1) {
		if(amt>=0 ) {
			a1.setBal(a1.getBal()+amt);
			checkbal(a1);
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	public void checkbal(Account a1) {
		System.out.println("Current bal:"+a1.getBal());
	}
}