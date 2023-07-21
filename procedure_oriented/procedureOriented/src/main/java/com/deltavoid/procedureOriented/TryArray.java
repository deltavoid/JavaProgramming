package com.deltavoid.procedureOriented;

public class TryArray {

	public static void main() {

		int n = 100;
		int[] a = new int[n + 10];
		for (int i = 1; i <= n; i++)
			a[i] = i;

		int sol = 0;
		for (int i = 1; i <= n; i++)
			sol += a[i];

		sol /= 100;

		System.out.println(sol);

	}

}
