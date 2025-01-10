package com.strings._01_string_class;

public class _22_ContentEqualsMethod {
	public static void main(String[] args) {

		/*
		 * public boolean contentEquals(java.lang.StringBuffer); -> The
		 * contentEquals(StringBuffer sb) method in Java is a part of the String class.
		 * It's used to compare the content of the current string with the specified
		 * StringBuffer for equality.
		 * 
		 * Syntax: public boolean contentEquals(StringBuffer sb)
		 * 
		 * sb: The StringBuffer to be compared with the content of the current string.
		 * 
		 * This method returns true if the content of the current string is equal to the
		 * content of the specified StringBuffer. It returns false otherwise.
		 */

		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "hello";
		String str4 = new String("Hello");
		StringBuffer str5 = new StringBuffer("Hello");
		StringBuffer str6 = new StringBuffer("Hello");

		System.out.println(str1.contentEquals(str2)); // Output: true
		System.out.println(str1.contentEquals(str3)); // Output: false
		System.out.println(str1.contentEquals(str4)); // Output: true

		System.out.println(str1.contentEquals(str5)); // Output: true
		System.out.println(str3.contentEquals(str5)); // Output: false
		System.out.println(str4.contentEquals(str5)); // Output: true

		// System.out.println(str5.contentEquals(str6)); // CE: Error

		// System.out.println(str1.contentEquals(123)); // CE: Error
		System.out.println();
		

		/*
		 * public boolean contentEquals(java.lang.CharSequence); -> The
		 * contentEquals(CharSequence cs) method in Java is a part of the String class.
		 * It's used to compare the content of the current string with the specified
		 * CharSequence for equality.
		 * 
		 * Syntax: public boolean contentEquals(CharSequence cs)
		 * 
		 * cs: The CharSequence to be compared with the content of the current string.
		 * 
		 * This method returns true if the content of the current string is equal to the
		 * content of the specified CharSequence. It returns false otherwise.
		 * 
		 * CharSequence is an interface implemented by classes like String,
		 * StringBuffer, and StringBuilder, allowing them to be treated as sequences of
		 * characters. Therefore, you can pass instances of String, StringBuffer,
		 * StringBuilder, or any other class implementing the CharSequence interface to
		 * the contentEquals() method.
		 */
		String str = "Hello";
		StringBuffer buffer = new StringBuffer("Hello");
		StringBuilder builder = new StringBuilder("Hello");
		String anotherStr = "World";

		System.out.println(str.contentEquals(buffer));   // Output: true
		System.out.println(str.contentEquals(builder));  // Output: true
		// System.out.println(buffer.contentEquals(builder));  // CE: Error
		System.out.println(str.contentEquals(anotherStr)); // Output: false
	}
}
