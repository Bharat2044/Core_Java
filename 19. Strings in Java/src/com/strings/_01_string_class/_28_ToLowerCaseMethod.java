package com.strings._01_string_class;

import java.util.Locale;

public class _28_ToLowerCaseMethod {
	public static void main(String[] args) {
		
		/*
		 * public java.lang.String toLowerCase(); -> The toLowerCase() method in Java is
		 * a part of the String class. It's used to convert all characters in the
		 * current string to lowercase.
		 * 
		 * Syntax: public String toLowerCase()
		 * 
		 * This method returns a new string with all uppercase characters converted to
		 * lowercase. The original string remains unchanged.
		 */

		String str1 = "HELLO";
		String str2 = "WorLd!";

		System.out.println(str1.toLowerCase()); // Output: hello
		System.out.println(str2.toLowerCase()); // Output: world!

		
		/*
		 * public java.lang.String toLowerCase(java.util.Locale); -> The
		 * toLowerCase(Locale locale) method in Java is a part of the String class. It's
		 * used to convert all characters in the current string to lowercase, using the
		 * rules of the specified Locale.
		 * 
		 * Syntax: public String toLowerCase(Locale locale)
		 * 
		 * locale: The locale whose rules are used for case conversion.
		 * 
		 * This method returns a new string with all uppercase characters converted to
		 * lowercase according to the rules of the specified locale. The original string
		 * remains unchanged.
		 */

		String str = "SS";

		System.out.println(str.toLowerCase(Locale.GERMAN)); // Output: "ss"
		System.out.println(str.toLowerCase(Locale.CANADA)); // Output: "ss"

	}
}
