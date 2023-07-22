package com.deltavoid.objectExtend;


public class HourlyEmployee extends Employee {
	
	int Wage;
	int WorkedHours;
	
	public HourlyEmployee(){
		super();
	}
	
	

	public int getWage() {
		return Wage;
	}



	public void setWage(int wage) {
		Wage = wage;
	}



	public int getWorkedHours() {
		return WorkedHours;
	}



	public void setWorkedHours(int workedHours) {
		WorkedHours = workedHours;
	}
	
	
	public void show(){
		super.show();
		System.out.println("Wage:"+Wage);
		System.out.println("WorkedHours:"+WorkedHours);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
