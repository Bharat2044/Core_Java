package com.bharat._1d_array;

import java.util.Arrays;

public class _23_SortZeroesAndOnes {

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0};
        
        System.out.println("Original Array: " + Arrays.toString(arr));

        int st = 0, end = arr.length - 1;
        while (st < end) {
            if (arr[st] == 1) {
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                
                end--;
            } else {
                st++;
            }
        }
        
        System.out.println("After Sorted  : " + Arrays.toString(arr));
    }
}
