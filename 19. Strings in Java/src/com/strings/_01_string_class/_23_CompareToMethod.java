package com.strings._01_string_class;

public class _23_CompareToMethod {
	public static void main(String[] args) {

		/*
		 * public int compareTo(java.lang.String); -> The compareTo(String str) method
		 * in Java is a part of the String class. It's used to compare the content of
		 * the current string with the content of the specified string
		 * lexicographically.
		 * 
		 * Syntax: public int compareTo(String str)
		 * 
		 * str: The string to be compared with the current string.
		 * 
		 * This method returns an integer value that indicates the lexicographic
		 * relationship between the two strings:
		 * 
		 * If the current string is lexicographically less than the specified string
		 * str, it returns a negative integer. If the current string is
		 * lexicographically greater than the specified string str, it returns a
		 * positive integer. If the current string is equal to the specified string str,
		 * it returns 0.
		 */

		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "hello";
		String str4 = new String("Hello");
		StringBuffer str5 = new StringBuffer("Hello");
		StringBuffer str6 = new StringBuffer("Hello");

		System.out.println(str1.compareTo(str2)); // Output: 0
		System.out.println(str1.compareTo(str3)); // Output: -32
		System.out.println(str1.compareTo(str4)); // Output: 0

		// System.out.println(str1.compareTo(str5)); // CE: The method compareTo(String)
		// in the type String is not applicable for the arguments (StringBuffer)

		System.out.println(str5.compareTo(str6)); // Output: 0
		System.out.println();

		StringBuffer buffer1 = new StringBuffer("Hello");
		StringBuffer buffer2 = new StringBuffer("Hello");

		if (buffer1.compareTo(buffer2) == 0) {
			System.out.println("The content of buffer1 and buffer2 is equal");
		} else {
			System.out.println("The content of buffer1 and buffer2 is not equal");
		}

		
		/*
		 * public int compareTo(java.lang.Object); -> The compareTo(Object obj) method
		 * in Java is a part of the Comparable interface. It's used to compare the
		 * current object with the specified object for order.
		 * 
		 * Syntax: public int compareTo(Object obj)
		 * 
		 * obj: The object to be compared with the current object.
		 * 
		 * This method returns an integer value that indicates the relative ordering of
		 * the current object and the specified object:
		 * 
		 * If the current object is less than the specified object, it returns a
		 * negative integer.
		 * 
		 * If the current object is greater than the specified object, it returns a
		 * positive integer.
		 * 
		 * If the current object is equal to the specified object, it returns 0.
		 */
	}
}
