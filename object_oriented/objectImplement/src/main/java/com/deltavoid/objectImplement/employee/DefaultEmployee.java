package com.deltavoid.objectImplement.employee;



public class DefaultEmployee implements Employee {

	public String name;
	public int socialNumber;

	public DefaultEmployee() {

		name = new String("hello");
		socialNumber = 10;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSocialNumber() {
		return this.socialNumber;
	}

	public void setSocialNumber(int socialNumber) {
		this.socialNumber = socialNumber;
	}

	public void show() {
		System.out.println("Name: " + name);
		System.out.println("Social_Number: " + socialNumber);
	}

}
