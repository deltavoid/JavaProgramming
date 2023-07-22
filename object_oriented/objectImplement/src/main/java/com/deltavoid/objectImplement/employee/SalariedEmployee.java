package com.deltavoid.objectImplement.employee;


public class SalariedEmployee implements Employee {
	
	DefaultEmployee defaultEmployee;
	int WeeklySalary;

	public SalariedEmployee() {

		defaultEmployee = new DefaultEmployee();

	}
	
	public String getName() {
		return defaultEmployee.getName();
	}

	public void setName(String name) {
		defaultEmployee.setName(name);
	}

	public int getSocialNumber() {
		return defaultEmployee.getSocialNumber();
	}

	public void setSocialNumber(int socialNumber) {
		defaultEmployee.setSocialNumber(socialNumber);
	}
	

	public int getWeeklySalary() {
		return WeeklySalary;
	}

	public void setWeeklySalary(int weeklySalary) {
		WeeklySalary = weeklySalary;
	}
	
	
	public void show(){
		defaultEmployee.show();
		System.out.println("WeeklySalary"+WeeklySalary);
	}


}
