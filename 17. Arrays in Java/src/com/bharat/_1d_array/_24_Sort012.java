package com.bharat._1d_array;

import java.util.Arrays;

public class _24_Sort012 {

	public static void main(String[] args) {
		int arr[] = { 0, 2, 1, 0, 2, 0, 1, 2, 0, 1 };

		System.out.println("Original Array: " + Arrays.toString(arr));

		int low = 0, mid = 0, high = arr.length - 1;

		while (mid <= high) {
			switch (arr[mid]) {
				case 0:
					int x = arr[low];
					arr[low] = arr[mid];
					arr[mid] = x;
					low++;
					mid++;
					break;
				case 1:
					mid++;
					break;
				case 2:
					int y = arr[mid];
					arr[mid] = arr[high];
					arr[high] = y;
					high--;
					break;
			}
		}

		System.out.println("After Sorted  : " + Arrays.toString(arr));
	}
}
