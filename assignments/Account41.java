package com.capg1;

import java.util.Scanner;

public class Account41 extends Person41{
	private long accNum;
	private double balance;
	Person41 p;
	Scanner sc1=new Scanner(System.in);
	public Person41 getP() {
		return p;
	}
	public void setAccHolder(Person41 p) {
		this.p= p;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
		if(p.getName()=="Kathy") {
			balance=3000;
		}else if(p.getName()=="Smith") {
			balance=2000;
		}
	}
	public Account41()
	{}
	public Account41(long accNum, double balance, Person41 p)
	{
		super();
		this.accNum=accNum;
		this.balance=balance;
		this.p=p;
	}
	@Override
	public String toString() {
		return "Account41 [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + p + "]";
	}
	public double Deposit()
	{
		double amount=0;
		System.out.println("Enter the amount to be deposited!\n");
		amount=sc1.nextDouble();
		balance=getBalance()+amount;
		System.out.println("Balance after deposit is:"+balance);
		return balance;
	}
	public double Withdraw()
	{
		double amount=0;
		System.out.println("Enter the amount to be withdrawn:\n");
		amount=sc1.nextDouble();
		balance=getBalance()-amount;
		System.out.println("Balance after withdrawl is:"+balance);
		return balance;
	}
}
