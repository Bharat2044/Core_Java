package com.oops._03_methods;

import java.util.Arrays;

public class _13_ReverseArray {
	
	public static void printArray(int[] arr) {

		System.out.println(Arrays.toString(arr));
	}

	public static void reverseArray(int[] arr) {

		int start = 0, end = arr.length - 1;
		
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println("Before reverse arrays are");
		printArray(arr);
		
		reverseArray(arr);
		
		System.out.println("After  reverse arrays are");
		printArray(arr);
	}
}
