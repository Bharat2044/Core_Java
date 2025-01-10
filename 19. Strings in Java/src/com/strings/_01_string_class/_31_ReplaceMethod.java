package com.strings._01_string_class;

public class _31_ReplaceMethod {
	public static void main(String[] args) {

		/*
		 * public java.lang.String replace(char, char); -> The replace(char oldChar,
		 * char newChar) method in Java is a part of the String class. It's used to
		 * create a new string where all occurrences of the oldChar are replaced with
		 * the newChar.
		 * 
		 * Syntax: public String replace(char oldChar, char newChar)
		 * 
		 * oldChar: The character to be replaced.
		 * 
		 * newChar: The character to replace all occurrences of oldChar.
		 * 
		 * This method returns a new string where all occurrences of oldChar in the
		 * original string are replaced with newChar.
		 */

		String str = "Hello, world! Hello";
		System.out.println(str.replace('o', '0')); // Output: "Hell0, w0rld! Hell0"

		
		/*
		 * public java.lang.String replace(java.lang.CharSequence,
		 * java.lang.CharSequence);
		 * 
		 * The replace(CharSequence target, CharSequence replacement) method in Java is
		 * a part of the String class. It's used to create a new string where all
		 * occurrences of the specified target sequence are replaced with the
		 * replacement sequence.
		 * 
		 * Syntax: public String replace(CharSequence target, CharSequence replacement)
		 * 
		 * target: The sequence of characters to be replaced.
		 * 
		 * replacement: The sequence of characters to replace all occurrences of target.
		 * 
		 * This method returns a new string where all occurrences of the target sequence
		 * in the original string are replaced with the replacement sequence.
		 */

		System.out.println(str.replace("o", "0")); // Output: "Hell0, w0rld! Hell0"
		System.out.println(str.replace("llo", "x")); // Output: "Hex, world! Hex"
	}
}
