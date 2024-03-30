package com.bharat.character_array;

public class _09_CheckPalindromeArray {
	public static void main(String[] args) {
		char[] arr = { 'a', 'b', 'c', 'b', 'a' };

		int st = 0, end = arr.length - 1;
		boolean flag = true;

		while (st < end) {
			if (arr[st] != arr[end]) {
				flag = false;
				break;
			}

			st++;
			end--;
		}

		if (flag) {
			System.out.println("Array is Palindrome");
		} else {
			System.out.println("Array is not Palindrome");
		}
	}
}
