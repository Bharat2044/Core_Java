package com.bharat._2d_array;

public class _01_ArrayCreation {

	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "  ");
			}
			
			System.out.println();
		}

		System.out.println();
	}

	public static void main(String[] args) {

		int[][] arr1;
		arr1 = new int[3][3];
		arr1[0][0] = 1;
		arr1[0][2] = 3;
		arr1[1][1] = 5;
		arr1[2][0] = 7;
		arr1[2][2] = 9;

		int[][] arr2 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		int[][] arr3 = new int[][] { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		int[][] arr4 = new int[3][];
		arr4[0] = new int[] { 10, 20, 30 };
		arr4[1] = new int[] { 40, 50, 60 };
		arr4[2] = new int[] { 70, 80, 90 };

		System.out.println("Array arr1 elements are: ");
		printArray(arr1);

		System.out.println("Array arr2 elements are: ");
		printArray(arr2);

		System.out.println("Array arr3 elements are: ");
		printArray(arr3);

		System.out.println("Array arr4 elements are: ");
		printArray(arr4);
	}
}
