package com.strings._01_string_class;

public class _37_ValueOfMethod {
	public static void main(String[] args) {

		/*
		 * public static java.lang.String valueOf(java.lang.Object); -> The
		 * valueOf(Object obj) method in Java is a static method of the String class.
		 * It's used to return the string representation of the specified object obj.
		 * 
		 * Syntax: public static String valueOf(Object obj)
		 * 
		 * obj: The object whose string representation is to be returned.
		 * 
		 * This method returns a string representation of the specified object. If the
		 * specified object is null, it returns the string "null". Otherwise, it calls
		 * the toString() method of the object to obtain its string representation.
		 */

		String str1 = String.valueOf(123);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		Integer x = 10;
		int a = 10;
		double b = 12.5;

		System.out.println(str1); // Output: "123"
		System.out.println(str2); // Output: "3.14"
		System.out.println(str3); // Output: "true"
		System.out.println(String.valueOf(x)); // Output: "10"
		System.out.println(String.valueOf(a) + String.valueOf(b) + String.valueOf(true)); // Output: "1012.5true"
		System.out.println();

		
		/*
		 * public static java.lang.String valueOf(char[]); -> The valueOf(char[] data)
		 * method in Java is a static method of the String class. It's used to create a
		 * new string containing the characters from the specified character array data.
		 * 
		 * Syntax: public static String valueOf(char[] data)
		 * 
		 * data: The character array whose contents are to be used to create the string.
		 * 
		 * This method returns a new string containing the characters from the specified
		 * character array. The entire array is converted into a string.
		 */

		char[] charArray = { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd' };
		String s1 = String.valueOf(charArray);
		String s2 = String.valueOf(charArray, 1, 8);
		String s3 = charArray.toString();
		String s4 = new String(charArray);
		String s5 = new String(charArray, 2, 6);

		System.out.println(s1); // Output: "Hello World"
		System.out.println(s2); // Output: "ello Wor"
		System.out.println(s3); // Output: [C@3a4afd8d
		System.out.println(s4); // Output: "Hello World"
		System.out.println(s5); // Output: "llo Wo"
		

		/*
		 * public static java.lang.String valueOf(java.lang.Object);
		 * 
		 * public static java.lang.String valueOf(char[]);
		 * 
		 * public static java.lang.String valueOf(char[], int, int);
		 * 
		 * public static java.lang.String valueOf(boolean);
		 * 
		 * public static java.lang.String valueOf(char);
		 * 
		 * public static java.lang.String valueOf(int);
		 * 
		 * public static java.lang.String valueOf(long);
		 * 
		 * public static java.lang.String valueOf(float);
		 * 
		 * public static java.lang.String valueOf(double);
		 */

	}
}
