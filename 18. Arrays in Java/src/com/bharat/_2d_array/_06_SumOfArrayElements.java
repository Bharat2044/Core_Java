package com.bharat._2d_array;

import java.util.Scanner;

public class _06_SumOfArrayElements {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter row size: ");
		int rowSize = sc.nextInt();

		System.out.print("Enter column size: ");
		int colSize = sc.nextInt();

		int[][] arr = new int[rowSize][colSize];

		System.out.println("Enter array elements: ");
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int sum = 0;

		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				sum += arr[i][j];
			}
		}

		System.out.println("Sum = " + sum);
	}
}
