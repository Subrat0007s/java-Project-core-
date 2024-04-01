package com.banking.account;

import java.util.Scanner;

public class MAINclass1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println("Enter your account no:");
		Long Acno=sc.nextLong();
		
		User u1=new User();
		
		Account User1=new Account(name, Acno, 0);
		Transaction t1=new Transaction();
		u1.signup();
		BankUser b1=u1.Login(t1, User1);
		b1.transfer();
		sc.close();
	}
}
