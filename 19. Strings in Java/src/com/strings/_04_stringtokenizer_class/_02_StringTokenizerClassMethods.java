package com.strings._04_stringtokenizer_class;

import java.util.StringTokenizer;

public class _02_StringTokenizerClassMethods {
	public static void main(String[] args) {

		String str = "Hello, World! This is a test.";

		// StringTokenizer with default delimiters (space, tab, newline, etc.)
		StringTokenizer st1 = new StringTokenizer(str);
		
		// StringTokenizer with specified delimiters
        StringTokenizer st2 = new StringTokenizer(str, ",! ");
        
		// countTokens() method
		System.out.println("Using countTokens() with default delimiters:");
		System.out.println("Number of tokens: " + st1.countTokens());
		
        System.out.println("\nUsing countTokens() with specified delimiters:");
        System.out.println("Number of tokens: " + st2.countTokens());

		// hasMoreTokens() and nextToken() method
		System.out.println("\nUsing hasMoreTokens() and nextToken() with default delimiters:");
		while (st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		System.out.println("\nUsing hasMoreTokens() and nextToken() with specified delimiters:");
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
        
        // Using hasMoreElements() and nextElement() method
		st1 = new StringTokenizer(str);
        System.out.println("\nUsing hasMoreElements() and nextElement() with default delimiters:");
        while (st1.hasMoreElements()) {
            System.out.println(st1.nextElement());
        }
        
        st2 = new StringTokenizer(str, ",! ");
        System.out.println("\nUsing hasMoreElements() and nextElement() with specified delimiters:");
        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }
	}
}
