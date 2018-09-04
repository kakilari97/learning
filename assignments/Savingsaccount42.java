package com.capg1;

import java.util.Scanner;

public class Savingsaccount42 extends Account42{

	
	final double minBalance=1000;
	public Savingsaccount42() {
	}
	public Savingsaccount42(String name,double bal, float age) {
	this.name=name;
	this.bal=bal;
	this.age=age;
	}
	@Override
	public void withdraw(double d) {
		super.withdraw(bal);
		double b=bal;
		b=-d;
		if(b<=minBalance) {
			System.out.println("Insufficient balance");
		}else
			bal=b;
	}
	@Override
	public String toString() {
		return "Savingsaccount42 [minBalance=" + minBalance + ", name=" + name + ", bal=" + bal + ", age=" + age
				+ ", getName()=" + getName() + ", getBal()=" + getBal() + ", getAge()=" + getAge() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
