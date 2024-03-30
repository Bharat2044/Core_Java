package com.bharat._1d_array;

import java.util.Scanner;

public class _08_SumOfArrayElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("Sum of array elements = " + sum);

		sc.close();
	}
}