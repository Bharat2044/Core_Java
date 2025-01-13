package com.oops._03_methods;

public class _04_CombinationsOfMethods {

	// Method without return type, without parameters
	public static void m1() {
		int a = 10;

		System.out.println(a);
	}

	// Method without return type, with parameters
	public static void m2(int a) {
		System.out.println(a);
	}

	// Method with return type, without parameters
	public static int m3() {
		int a = 30;

		return a;
	}

	// Method with return type, with parameters
	public static int m4(int a) {

		return a;
	}

	public static void main(String[] args) {

		m1();	// _02_CombinationsOfMethods.m1();

		m2(20);	// _02_CombinationsOfMethods.m2(20);

		int ans1 = m3();
		System.out.println(ans1);

		int ans2 = m4(40);
		System.out.println(ans2);
	}
}
