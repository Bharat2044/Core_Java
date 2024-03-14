package com.bharat.operators;

public class _09_NewOperator {
	
	public _09_NewOperator(String name) {
		// This constructor has one parameter, name.
		System.out.println("Passed Name is : " + name);
	}

	public static void main(String[] args) {
		
		// Following statement would create an object obj
		_09_NewOperator obj1 = new _09_NewOperator("Bharat");
		_09_NewOperator obj2 = new _09_NewOperator("Deepak");
	}
}