package com.deltavoid.procedureOriented;

public class PrintExample {

	public static void printTriangle() {

		char ch = '*';

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(ch);
			System.out.println();
		}

	}

	public static void printAsicsII() {

		for (int i = 32; i <= 255; i++) {
			System.out.println((char) i);
		}

	}

	public static void printZ() {

		System.out.println(Math.sqrt(4 * 4 + 7 * 7));

	}

}
