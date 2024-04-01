package com.banking.account;

import java.util.Scanner;

public class User {
	String CId;
	String Pw;
	public void signup() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your (new) Id:");
		String c=sc.nextLine();
		System.out.println("Enter your (new) password");
		String pw=sc.nextLine();
		this.CId=c;
		this.Pw=pw;
		sc.close();
	}
	@SuppressWarnings("resource")
	public BankUser Login(Transaction ob1,Account ob2) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Id:");
		String c=sc.nextLine();
		System.out.println("Enter your password");
		String pw=sc.nextLine();
		if(c.equals(this.CId)&&pw.equals(this.Pw)) {
			System.out.println("Welcome!");
			System.out.println("1. ATM, 2.Phonepe, 3.Gpay");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:BankUser b1=new Atm(ob1,ob2);
			return b1;
			case 2:BankUser b2=new PhonePe(ob1,ob2);
			return b2;
			case 3:BankUser b3=new Gpay(ob1,ob2);
			return b3;
			}
		}
		else {
			System.out.println("Invalid id or password");
		}
		sc.close();
		return null;
	}
}
