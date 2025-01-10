package com.strings._01_string_class;

public class _20_EqualsMethod {
	public static void main(String[] args) {

		/*
		 * public boolean equals(java.lang.Object); -> The equals(Object obj) method in
		 * Java is a part of the String class. It's used to compare the contents of the
		 * current string with the specified object for equality.
		 * 
		 * Syntax: public boolean equals(Object obj)
		 * 
		 * obj: The object to be compared with the current string.
		 * 
		 * This method returns true if the specified object is a String object
		 * representing the same sequence of characters as this string, false otherwise.
		 */
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "hello";
		String str4 = new String("Hello");
		StringBuffer str5 = new StringBuffer("Hello");
		StringBuffer str6 = new StringBuffer("Hello");

		System.out.println(str1.equals(str2)); // Output: true
		System.out.println(str1.equals(str3)); // Output: false
		System.out.println(str1.equals(str4)); // Output: true
		
		System.out.println(str1.equals(str5)); // Output: false
		
		System.out.println(str5.equals(str6)); // Output: false
		
		System.out.println(str1.equals(str5)); // Output: false
		System.out.println(str4.equals(str5)); // Output: false
		
		System.out.println(str1.equals(123)); // Output: false
		System.out.println();
		
		
		StringBuffer buffer1 = new StringBuffer("Hello");
		StringBuffer buffer2 = new StringBuffer("Hello");

		if (buffer1.equals(buffer2)) {
		    System.out.println("The content of buffer1 and buffer2 is equal");
		} else {
		    System.out.println("The content of buffer1 and buffer2 is not equal");
		}

		if (buffer1.toString().equals(buffer2.toString())) {
		    System.out.println("The content of buffer1 and buffer2 is equal (case-insensitive)");
		} else {
		    System.out.println("The content of buffer1 and buffer2 is not equal (case-insensitive)");
		}

		if (buffer1.toString().equalsIgnoreCase(buffer2.toString())) {
		    System.out.println("The content of buffer1 and buffer2 is equal (case-insensitive)");
		} else {
		    System.out.println("The content of buffer1 and buffer2 is not equal (case-insensitive)");
		}
	}
}
