package com.bharat._1d_array;

import java.util.Arrays;

public class _25_MoveNegativeElementToEnd {
	public static void main(String[] args) {
		int arr[] = {1, -13, 5, -2, 7, -9, 0, -5, -21, -3};
        int n = arr.length;

        System.out.println("Before moved negative element to end:");
        System.out.println(Arrays.toString(arr));

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                if (i != j) {
                	int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
                }
                j++;
            }
        }
        
        System.out.println("After  moved negative element to end:");
        System.out.println(Arrays.toString(arr));
	}
}
