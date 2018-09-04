package com.capg1;

import java.util.Scanner;

public class Program1021 {
	private String firstName;
	private String lastName;
	private char gender;
	private String phone;
	//default constructor
	public Program1021() {
	super();	
	}
	//parameterized constructor
	Program1021(String fName, String lName, char gen)
	{
		firstName=fName;
		lastName=lName;
		gender=gen;
	}
	
	//getter and setter methods for private data 
	public String getFirstname()
	{
		return this.firstName;
	}
	public void setFirstname(String firstName) {
		this.firstName=firstName;
	}
	public String getlastName()
	{
		return lastName;
	}
	public void setlastName(String lastName)
	{
		this.lastName= lastName;
	}
	public char getgender()
	{
		return gender;
	}
	public void setgender(char gender) {
		this.gender=gender;
	}
	public String getphone()
	{
		return phone;
	}
	public void setphone(String phone) {
		this.phone=phone;
	}

	public void method() {
		System.out.println("Enter the phone number:");
		Scanner sc=new Scanner(System.in);
		 phone=sc.next();
	}
//	public void newmethod()
//	{
//		System.out.println("FirstName: "+firstName);
//		System.out.println("LastName: "+lastName);
//		System.out.println("Gender: "+gender);
//		System.out.println("Phone number: "+phone);
//	}
	@Override
	public String toString() {
		return "Person24 [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", phone=" + phone
				+ "]";
	}
	



	public static void main(String[] args) {
Person24 p=new Person24("Kavya","Kilari",'F');
p.method();
//p.newmethod();
System.out.println(p);

}
}