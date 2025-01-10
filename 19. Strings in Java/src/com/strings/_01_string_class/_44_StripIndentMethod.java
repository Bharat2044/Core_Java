package com.strings._01_string_class;

public class _44_StripIndentMethod {
	public static void main(String[] args) {

		/*
		 * public java.lang.String stripIndent(); -> The stripIndent() method in Java is
		 * a method of the String class introduced in Java 15. It's used to remove
		 * incidental indentation from each line of a multi-line string.
		 * 
		 * Syntax: public String stripIndent()
		 * 
		 * This method returns a new string where the incidental indentation, which is
		 * the leading whitespace that is common to all lines of the string, is removed.
		 * 
		 */

		String str = """
				This is a
				multi-line
				string
				""";
		String strippedStr = str.stripIndent();

		System.out.println(str.length());
		System.out.println(str);
		System.out.println(strippedStr.length());
		System.out.println(strippedStr);
	}
}
