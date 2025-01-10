package com.strings._01_string_class;

public class _38_CopyValueOfMethod {
	public static void main(String[] args) {

		/*
		 * public static java.lang.String copyValueOf(char[]); -> The copyValueOf(char[]
		 * data) method in Java is a static method of the String class. It's used to
		 * create a new string containing the characters from the specified character
		 * array data.
		 * 
		 * Syntax: public static String copyValueOf(char[] data)
		 * 
		 * data: The character array whose contents are to be used to create the string.
		 * 
		 * This method returns a new string containing the characters from the specified
		 * character array. The entire array is converted into a string.
		 * 
		 * 
		 * public static java.lang.String valueOf(char[], int, int);
		 */

		char[] charArray = { 'H', 'e', 'l', 'l', 'o' };
		String str1 = String.copyValueOf(charArray);
		String str2 = String.copyValueOf(charArray, 1, 3);

		System.out.println(str1); // Output: "Hello"
		System.out.println(str2); // Output: "ell"
	}
}
