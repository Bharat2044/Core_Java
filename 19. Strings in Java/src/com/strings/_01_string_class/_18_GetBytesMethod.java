package com.strings._01_string_class;

public class _18_GetBytesMethod {
	public static void main(String[] args) {

		/*
		 * public byte[] getBytes(); -> The getBytes() method in Java is a part of the
		 * String class. It's used to encode the characters of the string into a
		 * sequence of bytes using the platform's default charset.
		 * 
		 * syntax: public byte[] getBytes()
		 * 
		 * This method returns a byte array representing the encoded form of the string.
		 * The encoding is performed using the platform's default charset.
		 */
		
		String str = "Hello, World!";
		byte[] byteArray = str.getBytes();

		for (int i = 0; i < byteArray.length; i++) {
			System.out.println(byteArray[i]);
		}
	}
}
