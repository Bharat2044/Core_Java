package com.strings._01_string_class;

public class _01_StringCreation {
	public static void main(String[] args) {
		String str1 = "Hello, World!!";
		
		String str2 = new String("Hello, Everyone!!");
		
		char[] ch = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd'};
		String str3 = new String(ch);
		String str4 = new String(ch, 2, 8);
		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("str4 = " + str4);
	}
}
