package com.oops._03_methods;

public class _16_FirstCharacterOfString {
	
	public static char firstCharacter(String str) {

		return str.charAt(0);
	}
	
	public static void main(String[] args) {
		
		String str = "Bharat Kumar";
		
		char ch = firstCharacter(str);
		
		System.out.println(ch);
	}
}
