package com.bharat.jaggedarray;

import java.util.Scanner;

public class _02_JaggedArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking the user for the number of rows in the jagged array
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // Creating the jagged array
		int[][] arr = new int[rows][];

        // Taking input for each row
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of elements in row " + i + ": ");
            int columns = sc.nextInt();
            arr[i] = new int[columns];

            System.out.println("Enter " + columns + " elements for row " + i + ": ");
            for (int j = 0; j < columns; j++) {
            	arr[i][j] = sc.nextInt();
            }
        }

        // Printing the jagged array
        System.out.println("\nThe jagged array you entered is:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }

        sc.close(); // Close the scanner to prevent resource leak
    }
}
