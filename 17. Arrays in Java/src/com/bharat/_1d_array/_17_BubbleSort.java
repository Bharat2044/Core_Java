package com.bharat._1d_array;

public class _17_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;

        System.out.print("Original array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
            	
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted   array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
