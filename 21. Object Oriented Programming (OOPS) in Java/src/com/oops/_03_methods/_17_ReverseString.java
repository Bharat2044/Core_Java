package com.oops._03_methods;

public class _17_ReverseString {
	
	public static String reverseString(String str) {

		StringBuilder sb = new StringBuilder(str);
		
		sb.reverse();
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		String name = "Bharat Kumar";
		
		String reversedString = reverseString(name);
		
		System.out.println(reversedString);
	}
}
