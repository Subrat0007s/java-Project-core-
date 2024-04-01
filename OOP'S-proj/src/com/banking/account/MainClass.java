package com.banking.account;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		
		long acno=sc.nextLong();
		
		Account a1=new Account(name, acno,0);
		Transaction t1=new Transaction();
		
		while(true) {
			System.out.println("Enter your choice.\n 1->Diposit  2->Widraw 0->exit");
			int choice=sc.nextInt();
			if(choice==0) {
				System.out.println("Thank you for visiting!");
				break;
			}
			System.out.println("Enter Amount:");
			double amount=sc.nextDouble();
			if(choice==1) 
			{
				t1.Deposite(amount, a1);continue;
			}
			else if(choice==2)
			{
				t1.Withdraw(amount, a1);continue;
			}
			else {
				System.out.println("Invalid Choice!");
				System.out.println("Thank you for visiting!");
			}sc.close();
		
		}
		
	}
}
