package com.capg1;

public class Program41Account {

	private long accNum;
	private double balance;
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
	}
	
	public void deposit(double amt) {
		balance=balance+amt;
	}
	
	public void withdraw(double amt)
	{
		if(balance<500) {
			System.out.println("Insufficient balance!\n");
		}else
		{
			balance=balance-amt;
		}
	}
	@Override
	public String toString() {
		return "Program41Account [accNum=" + accNum + ", balance=" + balance + "]";
	}
	
}
