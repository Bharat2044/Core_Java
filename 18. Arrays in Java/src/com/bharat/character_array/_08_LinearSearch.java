package com.bharat.character_array;

import java.util.Scanner;

public class _08_LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of the array: ");
		int n = sc.nextInt();

		char[] arr = new char[n];

		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next().charAt(0);
		}

		System.out.print("Enter element you want to find: ");
		char key = sc.next().charAt(0);

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
