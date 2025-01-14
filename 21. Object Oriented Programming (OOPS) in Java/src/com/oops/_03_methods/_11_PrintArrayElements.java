package com.oops._03_methods;

import java.util.Arrays;

public class _11_PrintArrayElements {
	
	public static void printArrays(int[] arr) {
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		printArrays(arr);
	}
}
