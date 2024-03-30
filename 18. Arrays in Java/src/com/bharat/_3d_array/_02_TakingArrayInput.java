package com.bharat._3d_array;

import java.util.Scanner;

public class _02_TakingArrayInput {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter all 3 size of the array: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int o = sc.nextInt();

		int[][][] arr = new int[m][n][o];

		System.out.println("Enter array elements: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < o; k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		

		System.out.println("Array elments are: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println(arr[i][j][k] + "  ");
				}
			}
		}
	}
}
