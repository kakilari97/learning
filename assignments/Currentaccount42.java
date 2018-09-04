package com.capg1;

import java.util.Scanner;

public class Currentaccount42 extends Account42{
final double overdraftlimit=1000;

public Currentaccount42() {
	super();
	
}
public Currentaccount42(String name,double bal, float age) {
	this.name=name;
	this.age=age;
	this.bal=bal;
}

	public void withdraw(double d) {
		double b=bal;
		b=-d;
		if(bal>=overdraftlimit) {
			System.out.println("You have reached your overdraft limit!!!");
		}else {
			bal=b;
		}
	}
	@Override
	public String toString() {
		return "Currentaccount42 [overdraftlimit=" + overdraftlimit + ", name=" + name + ", bal=" + bal + ", age=" + age
				+ "]";
	}
	
}
