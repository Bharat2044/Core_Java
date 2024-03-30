package com.bharat._3d_array;

public class _01_ArrayCreation {
	
	public static void printArray(int[][][] arr) {
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println(arr[i][j][k] + "  ");
                }
            }
        }
		
        System.out.println();
	}
	
    public static void main(String[] args) {

        int[][][] arr1;
        arr1 = new int[2][2][2];
        arr1[0][0][0] = 1;
        arr1[0][0][1] = 2;
        arr1[0][1][0] = 3;
        arr1[0][1][1] = 4;
        arr1[1][0][0] = 5;
        arr1[1][0][1] = 6;
        arr1[1][1][0] = 7;
        arr1[1][1][1] = 8;

        int[][][] arr2 = { { { 10, 20, 30 }, { 40, 50, 60 } }, { { 70, 80, 90 }, { 100, 110, 120 } } };

        int[][][] arr3 = new int[][][] { { { 10, 20, 30 }, { 40, 50, 60 } }, { { 70, 80, 90 }, { 100, 110, 120 } } };

        
        System.out.println("Array arr1 elements are: ");
        printArray(arr1);

        System.out.println("Array arr2 elements are: ");
        printArray(arr2);

        System.out.println("Array arr3 elements are: ");
        printArray(arr3);

    }
}
