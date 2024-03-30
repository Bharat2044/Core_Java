package com.bharat.character_array;

public class _05_UpdatingArrayElements {
	public static void printArray(char[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		char[] arr1 = { 'a', 'b', 'c', 'd', 'e' };
		
		System.out.println("Printing array arr1 elements before updating: ");
		printArray(arr1);
		
		arr1[0] = 'x';	// updaing 1st element
		arr1[2] = 'y';	// updaing 3rd element
		arr1[4] = 'z';	// updaing 5th element
		
		System.out.println("Printing array arr1 elements after updating: ");
		printArray(arr1);
		
		
		char[] arr2 = { 'A', 'B', 'C', 'D', 'E' };
		
		System.out.println("\nPrinting array arr2 elements before updating: ");
		printArray(arr2);
		
		// updating array arr2
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (char)((int)arr2[i] + 32);
		}
		
		System.out.println("Printing array arr2 elements after updating: ");
		printArray(arr2);

	}
}
