package com.deltavoid.objectImplement.employee;

import com.deltavoid.objectImplement.employee.DefaultEmployee;

public class Employer {

	public static void main(String[] args) {

		Employee employee = new DefaultEmployee();
		employee.setName("DefaultEmployee");
		employee.setSocialNumber(1);
		employee.show();
		System.out.println();

		// SalariedEmployee salariedEmployee = new SalariedEmployee();
		Employee salariedEmployee = new SalariedEmployee();
		salariedEmployee.setName("salariedEmployee");
		salariedEmployee.setSocialNumber(2);
		// salariedEmployee.setWeeklySalary(10);
		salariedEmployee.show();
		System.out.println();

		// HourlyEmployee hourlyEmployee = new HourlyEmployee();
		Employee hourlyEmployee = new HourlyEmployee();
		hourlyEmployee.setName("HourlyEmployee");
		hourlyEmployee.setSocialNumber(3);
		// hourlyEmployee.setWage(10);
		// hourlyEmployee.setWorkedHours(10);
		hourlyEmployee.show();
		System.out.println();

	}

}
