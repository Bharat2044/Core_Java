package com.bharat._1d_array;

public class _26_SecondLargestElementInAnArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 9, 11, 10, 123, 12, 0, 15, 44, 700, 1, 700};
        int n = arr.length;

        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secLargest && arr[i] != largest) {
                secLargest = arr[i];
            }
        }

        System.out.println("Second largest element = " + secLargest);
    }
}
