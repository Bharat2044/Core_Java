package com.strings._01_string_class;

public class _41_InternMethod {
	public static void main(String[] args) {

		/*
		 * public java.lang.String intern(); -> The intern() method in Java is a method
		 * of the String class. It's used to ensure that strings with the same content
		 * share the same memory location in the string constant pool.
		 * 
		 * Here's how it works:
		 * When you call intern() on a string object, Java checks if a string with the
		 * same content already exists in the string constant pool.
		 * If a string with the same content exists, the intern() method returns a
		 * reference to that string from the pool.
		 * If the string doesn't exist in the pool, it adds the string to the pool and
		 * returns a reference to it.
		 * 
		 * Syntax: public String intern()
		 * 
		 * This method returns a canonical representation of the string object.
		 */

		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = str1.intern();
		String str4 = str2.intern();

		System.out.println(str1 == str2); // false
		System.out.println(str1 == str3); // true
		System.out.println(str1 == str4); // true
		System.out.println(str3 == str4); // true
	}
}
