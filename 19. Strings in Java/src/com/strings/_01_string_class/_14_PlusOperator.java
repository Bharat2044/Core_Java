package com.strings._01_string_class;

public class _14_PlusOperator {
	public static void main(String[] args) {

		/*
		 * + operator -> The + operator is used for concatenating strings, as well as
		 * for performing arithmetic addition on numeric data types.
		 * 
		 * When used with strings, the '+' operator concatenates two strings together to
		 * form a new string. This process is known as string concatenation.
		 */
		
		String str1 = "Hello";
		String str2 = "World!";
		
		String combinedString = str1 + " " + str2;
		System.out.println(combinedString);  // Output: Hello World!
		System.out.println("Hi " + "Hello " + "Bye " + "Hola");  // Output: Hi Hello Bye Hola
		
		
		int a = 5;
		int b = 3;
		
		int sum = a + b;
		System.out.println(sum);  // Output: 8
	}
}
