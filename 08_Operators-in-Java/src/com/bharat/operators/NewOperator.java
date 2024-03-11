package com.bharat.operators;

public class NewOperator {
	
	public NewOperator(String name) {
		// This constructor has one parameter, name.
		System.out.println("Passed Name is : " + name);
	}

	public static void main(String[] args) {
		
		// Following statement would create an object obj
		NewOperator obj1 = new NewOperator("Bharat");
		NewOperator obj2 = new NewOperator("Deepak");
	}
}