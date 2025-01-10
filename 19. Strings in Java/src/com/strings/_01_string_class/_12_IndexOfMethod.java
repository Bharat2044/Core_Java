package com.strings._01_string_class;

public class _12_IndexOfMethod {

	public static void main(String[] args) {

		/*
		 * public int indexOf(char); -> The indexOf(char ch) method in Java is a part of
		 * the String class. It's used to find the index of the first occurrence of the
		 * specified character within the string.
		 * 
		 * Syntax: public int indexOf(char ch)
		 * 
		 * ch: The character to search for within the string.
		 * 
		 * This method returns the index of the first occurrence of the specified
		 * character within the string. If the character is not found, it returns -1.
		 * 
		 */

		String str = "Hello, World!";

		System.out.println(str.indexOf('o')); // Output: 4
		System.out.println(str.indexOf('x')); // Output: -1
		System.out.println();

		
		/*
		 * public int indexOf(char, int); -> The indexOf(char ch, int fromIndex) method
		 * in Java is a part of the String class. It's used to find the index of the
		 * first occurrence of the specified character within the string, starting from
		 * the specified index fromIndex.
		 * 
		 * Syntax: public int indexOf(char ch, int fromIndex)
		 * 
		 * ch: The character to search for within the string.
		 * 
		 * fromIndex: The index from which to start the search. The search begins at
		 * fromIndex and proceeds toward the end of the string.
		 * 
		 * This method returns the index of the first occurrence of the specified
		 * character within the string, starting the search from the specified index
		 * fromIndex. If the character is not found after fromIndex, it returns -1.
		 */
		System.out.println(str.indexOf('o', 2)); // Output: 4
		System.out.println(str.indexOf('l', 5)); // Output: 10
		System.out.println(str.indexOf('x', 19)); // Output: -1
		System.out.println();

		
		/*
		 * public int indexOf(java.lang.String); -> The indexOf(String str) method in
		 * Java is a part of the String class. It's used to find the index of the first
		 * occurrence of the specified substring within the string.
		 * 
		 * Syntax: public int indexOf(String str)
		 * 
		 * str: The substring to search for within the string.
		 * 
		 * This method returns the index of the first occurrence of the specified
		 * substring within the string. If the substring is not found, it returns -1.
		 */
		System.out.println(str.indexOf("l")); // Output: 2
		System.out.println(str.indexOf("World")); // Output: 7
		System.out.println(str.indexOf("xyz")); // Output: -1
		System.out.println();

		
		/*
		 * public int indexOf(java.lang.String, int); -> The indexOf(String str, int
		 * fromIndex) method in Java is a part of the String class. It's used to find
		 * the index of the first occurrence of the specified substring within the
		 * string, starting from the specified index fromIndex.
		 * 
		 * Syntax: public int indexOf(String str, int fromIndex)
		 * 
		 * str: The substring to search for within the string.
		 * 
		 * fromIndex: The index from which to start the search. The search begins at
		 * fromIndex and proceeds toward the end of the string.
		 * 
		 * This method returns the index of the first occurrence of the specified
		 * substring within the string, starting the search from the specified index
		 * fromIndex. If the substring is not found after fromIndex, it returns -1.
		 */
		System.out.println(str.indexOf("l", 5)); // Output: 10
		System.out.println(str.indexOf("o", 5)); // Output: 8
		System.out.println(str.indexOf("World", 3)); // Output: 7
		System.out.println(str.indexOf("xyz", 7)); // Output: -1
		System.out.println();

		
		/*
		 * public int indexOf(int); -> The indexOf(int ch) method in Java is a part of
		 * the String class. It's used to find the index of the first occurrence of the
		 * specified Unicode code point (character) within the string.
		 * 
		 * Syntax: public int indexOf(int ch)
		 * 
		 * ch: The Unicode code point (character) to search for within the string.
		 * 
		 * This method returns the index of the first occurrence of the specified
		 * character within the string. If the character is not found, it returns -1.
		 */

		System.out.println(str.indexOf(101)); // Output: 1 => 101 -> e
		System.out.println(str.indexOf(87)); // Output: 7 => 87 -> W
		System.out.println(str.indexOf(108)); // Output: 2 => 108 -> l
		System.out.println();

		
		/*
		 * public int indexOf(int, int); -> The indexOf(int ch, int fromIndex) method in
		 * Java is a part of the String class. It's used to find the index of the first
		 * occurrence of the specified Unicode code point (character) within the string,
		 * starting from the specified index fromIndex.
		 * 
		 * Syntax: public int indexOf(int ch, int fromIndex)
		 * 
		 * ch: The Unicode code point (character) to search for within the string.
		 * 
		 * fromIndex: The index from which to start the search. The search begins at
		 * fromIndex and proceeds toward the end of the string.
		 * 
		 * This method returns the index of the first occurrence of the specified
		 * character within the string, starting the search from the specified index
		 * fromIndex. If the character is not found after fromIndex, it returns -1.
		 */
		System.out.println(str.indexOf(108, 4)); // Output: 10 => 108 -> l
		System.out.println(str.indexOf(87, 6)); // Output: 7 => 87 -> W
		System.out.println();
	}
}
