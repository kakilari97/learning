package com.capg1;

import java.util.Random;
import java.util.Scanner;

public class Main41 {

	public static void main(String[] args) {
		Account41 acc=new Account41();
		Person41 p=new Person41();
		
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		System.out.println("Enter your account details:\n");
		System.out.println("Account holder name:\n");
		String pname=sc.next();
		
		System.out.println("Account holder age:\n");
		float page=sc.nextFloat();
		
		p.setName(pname);
		p.setAge(page);
		
		
		acc.setAccNum(ran.nextLong());

		//acc.setAccHolder(p);
		String acc1=p.getName();
		if(pname=="Smith") {
			acc.setBalance(2000);
		}else if(pname=="Kathy") {
			acc.setBalance(3000);
		}
		System.out.println("Select the option:\n");
		int option=sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Details:\n");
			System.out.println("Account Number is:\t"+acc.getAccNum());
			System.out.println("Balance is:\t"+acc.getBalance());
			System.out.println("Account Holder Name is:\t"+acc.getName());
			System.out.println("Account holder age is:\t"+acc.getAge());
			break;
			
		case 2:
			System.out.println("Option for Withdrawl!\n");
			if(acc.getP().getName()=="Smith") {
				acc.setBalance(2000);
			}else if(acc.getP().getName()=="Kathy") 
			{
				acc.setBalance(3000);
			}else
				acc.setBalance(0);
			acc.Withdraw();
			break;
		case 3:
			System.out.println("Option for Deposit!\n");
			if(acc.getP().getName()=="Smith") {
				acc.setBalance(2000);
			}else if(acc.getP().getName()=="Kathy") 
			{
				acc.setBalance(3000);
			}
			acc.Deposit();
	}
}
}