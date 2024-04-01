package com.banking.account;

import java.util.Scanner;

public class Atm implements BankUser {
	Transaction ob1;
	Account ob2;
	public Atm(Transaction ob1, Account ob2) {
		super();
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	@Override
	public void transfer()
	{
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Welcome to atm\n 1->Deposit\n 2->Withdraw \n 0->EXIT");
			int choice=sc.nextInt();
			sc.close();
			if(choice==1) {
				System.out.println("Enter amount to deposit");
				double amt=sc.nextDouble();
				ob1.Deposite(amt,ob2);
				ob1.checkbal(ob2);return;
			}
			else if(choice==2) {
				System.out.println("Enter amount to withdraw");
				double amt=sc.nextDouble();
				ob1.Withdraw(amt,ob2);
				ob1.checkbal(ob2);
				return;
			}
			else if(choice==0) {
				System.out.println("Thank you for visiting!");
				break;
			}
		}

	}
}
