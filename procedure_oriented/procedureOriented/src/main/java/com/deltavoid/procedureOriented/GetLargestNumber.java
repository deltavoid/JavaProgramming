package com.deltavoid.procedureOriented;

public class GetLargestNumber {
	
	public static int getLargestNumber(int[] array){
		int sol = -0x3fffffff;
		for (int i=0; i<array.length; i++){
			if  (sol<array[i])  sol=array[i];
		}
		return sol;
	}

	public static void main() {
		// TODO Auto-generated method stub
		int n=10;
		int[] array = new int[n];
		for (int i=0; i<array.length; i++)
			array[i]=i;
		
		System.out.println(getLargestNumber(array));
		
	}

}
