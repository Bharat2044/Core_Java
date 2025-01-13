package com.oops._03_methods;

public class _02_StaticMethods {
	public static void test() {
		System.out.println("I am inside test()");
	}
	
	public static void hello() {
		System.out.println("Hello, I am inside hello()");
	}
	
	public static void main(String[] args) {
		System.out.println("I am inside main()");
		test();
		hello();
		
		_02_StaticMethods.test();
		_02_StaticMethods.hello();
	}
}
