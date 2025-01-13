package com.oops._03_methods;

public class _06_Concat2Strings {

	private static String concat(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		
		return fullName;
	}

	public static void main(String[] args) {

		String firstName = "Bharat";
		String lastName = "Kumar";

		String fullName = concat(firstName, lastName);

		System.out.println(fullName);
	}
}
