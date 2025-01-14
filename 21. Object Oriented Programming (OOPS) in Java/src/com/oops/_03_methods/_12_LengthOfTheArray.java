package com.oops._03_methods;

public class _12_LengthOfTheArray {
		
		public static int findLength(int[] arr) {
			
			return arr.length;
		}
		
		public static void main(String[] args) {
			
			int[] arr = {1, 2, 3, 4, 5};
			
			int length = findLength(arr);
			
			System.out.println("Total number of elements: " + length);
		}
}
