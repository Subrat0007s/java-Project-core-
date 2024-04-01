package com.banking.account;

import java.util.Scanner;

public class Gpay implements BankUser {
	Transaction gp1;
	Account gp2;
	public Gpay(Transaction gp1, Account gp2) {
		super();
		this.gp1 = gp1;
		this.gp2 = gp2;
	}
	@Override
	public void transfer()
	{
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("Welcome to atm\n 1->Send Money\n 2->Recieve Money \n 0->EXIT");
			int choice=sc.nextInt();
			if(choice==2) {
				System.out.println("Enter amount to Recieve");
				double amt=sc.nextDouble();
				gp1.Deposite(amt,gp2);
				gp1.checkbal(gp2);continue;
			}
			else if(choice==1) {
				System.out.println("Enter amount to Send");
				double amt=sc.nextDouble();
				gp1.Withdraw(amt,gp2);
				gp1.checkbal(gp2);
				continue;
			}
			else if(choice==0) {
				System.out.println("Thank you for visiting!");
				break;
			}
		}
		sc.close();
	}
}
