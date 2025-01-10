package com.strings._03_stringbuilder_class;

public class _01_StringBuilderCreation {
	public static void main(String[] args) {
		String str = "Hi";
		
		StringBuilder sb1 = new StringBuilder(str);
		StringBuilder sb2 = new StringBuilder("Hello");
		
		char[] charArray = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd'};
		StringBuilder sb3 = new StringBuilder(new String(charArray));
		
		StringBuilder sb4 = new StringBuilder(new String(charArray, 2, 8));
		
		StringBuilder sb5 = new StringBuilder();
		sb5.append("Hello");
		sb5.append(", ");
		sb5.append("Everyone!");
		
		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);
		System.out.println("sb3 = " + sb3);
		System.out.println("sb4 = " + sb4);
		System.out.println("sb5 = " + sb5);

	}
}
