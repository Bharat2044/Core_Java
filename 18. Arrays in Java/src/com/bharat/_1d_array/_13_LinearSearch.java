package com.bharat._1d_array;

import java.util.Scanner;

public class _13_LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of the array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter element you want to find: ");
		int key = sc.nextInt();

		int index = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			System.out.println("Element find at index: " + index);
		} else {
			System.out.println("Element not present in array");
		}
	}
}
