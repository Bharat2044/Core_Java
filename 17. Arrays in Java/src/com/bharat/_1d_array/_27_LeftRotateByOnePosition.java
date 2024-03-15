package com.bharat._1d_array;

public class _27_LeftRotateByOnePosition {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;

        System.out.println("Before left rotate by 1 position array are:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "   ");
        System.out.println();
        

        int x = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = x;
        

        System.out.println("\nAfter left rotate by 1 position array are:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "   ");
        System.out.println();
    }
}
