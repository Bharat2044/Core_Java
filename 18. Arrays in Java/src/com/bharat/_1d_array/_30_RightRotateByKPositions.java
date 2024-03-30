package com.bharat._1d_array;

public class _30_RightRotateByKPositions {

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "   ");
        System.out.println();
    }

    static void reverse(int arr[], int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    static void rightRotateByKPosition(int arr[], int n, int k) {
        // Adjust `k` if it is greater than the size of the array
        k = k % n;

        // Reverse the last `k` elements
        reverse(arr, n - k, n - 1);
        // Reverse the first `n-k` elements
        reverse(arr, 0, n - k - 1);
        // Reverse the whole array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int k = 3;

        System.out.println("Before right rotate by k position array are:");
        printArray(arr, n);

        rightRotateByKPosition(arr, n, k);

        System.out.println("\nAfter right rotate by k position array are:");
        printArray(arr, n);
    }
}
