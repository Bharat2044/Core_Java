package com.bharat._1d_array;

public class _18_SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 64, 25, 12, 22, 11 };
		int n = arr.length;

		System.out.print("Original array: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		// Selection sort
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}

		System.out.print("Sorted   array: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
