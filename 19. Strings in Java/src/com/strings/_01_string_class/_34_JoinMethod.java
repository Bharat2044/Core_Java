package com.strings._01_string_class;

public class _34_JoinMethod {
	public static void main(String[] args) {

		/*
		 * public static java.lang.String join(java.lang.CharSequence, java.lang.CharSequence...);
		 * 
		 * The join(CharSequence delimiter, CharSequence... elements) method in Java is
		 * a static method of the String class introduced in Java 8. It's used to join
		 * multiple character sequences (elements) into a single string, using the
		 * specified delimiter to separate them.
		 * 
		 * Syntax: public static String join(CharSequence delimiter, CharSequence... elements)
		 * 
		 * delimiter: The character sequence used to separate the elements in the
		 * resulting string.
		 * 
		 * elements: An array of character sequences to be joined together.
		 * 
		 * This method returns a new string that consists of the concatenation of the
		 * elements separated by the specified delimiter.
		 */

		String[] fruits = {"apple", "banana", "orange"};
		String joinedString = String.join(", ", fruits);
		
		System.out.println(joinedString);  // Output: "apple, banana, orange"
	}
}
