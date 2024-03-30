package com.bharat._1d_array;

import java.util.Arrays;

public class _11_MinAndMinElement {

	public static void main(String[] args) {
		int[] arr = { 10, 40, 50, -60, 20, 90, 70, -80 };

		int max = arr[0];
		int min = arr[0];

		// 1st Approach
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Minimum Element = " + min);
		System.out.println("Maximum Element = " + max);

		// 2nd Approach
		Arrays.sort(arr);
		System.out.println("\nMinimum Element = " + arr[0]);
		System.out.println("Maximum Element = " + arr[arr.length - 1]);

	}
}
