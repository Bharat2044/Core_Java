package com.strings._01_string_class;

public class _05_StringComparison {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "heLlo";
		String str4 = new String("Hello");
		
		
		// Using '==' operator
		System.out.println(str1 == str2);	// true
		System.out.println(str1 == str3);	// false
		System.out.println(str1 == str4);	// false
		System.out.println(str3 == str4);	// false
		System.out.println();

		// Using equals() method
		System.out.println(str1.equals(str2));	// true
		System.out.println(str1.equals(str3));	// false
		System.out.println(str1.equals(str4));	// true
		System.out.println(str3.equals(str4));	// false
		System.out.println();

		// Using equalsIgnoreCase() method
		System.out.println(str1.equalsIgnoreCase(str2));	// true
		System.out.println(str1.equalsIgnoreCase(str3));	// true
		System.out.println(str1.equalsIgnoreCase(str4));	// true
		System.out.println(str3.equalsIgnoreCase(str4));	// true
		System.out.println();

		// Using compareTo() method
		System.out.println(str1.compareTo(str2));	// 0
		System.out.println(str1.compareTo(str3));	// -32
		System.out.println(str1.compareTo(str4));	// 0
		System.out.println(str3.compareTo(str4));	// 32
		System.out.println();

		// compareToIgnoreCase() method
		System.out.println(str1.compareToIgnoreCase(str2));	// 0
		System.out.println(str1.compareToIgnoreCase(str3));	// 0
		System.out.println(str1.compareToIgnoreCase(str4));	// 0
		System.out.println(str3.compareToIgnoreCase(str4));	// 0
		System.out.println();
	}
}
