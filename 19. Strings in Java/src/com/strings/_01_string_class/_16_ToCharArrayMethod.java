package com.strings._01_string_class;

public class _16_ToCharArrayMethod {
	public static void main(String[] args) {

		/*
		 * public char[] toCharArray(); -> The toCharArray() method in Java is a part of
		 * the String class. It's used to convert the string into a character array.
		 * 
		 * Syntax: public char[] toCharArray()
		 * 
		 * This method returns a newly allocated character array containing the same
		 * sequence of characters as the string.
		 */
		
		String str = "Hello, World!";
		char[] charArray = str.toCharArray();

		System.out.println(charArray);
		
		for (char c : charArray) {
			System.out.println(c);
		}
	}
}
