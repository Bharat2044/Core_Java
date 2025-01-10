package com.strings._01_string_class;

public class _30_SubSequenceMethod {
	public static void main(String[] args) {

		/*
		 * public java.lang.CharSequence subSequence(int, int); -> The subSequence(int
		 * beginIndex, int endIndex) method in Java is a part of the String class. It's
		 * used to create a new CharSequence that is a subsequence of the original
		 * string, starting from the beginIndex (inclusive) and ending at the endIndex
		 * (exclusive).
		 * 
		 * Syntax: public CharSequence subSequence(int beginIndex, int endIndex)
		 * 
		 * beginIndex: The beginning index, inclusive, of the subsequence.
		 * 
		 * endIndex: The ending index, exclusive, of the subsequence.
		 * 
		 * This method returns a new CharSequence that represents the subsequence of the
		 * original string starting from the beginIndex up to, but not including, the
		 * endIndex.
		 */

		String str = "Hello, world!";
		CharSequence subsequence = str.subSequence(7, 12);

		System.out.println(subsequence); // Output: "world"
	}
}
