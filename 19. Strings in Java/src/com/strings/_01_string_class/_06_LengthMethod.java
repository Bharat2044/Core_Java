package com.strings._01_string_class;

public class _06_LengthMethod {
	public static void main(String[] args) {

		/*
		 * public int length(); -> In Java, the length() method is a part of the String
		 * class. It's used to get the length of the string, i.e., the number of
		 * characters in the string.
		 * 
		 * Syntax: public int length() 
		 * 
		 * This method returns an integer representing the number of characters in the string.
		 */
		
		String str = "Hello, World!";
		int length = str.length();
		
		System.out.println(length); 	// Output: 13
		System.out.println("Raju".length()); 	// Output: 4
	}
}
