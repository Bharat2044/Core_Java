package com.bharat.character_array;

import java.util.Arrays;

public class _04_PrintingArrayElements {
	public static void main(String[] args) {
		char[] arr = { 'a', 'b', 'c', 'd', 'e' };
		
		System.out.println("Printing array arr elements direct: ");
		System.out.println(arr);
		System.out.println();

		System.out.println("Printing array arr elements using for loop: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("\n");

		System.out.println("Printing array arr elements using for-each loop: ");
		for (char i : arr) {
			System.out.print(i + "  ");
		}
		System.out.println("\n");

		System.out.println("Printing array arr elements using toString() method: ");
		System.out.println(Arrays.toString(arr));

	}
}
