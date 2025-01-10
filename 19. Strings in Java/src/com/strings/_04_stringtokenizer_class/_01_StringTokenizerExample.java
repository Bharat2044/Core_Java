package com.strings._04_stringtokenizer_class;

import java.util.StringTokenizer;

public class _01_StringTokenizerExample {
	public static void main(String[] args) {
		/*
		 * StringTokenizer is a utility class in Java used for breaking a string into
		 * tokens. It is part of the java.util package and provides a simple way to
		 * tokenize a string based on delimiters.
		 * The string tokenizer class allows an application to break a string into tokens. 
		 */
		
		String str = "Hello, World! This is a test.";

		// Create a StringTokenizer with default delimiters (space, tab, newline, etc.)
		StringTokenizer st1 = new StringTokenizer(str);
		System.out.println("Tokens using default delimiters:");
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		System.out.println();

		// Create a StringTokenizer with specified delimiter
		StringTokenizer st2 = new StringTokenizer(str, ",!");
		System.out.println("Tokens using comma and exclamation mark as delimiters:");
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		System.out.println();

		// Create a StringTokenizer with specified delimiter and returnDelims flag
		StringTokenizer st3 = new StringTokenizer(str, ",!", true);
		System.out.println("Tokens using comma and exclamation mark as delimiters (returning delimiters):");
		while (st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
		System.out.println();

		// Alternative Ways
		String[] tokens = str.split("[, !]+");
		for (String token : tokens) {
			System.out.println(token);
		}
	}
}
