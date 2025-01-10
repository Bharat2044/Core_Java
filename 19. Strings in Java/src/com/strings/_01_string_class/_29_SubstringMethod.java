package com.strings._01_string_class;

public class _29_SubstringMethod {
	public static void main(String[] args) {
		/*
		 * public java.lang.String substring(int); -> The substring(int beginIndex)
		 * method in Java is a part of the String class. It's used to create a new
		 * string that is a substring of the original string, starting from the
		 * specified beginIndex to the end of the original string.
		 * 
		 * Syntax: public String substring(int beginIndex)
		 * 
		 * beginIndex: The beginning index, inclusive, of the substring.
		 * 
		 * This method returns a new string that represents the substring of the
		 * original string starting from the beginIndex up to the end of the original
		 * string.
		 */

		String str = "Hello, world!";
		String substring1 = str.substring(7);

		System.out.println(substring1); // Output: "world!"

		/*
		 * public java.lang.String substring(int, int); -> The substring(int beginIndex,
		 * int endIndex) method in Java is a part of the String class. It's used to
		 * create a new string that is a substring of the original string, starting from
		 * the beginIndex (inclusive) and ending at the endIndex (exclusive).
		 * 
		 * Syntax: public String substring(int beginIndex, int endIndex)
		 * 
		 * beginIndex: The beginning index, inclusive, of the substring.
		 * 
		 * endIndex: The ending index, exclusive, of the substring.
		 * 
		 * This method returns a new string that represents the substring of the
		 * original string starting from the beginIndex up to, but not including, the
		 * endIndex.
		 */
		
		String substring2 = str.substring(3, 10);

		System.out.println(substring2); // Output: "lo, wor"
	}
}
