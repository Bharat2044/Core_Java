/* 
 Strong Numbers: A Strong number is a number, where the sum of the factorial of the digits is equal to the number itself. 
 1, 2, 145, and 40585 are some examples of Strong numbers.
 i/p: 145
 o/p: 145 is a strong number.         => 1! + 4! + 5! = 145
*/


package com.bharat.methods;

import java.util.Scanner;

public class _46_CheckStrongNumber {

	// Time Complexity: O(logn), Space Complexity: O(1)
	public static boolean isStrong(int n) {
		int sum = 0, temp = n;

		while (n > 0) {
			int d = n % 10;
			int fact = 1;

			for (int i = 1; i <= d; i++)
				fact *= i;

			sum += fact;
			n /= 10;
		}

		return (sum == temp);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		if (isStrong(n))
			System.out.println(n + " is a strong number.");
		else
			System.out.println(n + " is not a strong number.");
	}
}
