package com.capg1;

import java.util.Scanner;

 class ExceptionDemo extends Exception{
	private int age;
	ExceptionDemo(int a) {
	age = a; }
	public String toString() {
	return age+" is an invalid age"; } }
	
class emp{
	String name;
	int age;
	void getDetails() throws ExceptionDemo{
	System.out.println("Enter your name:");
	Scanner sc=new Scanner(System.in);
	name=sc.next();
	System.out.println("Enter your age:");
	age=sc.nextInt();
	if (age<16)
	throw new ExceptionDemo(age);
	}
}
	class Program62{
		public static void main(String args[]) {
		try {
		emp e=new emp();
		e.getDetails();
		}
		catch (ExceptionDemo e) {
		System.out.println( e); }
		} }
