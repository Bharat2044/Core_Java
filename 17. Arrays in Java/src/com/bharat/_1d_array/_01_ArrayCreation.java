package com.bharat._1d_array;

public class _01_ArrayCreation {
	public static void main(String[] args) {
		
		int[] arr1;
		arr1 = new int[5];
		arr1[0] = 5;
		arr1[1] = 6;
		arr1[2] = 7;
		
		int[] arr2 = {10, 20, 30 , 40, 50};
		
		int[] arr3 = new int[]{60, 70, 80 , 90, 100};
		
		System.out.print("Array arr1 elements are: ");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + "  ");
		}
		System.out.println("\n");
		
		
		System.out.print("Array arr2 elements are: ");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + "  ");
		}
		System.out.println("\n");
		
		
		System.out.print("Array arr3 elements are: ");
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i] + "  ");
		}
	}
}
