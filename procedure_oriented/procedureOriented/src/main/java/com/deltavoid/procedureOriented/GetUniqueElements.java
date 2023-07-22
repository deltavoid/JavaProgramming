package com.deltavoid.procedureOriented;

import java.util.Arrays;

public class GetUniqueElements {
	
	public static int[] getUniqueElements(int[] array){
		Arrays.sort(array);
		
		int l=1;
		for (int i=1;i<array.length;i++)
			if  (array[i]!=array[i-1])
				l++;
		
		int[] array2 = new int[l];
		array2[0]=array[0];
		l=1;
		
		for (int i=1;i<array.length;i++)
			if  (array[i]!=array[i-1])
				array2[l++]=array[i];
		
		return array2;
	}

	public static void main() {
		// TODO Auto-generated method stub
		int[] array = {0, 1, 2, 3, 3, 4};
		
		array=getUniqueElements(array);
		
		for (int i=0;i<array.length;i++){
			System.out.print(array[i]);
			System.out.print(' ');
		}
		System.out.println();
		

	}

}
