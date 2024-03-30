package com.bharat.character_array;

import java.util.Arrays;

public class _10_SortCharacterArray {
	public static void main(String[] args) {
		char[] arr = { 'x', 'a', 'c', 'z', 'm' };

		System.out.print("Original array: ");
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);		
		
		System.out.print("Sorted   array: ");
		System.out.println(Arrays.toString(arr));
		
	}
}
