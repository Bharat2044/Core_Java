package com.strings._01_string_class;

import java.util.Locale;

public class _46_FormatMethod {
	public static void main(String[] args) {

		/*
		 * public static java.lang.String format(java.lang.String, java.lang.Object...);
		 * -> The format(String format, Object... args) method in Java is a static
		 * method of the String class used to format strings using placeholders and
		 * argument values. It works similarly to the printf function in C.
		 * 
		 * Syntax: public static String format(String format, Object... args)
		 * 
		 * format: A format string containing placeholders that will be replaced by the
		 * formatted representations of the specified arguments.
		 * 
		 * args: A variable number of arguments that will be used to replace the
		 * placeholders in the format string.
		 * 
		 * This method returns a formatted string constructed by applying the specified
		 * format string to the specified arguments.
		 */

		String name = "John";
		int age = 30;

		String message = String.format("Hello, my name is %s and I am %d years old.", name, age);
		System.out.println(message); // Hello, my name is John and I am 30 years old.

		/*
		 * public static java.lang.String format(java.util.Locale, java.lang.String, java.lang.Object...);
		 * 
		 * The format(Locale locale, String format, Object... args) method in Java is
		 * another variation of the format() method of the String class. It's used to
		 * format strings using placeholders and argument values, but with additional
		 * control over locale-specific formatting rules.
		 * 
		 * Syntax: public static String format(Locale locale, String format, Object... args)
		 * 
		 * locale: The locale to use for formatting. Locale-specific formatting rules,
		 * such as number and date formats, will be applied based on the specified
		 * locale.
		 * 
		 * format: A format string containing placeholders that will be replaced by the
		 * formatted representations of the specified arguments.
		 * 
		 * args: A variable number of arguments that will be used to replace the
		 * placeholders in the format string.
		 * 
		 * This method returns a formatted string constructed by applying the specified
		 * format string to the specified arguments, using locale-specific formatting
		 * rules.
		 */
		
		String message1 = String.format(Locale.US, "Hello, my name is %s and I am %d years old.", name, age);
		System.out.println(message1);
	}
}
