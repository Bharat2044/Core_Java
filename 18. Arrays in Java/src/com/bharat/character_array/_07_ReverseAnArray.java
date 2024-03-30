package com.bharat.character_array;

public class _07_ReverseAnArray {
	public static void main(String[] args) {

		char[] arr = { 'a', 'b', 'c', 'd', 'e' };

		System.out.print("Before reversed array arr elements are: ");
		for (char i : arr) {
			System.out.print(i + "  ");
		}

		int st = 0, end = arr.length - 1;
		while (st < end) {
			char temp = arr[st];
			arr[st] = arr[end];
			arr[end] = temp;

			st++;
			end--;
		}

		System.out.print("\n\nAfter  reversed array arr elements are: ");
		for (char i : arr) {
			System.out.print(i + "  ");
		}
	}
}
