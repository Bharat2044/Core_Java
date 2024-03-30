package com.bharat._1d_array;

import java.util.Scanner;

public class _14_BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of the array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements in sorted order: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter element you want to find: ");
		int key = sc.nextInt();

		int low = 0, high = arr.length - 1, index = -1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == key) {
				index = mid;
				break;
			} else if (arr[mid] > key) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		if (index != -1) {
			System.out.println("Element found at index: " + index);
		} else {
			System.out.println("Element not present in array");
		}
	}
}
