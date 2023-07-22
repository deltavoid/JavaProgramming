package com.deltavoid.objectImplement.employee;


// public class Employee {
	
// 	String FirstName;
// 	String LastName;
// 	int Social_securityNumber;
	
// 	public Employee(){
		
// 	}
	
	

// 	public String getFirstName() {
// 		return FirstName;
// 	}



// 	public void setFirstName(String firstName) {
// 		FirstName = firstName;
// 	}



// 	public String getLastName() {
// 		return LastName;
// 	}



// 	public void setLastName(String lastName) {
// 		LastName = lastName;
// 	}



// 	public int getSocial_securityNumber() {
// 		return Social_securityNumber;
// 	}



// 	public void setSocial_securityNumber(int social_securityNumber) {
// 		Social_securityNumber = social_securityNumber;
// 	}
	
	
// 	public void show(){
// 		System.out.println("FirstName"+FirstName);
// 		System.out.println("LastName"+LastName);
// 		System.out.println("Social_security_Number"+Social_securityNumber);
// 	}



// 	public static void main(String[] args) {
// 		// TODO Auto-generated method stub

// 	}

// }


public interface Employee {

	public String getName();
	public void setName(String name);
	public int getSocialNumber();
	public void setSocialNumber(int socialNumber);
	public void show();

}
