package com.bharat._1d_array;

import java.util.Arrays;

public class _04_PrintingArrayElements {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30 , 40, 50};
		
		System.out.println("Printing array arr elements using for loop: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("\n");
		
		
		System.out.println("Printing array arr elements using for-each loop: ");
		for(int i : arr) {
			System.out.print(i + "  ");
		}
		System.out.println("\n");
		
		
		System.out.println("Printing array arr elements using toString() method: ");
		System.out.println(Arrays.toString(arr));
		
	}
}
