package com.strings._01_string_class;

public class _43_IndentMethod {
	public static void main(String[] args) {

		/*
		 * public java.lang.String indent(int); -> The indent(int n) method in Java is a
		 * method of the String class introduced in Java 12. It's used to create a new
		 * string where each line in the original string is indented by the specified
		 * number of spaces.
		 * 
		 * Syntax: public String indent(int n)
		 * 
		 * n: The number of spaces by which each line should be indented. It can be
		 * positive, negative, or zero.
		 * 
		 * This method returns a new string with each line of the original string
		 * indented by the specified number of spaces.
		 */

		String str1 = "Hello\nWorld";
		String str2 = "HelloWorld";
		String indentedStr1 = str1.indent(4);
		String indentedStr2 = str2.indent(5);

		System.out.println(indentedStr1.length());
		System.out.println(indentedStr1);
		
		System.out.println(indentedStr2.length());
		System.out.println(indentedStr2);
	}
}
