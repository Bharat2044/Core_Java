package com.strings._01_string_class;

import java.util.Locale;

public class _27_ToUpperCaseMethod {
	public static void main(String[] args) {

		/*
		 * public java.lang.String toUpperCase(); -> The toUpperCase() method in Java is
		 * a part of the String class. It's used to convert all characters in the
		 * current string to uppercase.
		 * 
		 * Syntax: public String toUpperCase()
		 * 
		 * This method returns a new string with all lowercase characters converted to
		 * uppercase. The original string remains unchanged.
		 */

		String str1 = "hello";
		String str2 = "WorLd!";

		System.out.println(str1.toUpperCase()); // Output: HELLO
		System.out.println(str2.toUpperCase()); // Output: WORLD!

		/*
		 * public java.lang.String toUpperCase(java.util.Locale); -> The
		 * toUpperCase(Locale locale) method in Java is a part of the String class. It's
		 * used to convert all characters in the current string to uppercase, using the
		 * rules of the specified Locale.
		 * 
		 * Syntax: public String toUpperCase(Locale locale)
		 * 
		 * locale: The locale whose rules are used for case conversion.
		 * 
		 * This method returns a new string with all lowercase characters converted to
		 * uppercase according to the rules of the specified locale. The original string
		 * remains unchanged.
		 */
		
		String str = "ß";

		System.out.println(str.toUpperCase(Locale.GERMAN)); // Output: "SS"
		System.out.println(str.toUpperCase(Locale.CANADA)); // Output: "SS"
	}
}
