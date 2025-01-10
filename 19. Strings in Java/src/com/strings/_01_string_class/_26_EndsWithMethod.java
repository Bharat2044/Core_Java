package com.strings._01_string_class;

public class _26_EndsWithMethod {
	public static void main(String[] args) {

		/*
		 * public boolean endsWith(java.lang.String); -> The endsWith(String suffix)
		 * method in Java is a part of the String class. It's used to check whether the
		 * current string ends with the specified suffix.
		 * 
		 * Syntax: public boolean endsWith(String suffix)
		 * 
		 * suffix: The string to be checked as a suffix of the current string.
		 * 
		 * This method returns true if the current string ends with the specified
		 * suffix; otherwise, it returns false.
		 */

		String str = "Hello, world!";

		System.out.println(str.endsWith("!")); // Output: true
		System.out.println(str.endsWith("world!")); // Output: true
		System.out.println(str.endsWith("World!")); // Output: false (case-sensitive)
		System.out.println(str.endsWith("Hello")); // Output: false
	}
}
