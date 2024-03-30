package com.bharat.character_array;

public class _01_ArrayCreation {

	public static void printArray(char[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

		System.out.println();
	}

	public static void main(String[] args) {

		char[] arr1;
		arr1 = new char[5];
		arr1[0] = 'a';
		arr1[1] = 'b';
		arr1[3] = 'c';

		char[] arr2 = { 'a', 'b', 'c', 'd', 'e' };

		char[] arr3 = new char[] { 'a', 'b', 'c', 'd', 'e' };

		System.out.print("Array arr1 elements are: ");
		printArray(arr1);

		System.out.print("Array arr2 elements are: ");
		printArray(arr2);

		System.out.print("Array arr3 elements are: ");
		printArray(arr3);
	}
}
