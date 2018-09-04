package com.capg1;

import java.util.Scanner;

public class Person41{
	
	
	private String name;
	private float age;
	
	public Person41() {
		
	}
	public Person41(String name,float age) {
		super();
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person41 [name=" + name + ", age=" + age + "]";
	}
	

}
