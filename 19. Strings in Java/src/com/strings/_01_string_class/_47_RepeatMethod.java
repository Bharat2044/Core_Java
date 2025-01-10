package com.strings._01_string_class;

public class _47_RepeatMethod {
	public static void main(String[] args) {

		/*
		 * public java.lang.String repeat(int); -> The repeat(int count) method in Java
		 * is a method of the String class introduced in Java 11. It's used to create a
		 * new string by concatenating the original string with itself a specified
		 * number of times.
		 * 
		 * Syntax: public String repeat(int count)
		 * 
		 * count: The number of times the original string should be repeated.
		 * 
		 * This method returns a new string that is a concatenation of the original
		 * string repeated count times.
		 */

		String str1 = "abc";
		String str2 = "Bharat Kumar ";
		String repeatedStr1 = str1.repeat(5);
		String repeatedStr2 = str2.repeat(3);

		System.out.println(repeatedStr1);
		System.out.println(repeatedStr2);
	}
}
