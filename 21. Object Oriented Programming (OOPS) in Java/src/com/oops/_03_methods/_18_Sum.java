package com.oops._03_methods;

public class _18_Sum {

	// instance method
	int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		
		_18_Sum d = new _18_Sum(); // obj creation

		int x = d.add(10, 20); // calling the method
		
		System.out.println(x); // printing the output
	}
}
