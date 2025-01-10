package com.strings._01_string_class;

public class _32_ReplaceFirstMethod {
	public static void main(String[] args) {

		/*
		 * public java.lang.String replaceFirst(java.lang.String, java.lang.String);
		 * 
		 * The replaceFirst(String regex, String replacement) method in Java is a part
		 * of the String class. It's used to replace the first occurrence of the
		 * specified regular expression regex in the original string with the
		 * replacement string.
		 * 
		 * Syntax: public String replaceFirst(String regex, String replacement)
		 * 
		 * regex: The regular expression pattern to be replaced.
		 * 
		 * replacement: The replacement string.
		 * 
		 * This method returns a new string where the first occurrence of the specified
		 * regular expression regex in the original string is replaced with the
		 * replacement string.
		 */

		String str = "apple, banana, apple, orange";
		String replacedString = str.replaceFirst("apple", "pear");

		System.out.println(replacedString); // Output: "pear, banana, apple, orange"
	}
}
