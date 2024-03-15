package com.bharat._2d_array;

public class _02_ArrayDemo {

	public static void main(String[] args) {

		boolean[][] arr1 = new boolean[3][3];
		arr1[0][0] = true;
		arr1[1][0] = false;
		arr1[1][1] = true;
		arr1[2][2] = true;

		double[][] arr2 = { { 1.1, 1.2, 1.3 }, { 2.1, 2.2, 2.3 }, { 3.1, 3.2, 3.3 } };

		char[][] arr3 = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' } };

		
		System.out.println("Array arr1 elements are: ");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "  ");
			}

			System.out.println();
		}
		System.out.println();

		
		System.out.println("Array arr2 elements are: ");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "  ");
			}

			System.out.println();
		}
		System.out.println();

		
		System.out.println("Array arr3 elements are: ");
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + "  ");
			}

			System.out.println();
		}
		System.out.println();
	}

}
