package com.bharat._1d_array;

public class _28_RightRotateByOnePosition {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;

        System.out.println("Before right rotate by 1 position array are:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "   ");
        System.out.println();

        int x = arr[n - 1];
        for (int i = n - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = x;

        
        System.out.println("\nAfter right rotate by 1 position array are:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "   ");
        System.out.println();
    }
}
