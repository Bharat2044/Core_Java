package com.strings._01_string_class;

public class _17_GetCharsMethod {
	public static void main(String[] args) {

		/*
		 * public void getChars(int, int, char[], int); -> The getChars(int srcBegin,
		 * int srcEnd, char[] dst, int dstBegin) method in Java is a part of the String
		 * class. It's used to copy characters from the string into a character array.
		 * 
		 * Syntax: public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
		 * 
		 * srcBegin: The index of the first character in the string to copy.
		 * 
		 * srcEnd: The index after the last character in the string to copy. The
		 * character at index srcEnd - 1 is the last character to be copied.
		 * 
		 * dst: The destination array where the characters will be copied. dstBegin: The
		 * index in the destination array dst where the first character will be copied.
		 * 
		 * This method copies characters from the string starting at index srcBegin up
		 * to (but not including) index srcEnd into the destination array dst, starting
		 * at index dstBegin.
		 */
		String str = "Hello, World!";
		char[] chars = new char[5];   // Destination array to store characters
		
		str.getChars(0, 5, chars, 0); // Copy characters from index 0 to 5 (excluding) into the chars array starting from index 0
		System.out.println(chars);    // Output: Hello
		
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}

	}
}
