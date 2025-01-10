package com.strings._01_string_class;

public class _40_TrimAndStripMethod {
	public static void main(String[] args) {

		/*
		 * public java.lang.String trim(); -> The trim() method in Java is a method of
		 * the String class. It's used to remove leading and trailing whitespace
		 * (spaces, tabs, and newline characters) from a string.
		 * 
		 * Syntax: public String trim()
		 * 
		 * This method returns a new string with leading and trailing whitespace
		 * removed.
		 * 
		 * 
		 * public java.lang.String strip(); -> The strip() method in Java is a method of
		 * the String class introduced in Java 11. It's used to remove leading and
		 * trailing whitespace characters from a string.
		 * 
		 * Syntax: public String strip()
		 * 
		 * This method returns a new string with leading and trailing whitespace
		 * removed.
		 */

		String str = "   Hello, World!   ";
		String trimmedStr = str.trim(); // Removes ASCII whitespace
		String strippedStr = str.strip(); // Removes Unicode whitespace

		System.out.println(trimmedStr); // Output: "Hello, World!"
		System.out.println(strippedStr); // Output: "Hello, World!"

		
		/*
		 * The trim() and strip() methods in Java both serve the purpose of removing
		 * leading and trailing whitespace characters from a string. However, there are
		 * some differences between them:
		 * 
		 * Introduced Version:
		 * trim(): It's been available since the early versions of Java (prior to Java 11). 
		 * strip(): Introduced in Java 11.
		 * 
		 * Whitespace Characters:
		 * trim(): It removes ASCII whitespace characters, such as spaces, tabs, and
		 * newline characters.
		 * strip(): It removes all whitespace characters recognized by Unicode,
		 * including non-breaking space (U+00A0) and other whitespace characters in
		 * different locales.
		 * 
		 * Unicode-Aware:
		 * trim(): It's not Unicode-aware and only removes ASCII whitespace characters.
		 * strip(): It's Unicode-aware and handles whitespace characters properly in
		 * different locales, making it suitable for internationalization purposes.
		 * 
		 * Return Type:
		 * Both methods return a new string with leading and trailing whitespace
		 * removed.
		 * 
		 * Usage:		 * 
		 * If you're working with ASCII characters and need basic whitespace trimming,
		 * trim() is sufficient and more widely supported across Java versions.
		 * If you require Unicode-aware whitespace trimming, especially in
		 * internationalization contexts, or if you're working with characters from
		 * various locales, strip() is more appropriate.
		 */
	}
}
