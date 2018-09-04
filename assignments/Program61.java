package com.capg1;

import java.util.Scanner;

public class Program61 extends Exception{

	String fname;
	String lname;
	char gen;
	String msg;
	
	public Program61() {
		
	}
	public Program61(String msg) {
		super();
		this.msg=msg;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public static void main(String[] args)throws Program61 {
		Scanner sc=new Scanner(System.in);
		Program61 l=new Program61();
		try {
			System.out.println("Enter First Name:\n");
			l.fname=sc.nextLine();
			System.out.println("Enter Last Name:\n");
			l.lname=sc.nextLine();
			if(l.fname.isEmpty() || l.lname.isEmpty()) {
				throw new Program61("NAME NOT FOUND EXCEPTION!");
			}else {
				System.out.println("No exception ");
			}
		}catch(Program61 e) {
			System.err.println("NAME NOT FOUND EXCEPTION!");
		}
	}
}
