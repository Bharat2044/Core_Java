package com.oops._03_methods;

public class _15_ConvertStringIntoUpeerCase {

	public static String convertToUppercase(String name) {

		return name.toUpperCase();
	}
	
	public static void main(String[] args) {
		
		String name = "Bharat Kumar";
		
		String upperCaseName = convertToUppercase(name);
		
		System.out.println(upperCaseName);
	}
}
