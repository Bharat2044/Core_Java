/*
i/p: 
n = 3
arr = 10 20 30

o/p: 
10	
10  20	
10	20	30	
20	
20	30	
30	
*/


package com.bharat._1d_array;

import java.util.Scanner;

public class _16_PrintSubarraysOfAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of the array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Subarrays are: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {

				for (int k = i; k <= j; k++) {
					System.out.print(arr[k] + "  ");
				}

				System.out.println();
			}
		}
		
		sc.close();
	}
}
