package com.strings._01_string_class;

public class _10_CodePointAtMethod {
	public static void main(String[] args) {

		/*
		 * public int codePointAt(int); -> The codePointAt(int index) method in Java is
		 * a part of the String class. It's used to retrieve the Unicode code point
		 * value of the character located at the specified index within the string.
		 * 
		 * Syntax: public int codePointAt(int index)
		 * 
		 * index: The index of the character for which to retrieve the Unicode code
		 * point. It must be a valid index within the bounds of the string (i.e.,
		 * between 0 and length() - 1 inclusive).
		 * 
		 * If we will give invalid index, then we will get Exception java.lang.StringIndexOutOfBoundsException.
		 * 
		 * This method returns the Unicode code point value of the character located at
		 * the specified index within the string.
		 */
		
		String str = "Hello";
		int codePoint1 = str.codePointAt(0); // Retrieving the Unicode code point of the first character
		int codePoint2 = str.codePointAt(2); // Retrieving the Unicode code point of the third character

		System.out.println("Unicode code point of the first character: " + codePoint1);  // Output: 72 (Unicode code point for 'H')
		System.out.println("Unicode code point of the third character: " + codePoint2); // Output: 101 (Unicode code point for 'l')

	}
}
