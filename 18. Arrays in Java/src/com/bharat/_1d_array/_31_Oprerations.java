package com.bharat._1d_array;

import java.util.Arrays;
import java.util.Scanner;

public class _31_Oprerations {

	public static void stringStartWithConsonants(String[] arr) {
		System.out.println("string started with Consonants:");
		
		for(String k : arr) {
			int x = (int)k.charAt(0);
			
			if((x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z')) {
				switch(k.charAt(0)) {
					case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> {}
					default -> System.out.println(k);
				}
			}
		}
	}

	public static void stringStartWithVowels(String[] arr) {
		System.out.println("string started with Vowels:");
		
		for(String k : arr) {
			int x = (int)k.charAt(0);
			
			if((x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z')) {
				switch(k.charAt(0)) {
					case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> System.out.println(k);
				}
			}
		}
	}

	public static void sortString(String[] arr) {
		Arrays.sort(arr);
		System.out.println("After Sorted:");
		print(arr);
	}

	public static void print(String[] arr) {
		System.out.println("String-Array elements are:");
		for(String k : arr) {
			System.out.println(k);
		}	
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of String: ");
		int n = sc.nextInt();
		
		// Consume the newline character
        sc.nextLine();
        
		String[] arr = new String[n];
		
		System.out.println("Enter " + n + " String element:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		
		
		while(true) {
			System.out.println("\n------ Operations on String-Array ------");
			System.out.println("1. Prnit String-Array \n2. Sort String-Array \n3. Display String Started with Vowels \n4. Display String Started with Consonants \n5. Exit");
			
			System.out.print("\nEnter your choice: ");
			switch(sc.nextInt()) {
				case 1:
					print(arr);
					break;
				case 2:
					sortString(arr);
					break;
				case 3:
					stringStartWithVowels(arr);
					break;
				case 4:
					stringStartWithConsonants(arr);
					break;
				case 5:
					System.out.println("\nOperation Stopped");
					System.exit(0);
				default:
					System.out.println("\nInvalid Choice, Please select correct choice");
			}
		}
	}
}
