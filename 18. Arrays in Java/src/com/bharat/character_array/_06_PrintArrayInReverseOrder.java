package com.bharat.character_array;

public class _06_PrintArrayInReverseOrder {
	public static void main(String[] args) {

		char[] arr = { 'a', 'b', 'c', 'd', 'e' };

		System.out.print("Array elements are in reverse order: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + "  ");
		}
	}
}
