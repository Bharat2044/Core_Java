package com.bharat._1d_array;

import java.util.Scanner;

public class _03_TakingArrayInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter array elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Array elments are: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + "  ");
		}
	}
}
