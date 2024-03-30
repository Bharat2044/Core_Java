package com.bharat._2d_array;

import java.util.Arrays;

public class _04_PrintingArrayElements {
	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		System.out.println("Printing array arr elements using for loop: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "  ");
			}

			System.out.println();
		}
		System.out.println();

		
		System.out.println("Printing array arr elements using for-each loop: ");
		for (int[] i : arr) {
			for (int j : i) {
				System.out.print(j + "  ");
			}

			System.out.println();
		}
		System.out.println("");

		
		System.out.println("Printing array arr elements using toString() method: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}

	}
}
