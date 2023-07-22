package com.deltavoid.objectImplement.employee;


public class SalariedEmployee extends Employee {
	
	int WeeklySalary;
	
	public SalariedEmployee(){
		super();
	}
	

	public int getWeeklySalary() {
		return WeeklySalary;
	}



	public void setWeeklySalary(int weeklySalary) {
		WeeklySalary = weeklySalary;
	}
	
	
	public void show(){
		super.show();
		System.out.println("WeeklySalary"+WeeklySalary);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
