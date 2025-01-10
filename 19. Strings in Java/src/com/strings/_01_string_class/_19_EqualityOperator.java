package com.strings._01_string_class;

public class _19_EqualityOperator {
	public static void main(String[] args) {

		/*
		 * '==' operator -> The == operator in Java is used to compare the reference
		 * equality of two objects. When applied to objects (including strings), it
		 * checks whether the two references point to the same memory location in the
		 * Java heap.
		 * 
		 * For primitive types (e.g., int, char, boolean), == compares their actual values.
		 */
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "hello";
		String str4 = new String("Hello");
		StringBuffer str5 = new StringBuffer("Hello");

		System.out.println(str1 == str2);  // Output: true
		System.out.println(str1 == str3);  // Output: false
		System.out.println(str1 == str4);  // Output: false
		
		// System.out.println(str1 == str5);  // Compilation Error: Incompatible operand types String and StringBuffer
		
		// System.out.println(str1 == 123);  // Compilation Error: Incompatible operand types String and int
	}
}
