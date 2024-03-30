package com.bharat._1d_array;

public class _07_PrintArrayInReverseOrder {
	public static void main(String[] args) {

		int[] arr = {10, 20, 30 , 40, 50};
		
		System.out.print("Array elements are in reverse order: ");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + "  ");
		}
	}
}
