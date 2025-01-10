package com.strings._01_string_class;

public class _03_StringClassConstructor {
	public static void main(String[] args) {

		/*
		 * public java.lang.String() -> The constructor public java.lang.String() in
		 * Java creates a new empty string object. It initializes an instance of the
		 * String class with no characters.
		 * 
		 * Syntax: public String() 
		 * 
		 * This constructor creates an empty string object with zero characters. 
		 * It's equivalent to assigning an empty string literal "".
		 */
		String s1 = new String();
		System.out.println(s1); // Output:
		System.out.println(s1.isEmpty()); // Output: true
		System.out.println();
		

		/*
		 * public java.lang.String(java.lang.String); -> The constructor public
		 * java.lang.String(java.lang.String) in Java creates a new string object that
		 * contains the same character sequence as the provided string argument.
		 * 
		 * Syntax: public String(String str) 
		 * 
		 * str: The string whose contents are to be copied into the new string object.
		 */
		String originalString = "Hello, World!";
		String str2 = new String(originalString);
		System.out.println(str2); // Output: Hello, World!
		System.out.println();
		

		/*
		 * public java.lang.String(char[]); -> The constructor public
		 * java.lang.String(char[]) in Java creates a new string object initialized with
		 * the characters from the provided character array.
		 * 
		 * Syntax: public String(char[] value) 
		 * 
		 * value: The character array whose characters are used to initialize the string.
		 */
		char[] charArray1 = { 'H', 'e', 'l', 'l', 'o' };
		String str3 = new String(charArray1);
		System.out.println(str3); // Output: Hello
		System.out.println();
		

		/*
		 * public java.lang.String(char[], int, int); -> The constructor public
		 * java.lang.String(char[], int, int) in Java creates a new string object
		 * initialized with a portion of characters from the provided character array.
		 * 
		 * Syntax: public String(char[] value, int offset, int count)
		 *  
		 * value: The character array from which the substring is to be extracted. 
		 * offset: The starting index (inclusive) of the substring within the character array.
		 * count: The length of the substring.
		 */
		char[] charArray2 = { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd' };
		String str4 = new String(charArray2, 2, 9);
		System.out.println(str4); // Output: llo World
		System.out.println();
		

		/*
		 * public java.lang.String(int[], int, int); -> The constructor public
		 * java.lang.String(int[], int, int) in Java creates a new string object
		 * initialized with a portion of Unicode code points from the provided integer
		 * array.
		 * 
		 * Syntax: public String(int[] codePoints, int offset, int count) 
		 * 
		 * codePoints: The integer array containing Unicode code points. 
		 * offset: The starting index (inclusive) of the portion within the codePoints array. 
		 * count: The length of the portion.
		 */
		int[] codePoints = { 72, 101, 108, 108, 111 }; // Unicode code points for 'H', 'e', 'l', 'l', 'o'
		String str5 = new String(codePoints, 1, 3);
		System.out.println(str5); // Output: ell
		System.out.println();
		

		/*
		 * public java.lang.String(byte[]); -> The constructor public
		 * java.lang.String(byte[]) in Java creates a new string object by decoding the
		 * bytes from the specified byte array using the platform's default character
		 * encoding.
		 * 
		 * Syntax: public String(byte[] bytes) 
		 * 
		 * bytes: The byte array containing the bytes to be decoded into characters.
		 */
		byte[] bytes1 = { 72, 101, 108, 108, 111 }; // ASCII bytes for 'H', 'e', 'l', 'l', 'o'
		String str6 = new String(bytes1);
		System.out.println(str6); // Output: Hello
		System.out.println();
		

		/*
		 * public java.lang.String(int[], int, int); -> The constructor public
		 * java.lang.String(int[], int, int) in Java creates a new string object
		 * initialized with a portion of the Unicode code points from the provided
		 * integer array.
		 * 
		 * Syntax: public String(int[] codePoints, int offset, int count) 
		 * 
		 * codePoints: The integer array containing Unicode code points. 
		 * offset: The starting index(inclusive) within the codePoints array from which to begin copying. 
		 * count: The length of the portion.
		 */
		byte[] bytes2 = { 72, 101, 108, 108, 111 }; // ASCII bytes for 'H', 'e', 'l', 'l', 'o'
		String str7 = new String(bytes2, 0, 4);
		System.out.println(str7); // Output: Hello
		System.out.println();
		

		/*
		 * public java.lang.String(java.lang.StringBuffer); -> The constructor public
		 * java.lang.String(java.lang.StringBuffer) in Java creates a new string object
		 * with the same contents as the specified StringBuffer object.
		 * 
		 * Syntax: public String(StringBuffer buffer) 
		 * 
		 * buffer: The StringBuffer object whose contents are to be copied into the new string.
		 */
		StringBuffer stringBuffer = new StringBuffer("Hello, World!");
		String str8 = new String(stringBuffer);
		System.out.println(str8); // Output: Hello, World!
		System.out.println();

		
		/*
		 * public java.lang.String(java.lang.StringBuilder); -> The constructor public
		 * java.lang.String(java.lang.StringBuilder) in Java creates a new string object
		 * with the same contents as the specified StringBuilder object.
		 * 
		 * syntax: public String(StringBuilder builder) 
		 * 
		 * builder: The StringBuilder object whose contents are to be copied into the new string.
		 */
		StringBuilder stringBuilder = new StringBuilder("Hello, World!");
		String str9 = new String(stringBuilder);
		System.out.println(str9); // Output: Hello, World!

	}
}
