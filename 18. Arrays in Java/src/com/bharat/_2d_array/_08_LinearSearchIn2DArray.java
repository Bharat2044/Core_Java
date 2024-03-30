package com.bharat._2d_array;

public class _08_LinearSearchIn2DArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, -3 }, { 44, 5, 6 }, { 7, 11, 9 } };
		int key = 5;

		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == key) {
					found = true;
					break;
				}
			}
			
			if (found) {
				break;
			}
		}

		if (found) {
			System.out.println("Element present in matrix");
		} else {
			System.out.println("Element not present in matrix");
		}
	}
}
