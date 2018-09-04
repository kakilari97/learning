package com.capg1;

class PersonMain{
	private String firstName;
	private String lastName;
	private char gender;
	private String mobnum;
	
	PersonMain(){
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getMobnum() {
		return mobnum;
	}

	public void setMobnum(String mobnum) {
		this.mobnum = mobnum;
	}

	public PersonMain(String firstName, String lastName, char gender, String mobnum) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.mobnum = mobnum;
	}

	@Override
	public String toString() {
		return "PersonMain [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", mobnum="
				+ mobnum + "]";
	}
	

}
