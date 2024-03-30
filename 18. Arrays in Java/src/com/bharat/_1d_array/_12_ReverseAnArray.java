package com.bharat._1d_array;

public class _12_ReverseAnArray {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };

		System.out.print("Before reversed array arr elements are: ");
		for (int i : arr) {
			System.out.print(i + "  ");
		}
		
		/*
		for (int i = 0; i < arr.length / 2; i++){
			int temp = arr[i]; 
			arr [i] = arr[arr.length - 1 - i]; 
			arr [arr.length - 1 - i] = temp;  
		}
		 */

		int st = 0, end = arr.length - 1;
		while (st < end) {
			int temp = arr[st];
			arr[st] = arr[end];
			arr[end] = temp;

			st++;
			end--;
		}

		System.out.print("\n\nAfter  reversed array arr elements are: ");
		for (int i : arr) {
			System.out.print(i + "  ");
		}
	}
}
