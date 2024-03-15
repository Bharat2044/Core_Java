package com.bharat._1d_array;

import java.util.Scanner;

public class _22_SumOfTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };

		int[] temp = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			temp[i] = arr1[i] + arr2[i];
		}

		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + "  ");
		}

		sc.close();
	}
}