package com.deltavoid.procedureOriented;



public class PrintTriangle {

	public static void main() {
		// TODO Auto-generated method stub
		char ch = '*' ;
		
		for (int i=1; i<=5; i++){
			for (int j=1; j<=i; j++)
				System.out.print(ch);
			System.out.println();
		}

	}

}
