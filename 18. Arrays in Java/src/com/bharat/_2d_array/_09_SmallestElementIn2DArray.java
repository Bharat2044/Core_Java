package com.bharat._2d_array;

public class _09_SmallestElementIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, -3}, {44, 5, 6}, {-79, 11, 9}};
        
        int smallest = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < smallest) {
                    smallest = arr[i][j];
                }
            }
        }
        
        System.out.println("Smallest element in matrix = " + smallest);
    }
}
