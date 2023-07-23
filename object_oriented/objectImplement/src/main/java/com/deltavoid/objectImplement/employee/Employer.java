package com.deltavoid.objectImplement.employee;

import com.deltavoid.objectImplement.employee.DefaultEmployee;

public class Employer {

	public static void main(String[] args) {

		Employee employee = new DefaultEmployee("DefaultEmployee", 1);
		// employee.setName("DefaultEmployee");
		// employee.setSocialNumber(1);
		employee.show();
		System.out.println();

		// SalariedEmployee salariedEmployee = new SalariedEmployee();
		Employee salariedEmployee = new SalariedEmployee("SalariedEmployee", 2, 10);
		// salariedEmployee.setName("salariedEmployee");
		// salariedEmployee.setSocialNumber(2);
		salariedEmployee.show();
		System.out.println();

		// HourlyEmployee hourlyEmployee = new HourlyEmployee();
		Employee hourlyEmployee = new HourlyEmployee("HourlyEmployee", 3, 10, 10);
		// hourlyEmployee.setName("HourlyEmployee");
		// hourlyEmployee.setSocialNumber(3);
		hourlyEmployee.show();
		System.out.println();

	}

}
