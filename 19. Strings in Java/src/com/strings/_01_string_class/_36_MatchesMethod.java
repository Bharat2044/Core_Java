package com.strings._01_string_class;

public class _36_MatchesMethod {
	public static void main(String[] args) {

		/*
		 * public boolean matches(java.lang.String); -> The matches(String regex) method
		 * in Java is a part of the String class. It's used to determine whether the
		 * entire string matches the specified regular expression regex.
		 * 
		 * Syntax: public boolean matches(String regex)
		 * 
		 * regex: The regular expression pattern to be matched against the string.
		 * 
		 * This method returns true if the entire string matches the specified regular
		 * expression regex; otherwise, it returns false.
		 */

		String str = "Hello123";
		boolean matchesRegex = str.matches("[a-zA-Z]+[0-9]+");

		System.out.println(matchesRegex); // Output: true
	}
}
