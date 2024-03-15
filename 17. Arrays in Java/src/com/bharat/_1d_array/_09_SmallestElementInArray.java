package com.bharat._1d_array;

public class _09_SmallestElementInArray {

	public static void main(String[] args) {
		int[] arr = { 10, 40, 50, -60, 20, 90, 70, -80 };

		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Smallest Element = " + min);
	}
}
