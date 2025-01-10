package com.strings._01_string_class;

public class _21_EqualsIgnoreCaseMethod {
	public static void main(String[] args) {

		/*
		 * public boolean equalsIgnoreCase(java.lang.String); -> The
		 * equalsIgnoreCase(String anotherString) method in Java is a part of the String
		 * class. It's used to compare the contents of the current string with the
		 * specified string for equality, ignoring any differences in case.
		 * 
		 * Syntax: public boolean equalsIgnoreCase(String anotherString)
		 * 
		 * anotherString: The string to be compared with the current string, ignoring
		 * case considerations.
		 * 
		 * This method returns true if the specified string is equal to the current
		 * string, ignoring case considerations. It returns false otherwise.
		 */

		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "hello";
		String str4 = new String("Hello");
		StringBuffer str5 = new StringBuffer("Hello");

		System.out.println(str1.equalsIgnoreCase(str2)); // Output: true
		System.out.println(str1.equalsIgnoreCase(str3)); // Output: true
		System.out.println(str1.equalsIgnoreCase(str4)); // Output: true
		
		// System.out.println(str1.equalsIgnoreCase(str5)); // Compilation Error: true : The method equalsIgnoreCase(String) in the type String is not applicable for the arguments (StringBuffer)
		
		// System.out.println(str1.equalsIgnoreCase(123)); // Compilation Error : The method equalsIgnoreCase(String) in the type String is not applicable for the arguments (int)
	}
}
