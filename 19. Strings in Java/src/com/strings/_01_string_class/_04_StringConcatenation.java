package com.strings._01_string_class;

public class _04_StringConcatenation {
	public static void main(String[] args) {
		String str1 = "Hi";
		String str2 = "Hello";
		String str3 = "Bye";

		// Using '+' operator
		System.out.println(str1 + str2);
		System.out.println(str1 + str2 + str3 + "Hola");
		System.out.println(str1 + " " + str2 + " " + str3 + " Hola");
		System.out.println();
		
		
		// Using concat() method
		System.out.println(str1.concat(str2));
		System.out.println(str1.concat(str2).concat(str3).concat("Hola"));
		System.out.println(str1.concat(" " + str2).concat(" " + str3).concat(" Hola"));
	}
}
