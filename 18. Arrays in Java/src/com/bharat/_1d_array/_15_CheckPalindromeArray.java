// https://www.geeksforgeeks.org/program-to-check-if-an-array-is-palindrome-or-not/

package com.bharat._1d_array;

public class _15_CheckPalindromeArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 1 };

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
