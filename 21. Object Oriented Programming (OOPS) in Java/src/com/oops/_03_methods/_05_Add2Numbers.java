package com.oops._03_methods;

public class _05_Add2Numbers {
	
	public static int add(int a, int b) {
		int sum = a + b;
		
		return sum;
	}
	
	public static void main(String[] args) {
		int ans = add(10, 20);
		
		System.out.println(ans);
	}
}
