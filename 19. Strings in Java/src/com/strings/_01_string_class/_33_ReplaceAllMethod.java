package com.strings._01_string_class;

public class _33_ReplaceAllMethod {
	public static void main(String[] args) {

		/*
		 * public java.lang.String replaceAll(java.lang.String, java.lang.String);
		 * 
		 * The replaceAll(String regex, String replacement) method in Java is a part of
		 * the String class. It's used to replace all occurrences of the specified
		 * regular expression regex in the original string with the replacement string.
		 * 
		 * Syntax: public String replaceAll(String regex, String replacement)
		 * 
		 * regex: The regular expression pattern to be replaced.
		 * 
		 * replacement: The replacement string.
		 * 
		 * This method returns a new string where all occurrences of the specified
		 * regular expression regex in the original string are replaced with the
		 * replacement string.
		 */

		String str = "apple, banana, apple, orange";
		String replacedString = str.replaceAll("apple", "pear");

		System.out.println(replacedString); // Output: "pear, banana, pear, orange"
	}
}
