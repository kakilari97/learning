package com.capg1;

public class Program41Person extends Program41Account {

	private String name;
	private float age;
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
		return "Program41Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
