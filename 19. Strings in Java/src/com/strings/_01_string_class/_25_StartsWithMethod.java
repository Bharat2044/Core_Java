package com.strings._01_string_class;

public class _25_StartsWithMethod {
	public static void main(String[] args) {

		/*
		 * public boolean startsWith(java.lang.String); -> The startsWith(String prefix)
		 * method in Java is a part of the String class. It's used to check whether the
		 * current string starts with the specified prefix.
		 * 
		 * Syntax: public boolean startsWith(String prefix)
		 * 
		 * prefix: The string to be checked as a prefix of the current string.
		 * 
		 * This method returns true if the current string starts with the specified
		 * prefix; otherwise, it returns false.
		 */

		String str = "Hello, world!";

		System.out.println(str.startsWith("H")); // Output: true
		System.out.println(str.startsWith("x")); // Output: false

		// System.out.println(str.startsWith('p')); // CE: error: incompatible types:
		// char cannot be converted to String

		System.out.println(str.startsWith("Hello")); // Output: true
		System.out.println(str.startsWith("hello")); // Output: false (case-sensitive)
		System.out.println(str.startsWith("world")); // Output: false
		System.out.println();

		/*
		 * public boolean startsWith(java.lang.String, int); -> The startsWith(String
		 * prefix, int offset) method in Java is a part of the String class. It's used
		 * to check whether a substring of the current string, starting at the specified
		 * offset index, starts with the specified prefix.
		 * 
		 * Syntax: public boolean startsWith(String prefix, int offset)
		 * 
		 * prefix: The string to be checked as a prefix of the substring.
		 * 
		 * offset: The index from which to start the comparison within the current
		 * string.
		 * 
		 * This method returns true if the substring of the current string, starting at
		 * the specified offset, starts with the specified prefix; otherwise, it returns
		 * false.
		 */

		System.out.println(str.startsWith("Hello", 0)); // Output: true (entire string starts with "Hello")
		System.out.println(str.startsWith("world", 7)); // Output: true (substring from index 7 starts with "world")
		System.out.println(str.startsWith("world", 8)); // Output: false (substring from index 8 does not start with

	}
}
