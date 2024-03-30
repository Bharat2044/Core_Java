package com.bharat._1d_array;

public class _10_LargestElementInArray {

	public static void main(String[] args) {
		int[] arr = { 10, 40, 50, -60, 20, 90, 70, -80 };

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Largest Element = " + max);
	}
}
