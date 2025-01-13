package com.oops._03_methods;

public class _07_CheckAgeForVotes {

	public static boolean eligibleForVote(int age) {

		if (age >= 18) {
			return true;
		} else {
			return false;
		}
		
		// return age >= 18;
	}

	public static void main(String[] args) {
		int age = 20;
		boolean check = eligibleForVote(age);

		if (check) {
			System.out.println("You are eligible for vote!");
		} else {
			System.out.println("You are not eligible for vote!");
		}
	}
}
