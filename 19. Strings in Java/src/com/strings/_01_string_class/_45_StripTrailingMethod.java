package com.strings._01_string_class;

public class _45_StripTrailingMethod {
	public static void main(String[] args) {

		/*
		 * public java.lang.String stripTrailing(); -> The stripTrailing() method in
		 * Java is a method of the String class introduced in Java 11. It's used to
		 * remove trailing whitespace characters from the end of a string.
		 * 
		 * Syntax: public String stripTrailing()
		 * 
		 * This method returns a new string where all trailing whitespace characters
		 * (spaces, tabs, and newline characters) are removed from the end of the
		 * original string.
		 */

		String str = "   Hello   ";
		String strippedStr = str.stripTrailing();

		System.out.println(strippedStr); // "   Hello"
	}
}
