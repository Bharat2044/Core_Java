package com.strings._01_string_class;

public class _07_IsEmptyMethod {
	public static void main(String[] args) {

		/*
		 * public boolean isEmpty(); ->The isEmpty() method in Java is a part of the
		 * String class. It's used to check whether a string is empty, i.e., whether it
		 * contains zero characters.
		 * 
		 * Syntax: public boolean isEmpty()
		 * 
		 * This method returns true if the length of the string is zero 
		 * (i.e., it contains no characters), and false otherwise.
		 */
		
		String str1 = ""; 		// Empty string
		String str2 = "Hello";  // Non-empty string
		String str3 = "  "; 	// Non-empty string

		boolean isEmpty1 = str1.isEmpty();
		boolean isEmpty2 = str2.isEmpty();
		boolean isEmpty3 = str3.isEmpty();

		System.out.println("Is str1 empty? " + isEmpty1); // true
		System.out.println("Is str2 empty? " + isEmpty2); // false
		System.out.println("Is str3 empty? " + isEmpty3); // false
		
		System.out.println(str1.isBlank());	// true
		System.out.println(str2.isBlank()); // false
		System.out.println(str3.isBlank()); // true
		
		System.out.println("Raj".isEmpty()); // false
		System.out.println("Raj".isBlank()); // false
	}
}
