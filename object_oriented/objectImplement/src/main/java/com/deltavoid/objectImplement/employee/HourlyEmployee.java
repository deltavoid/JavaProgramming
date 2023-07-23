package com.deltavoid.objectImplement.employee;

public class HourlyEmployee implements Employee {

	DefaultEmployee defaultEmployee;
	int Wage;
	int WorkedHours;

	public HourlyEmployee(String name, int socialNumber, int wage, int workedHours) {

		defaultEmployee = new DefaultEmployee(name, socialNumber);

		this.Wage = wage;
		this.WorkedHours = workedHours;
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

	public void show() {
		defaultEmployee.show();
		System.out.println("Wage: " + Wage);
		System.out.println("WorkedHours: " + WorkedHours);
	}

}
