package com.deltavoid.procedureOriented;

import java.util.Scanner;

public class TryString {

	public static String reverseString(String s) {
		int l = s.length();
		char[] ch = new char[l + 10];
		for (int i = 0; i < l; i++)
			ch[i] = s.charAt(l - i - 1);

		return new String(ch);
		// return s;
	}

	public static void main() {

		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();

		System.out.println(reverseString(s));

		scanner.close();
	}

}
