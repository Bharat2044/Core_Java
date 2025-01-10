package com.strings._01_string_class;

public class _35_ContainsMethod {
	public static void main(String[] args) {

		/*
		 * public boolean contains(java.lang.CharSequence); -> The contains(CharSequence
		 * s) method in Java is a part of the String class. It's used to check whether
		 * the current string contains the specified sequence of characters s.
		 * 
		 * Syntax: public boolean contains(CharSequence s)
		 * 
		 * s: The character sequence to be searched for within the string.
		 * 
		 * This method returns true if the specified sequence of characters s is found
		 * within the original string; otherwise, it returns false.
		 */

		String str = "Hello, world!";
		boolean containsWorld = str.contains("world");

		System.out.println(containsWorld); // Output: true
		System.out.println(str.contains("!")); // Output: true
		System.out.println(str.contains("x")); // Output: false
	}
}
