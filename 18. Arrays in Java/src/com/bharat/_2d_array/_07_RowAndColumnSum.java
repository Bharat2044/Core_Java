package com.bharat._2d_array;

public class _07_RowAndColumnSum {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = 3, n = 3;

        System.out.println("Array elements are:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + "  ");
            
            System.out.println();
        }
        System.out.println();

        
        // Calculate row sums
        System.out.print("Array row sums are: ");
        for (int i = 0; i < m; i++) {
            int sum = 0;
            
            for (int j = 0; j < n; j++)
                sum += arr[i][j];
            System.out.print(sum + "  ");
        }
        System.out.println();

        
        // Calculate column sums
        System.out.print("Array column sums are: ");
        for (int i = 0; i < n; i++) {
            int sum = 0;
            
            for (int j = 0; j < m; j++)
                sum += arr[j][i];
            System.out.print(sum + "  ");
        }
        System.out.println();
    }
}
