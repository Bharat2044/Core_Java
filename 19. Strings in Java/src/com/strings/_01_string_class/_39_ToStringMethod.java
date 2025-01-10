package com.strings._01_string_class;

public class _39_ToStringMethod {
	public static void main(String[] args) {
		/*
		 * public java.lang.String toString(); -> The toString() method in Java is a
		 * method inherited from the Object class. It's overridden in the String class
		 * to return the string itself.
		 * 
		 * Syntax: public String toString()
		 * 
		 * This method returns the string itself.
		 */

		String str = "Hello";
		String result = str.toString();

		System.out.println(result); // Output: "Hello"
		System.out.println(Integer.valueOf(10).toString()); // Output: "10"
		System.out.println(Double.valueOf(9.7).toString()); // Output: "9.7"
		System.out.println(Boolean.valueOf(true).toString()); // Output: "true"
		
		// System.out.println(10.toString()); // CE: Error
	}
}
