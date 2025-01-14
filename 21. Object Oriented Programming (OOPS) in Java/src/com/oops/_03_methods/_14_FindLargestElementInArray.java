package com.oops._03_methods;

public class _14_FindLargestElementInArray {

	public static int findLargestEle(int[] arr) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 12, 8, 4, 50, 7, 9 };

		int largest = findLargestEle(arr);

		System.out.println(largest);
	}
}
