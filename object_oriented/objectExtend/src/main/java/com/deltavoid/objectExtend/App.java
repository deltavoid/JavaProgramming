package com.deltavoid.objectExtend;



/**
 * Hello world!
 *
 */
public class App 
{
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee();
		employee.setFirstName("employee");
		employee.setLastName("empoyee");
		employee.setSocial_securityNumber(1);
		employee.show();
		System.out.println();
		
		SalariedEmployee salariedEmployee = new SalariedEmployee();
		salariedEmployee.setFirstName("employee");
		salariedEmployee.setLastName("salariedEmployee");
		salariedEmployee.setSocial_securityNumber(2);
		salariedEmployee.setWeeklySalary(10);
		salariedEmployee.show();
		System.out.println();
		
		HourlyEmployee hourlyEmployee = new HourlyEmployee();
		hourlyEmployee.setFirstName("employee");
		hourlyEmployee.setLastName("hourlyEmployee");
		hourlyEmployee.setSocial_securityNumber(3);
		hourlyEmployee.setWage(10);
		hourlyEmployee.setWorkedHours(10);
		hourlyEmployee.show();
		System.out.println();
		
		CommissionEmployee commissionEmployee = new CommissionEmployee();
		commissionEmployee.setFirstName("employee");
		commissionEmployee.setLastName("commissionEmployee");
		commissionEmployee.setSocial_securityNumber(4);
		commissionEmployee.setCommissionRate(10);
		commissionEmployee.setGrossSales(10);
		commissionEmployee.show();
		System.out.println();
		
		

	}
}
