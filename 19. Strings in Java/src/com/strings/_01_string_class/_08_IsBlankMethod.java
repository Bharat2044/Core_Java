package com.strings._01_string_class;

public class _08_IsBlankMethod {
	public static void main(String[] args) {

		/*
		 * public boolean isBlank()
		 * 
		 * The isBlank() method in Java is a part of the String class introduced in Java 11. 
		 * It's used to check whether a string is empty or contains only whitespace characters. 
		 * 
		 * This method returns true if the string is empty or contains only
		 * whitespace characters, and false otherwise.
		 */
		
		String str1 = ""; 		// Empty string
		String str2 = "   "; 	// String containing only whitespace characters
		String str3 = "Hello";  // Non-empty string

		boolean isBlank1 = str1.isBlank();
		boolean isBlank2 = str2.isBlank();
		boolean isBlank3 = str3.isBlank();

		System.out.println("Is str1 blank? " + isBlank1); // true
		System.out.println("Is str2 blank? " + isBlank2); // true
		System.out.println("Is str3 blank? " + isBlank3); // false

	}
}
