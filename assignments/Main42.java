package com.capg1;

import java.util.Scanner;

public class Main42 {

	public static void main(String[] args) {
	Savingsaccount42 sacc=new Savingsaccount42();
	Currentaccount42 cacc=new Currentaccount42();
	System.out.println("Savings account");
	System.out.println(sacc);
	System.out.println("Current account");
	System.out.println(cacc);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter amount to be withdrawn from savings:\n");
	double withdrawsa=sc.nextDouble();
	sacc.withdraw(withdrawsa);
	System.out.println("Enter amount to be withdrawn from current:\n");
	double withdrawca=sc.nextDouble();
	sacc.withdraw(withdrawca);
	sacc.toString();
	cacc.toString();
	}

}
