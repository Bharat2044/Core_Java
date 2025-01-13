package com.oops._03_methods;

public class _03_InstanceMethods {
	
	public void test() {
		System.out.println("I am inside test()");
	}
	
	public void hello() {
		System.out.println("Hello, I am inside hello()");
	}
	
	public static void main(String[] args) {
		System.out.println("I am inside main()");
		
		_03_InstanceMethods obj = new _03_InstanceMethods();
		
		obj.test();
		obj.hello();
	}
}
