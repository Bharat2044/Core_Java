package com.strings._01_string_class;

public class _15_ConcatMethod {
	public static void main(String[] args) {

		/*
		 * public java.lang.String concat(java.lang.String); -> The concat(String str)
		 * method in Java is a part of the String class. It's used to concatenate the
		 * specified string str to the end of the invoking string.
		 * 
		 * Syntax: public String concat(String str)
		 * 
		 * str: The string to be concatenated to the end of the invoking string.
		 * 
		 * This method returns a new string that represents the concatenation of the
		 * invoking string followed by the specified string str.
		 */
		
		String str1 = "Hello";
		String str2 = " World!";
		
		String concatenatedString = str1.concat(str2);
		System.out.println(concatenatedString);  // Output: Hello World!
		
		System.out.println("Hello ".concat("Hi ").concat("Hola ").concat("Bye"));  // // Output: Hello Hi Hola Bye

	}
}
