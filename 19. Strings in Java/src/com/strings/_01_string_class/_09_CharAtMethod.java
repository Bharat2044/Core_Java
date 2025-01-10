package com.strings._01_string_class;

public class _09_CharAtMethod {
	public static void main(String[] args) {

		/*
		 * public char charAt(int); -> The charAt(int index) method in Java is a part of
		 * the String class. It's used to retrieve the character located at the
		 * specified index within the string.
		 * 
		 * Syntax: public char charAt(int index)
		 * 
		 * index: The index of the character to retrieve. It must be a valid index
		 * within the bounds of the string (i.e., between 0 and length() - 1 inclusive).
		 * 
		 * If we will give invalid index, then we will get Exception java.lang.StringIndexOutOfBoundsException.
		 * 
		 * This method returns the character located at the specified index within the string.
		 */
		
		String str = "Hello";
		char ch1 = str.charAt(0); // Retrieving the first character
		char ch2 = str.charAt(4); // Retrieving the last character

		System.out.println("First character: " + ch1); // Output: H
		System.out.println("Last character: " + ch2);  // Output: o
		
		// System.out.println(str.charAt(8));   // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 8
		// System.out.println(str.charAt(-2));  // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -2
	}
}
