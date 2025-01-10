package com.strings._01_string_class;

public class _42_SplitMethod {
	public static void main(String[] args) {

		/*
		 * public java.lang.String[] split(java.lang.String); -> The split(String regex)
		 * method in Java is a method of the String class used to split a string into an
		 * array of substrings based on a specified regular expression pattern.
		 * 
		 * Syntax: public String[] split(String regex)
		 * 
		 * regex: The regular expression to use as the delimiter for splitting the
		 * string.
		 * 
		 * This method returns an array of strings resulting from splitting the original
		 * string around matches of the given regular expression.
		 */

		String str = "apple,banana,orange,mango";
		String[] fruits = str.split(",");

		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		System.out.println();

		/*
		 * public java.lang.String[] split(java.lang.String, int); -> The split(String
		 * regex, int limit) method in Java is a variation of the split() method of the
		 * String class. It's used to split a string into an array of substrings based
		 * on a specified regular expression pattern, with a specified limit on the
		 * number of resulting substrings.
		 * 
		 * Syntax: public String[] split(String regex, int limit)
		 * 
		 * regex: The regular expression to use as the delimiter for splitting the
		 * string.
		 * 
		 * limit: The maximum number of substrings to return. If the limit is
		 * non-positive, the pattern will be applied as many times as possible, and the
		 * resulting array may have a length of zero.
		 * 
		 * This method returns an array of strings resulting from splitting the original
		 * string around matches of the given regular expression, up to the specified
		 * limit.
		 */
		String[] fruits2 = str.split(",", 3);

		for (String fruit : fruits2) {
		    System.out.println(fruit);
		}
		System.out.println();
		
		
		String str2 = "ThexyzWebsitexyzisxyzaxyzGooglexyzWebsite.";
		String[] strArr = str2.split("xyz");
		for (String k : strArr) {
			System.out.print(k + " ");
		}
		System.out.println();
	}
}
