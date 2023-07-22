package com.deltavoid.objectExtend;

public class CommissionEmployee extends Employee {
	
	int CommissionRate;
	int GrossSales;
	
	public CommissionEmployee(){
		super();
	}
	
	

	public int getCommissionRate() {
		return CommissionRate;
	}



	public void setCommissionRate(int commissionRate) {
		CommissionRate = commissionRate;
	}



	public int getGrossSales() {
		return GrossSales;
	}



	public void setGrossSales(int grossSales) {
		GrossSales = grossSales;
	}
	
	
	public void show(){
		super.show();
		System.out.println("CommissionRate:"+CommissionRate);
		System.out.println("GrossSales"+GrossSales);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
