package com.strings._01_string_class;

public class _24_CompareToIgnoreCase {
	public static void main(String[] args) {

		/*
		 * public int compareToIgnoreCase(java.lang.String); -> The
		 * compareToIgnoreCase(String str) method in Java is a part of the String class.
		 * It's used to compare the content of the current string with the content of
		 * the specified string lexicographically, ignoring differences in case.
		 * 
		 * Syntax: public int compareToIgnoreCase(String str)
		 * 
		 * str: The string to be compared with the current string.
		 * 
		 * This method returns an integer value that indicates the lexicographic
		 * relationship between the two strings, while ignoring case:
		 * 
		 * If the current string, ignoring case, is lexicographically less than the
		 * specified string str, it returns a negative integer.
		 * If the current string, ignoring case, is lexicographically greater than the
		 * specified string str, it returns a positive integer.
		 * If the current string, ignoring case, is equal to the specified string str,
		 * it returns 0.
		 */
		
		String str1 = "hello";
		String str2 = "World";
		String str3 = "Hello";

		System.out.println(str1.compareToIgnoreCase(str2));  // Output: -15
		System.out.println(str2.compareToIgnoreCase(str1));  // Output: 15
		System.out.println(str1.compareToIgnoreCase(str3));  // Output: 0

	}
}
