package com.strings._02_stringbuffer_class;

public class _01_StringBufferCreation {
	public static void main(String[] args) {
		String str = "Hi";
		
		StringBuffer sb1 = new StringBuffer(str);
		StringBuffer sb2 = new StringBuffer("Hello");
		
		char[] charArray = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd'};
		StringBuffer sb3 = new StringBuffer(new String(charArray));
		
		StringBuffer sb4 = new StringBuffer(new String(charArray, 2, 8));
		
		StringBuffer sb5 = new StringBuffer();
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
