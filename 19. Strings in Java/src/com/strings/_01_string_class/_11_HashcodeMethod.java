package com.strings._01_string_class;

public class _11_HashcodeMethod {
	public static void main(String[] args) {

		/*
		 * public int hashCode(); -> The hashCode() method in Java is a part of the
		 * String class. It's used to generate a hash code for the string.
		 * 
		 * Syntax: public int hashCode()
		 * 
		 * This method returns an integer hash code value for the string. The hash code
		 * is computed based on the contents of the string and is typically used when
		 * storing objects in hash-based data structures like HashMap or HashSet.
		 */
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "World";
		
		int hashCode1 = str1.hashCode();
		int hashCode2 = str2.hashCode();
		int hashCode3 = str3.hashCode();
		
		System.out.println(hashCode1);	// 69609650
		System.out.println(hashCode2);	// 69609650
		System.out.println(hashCode3);	// 83766130

	}
}
