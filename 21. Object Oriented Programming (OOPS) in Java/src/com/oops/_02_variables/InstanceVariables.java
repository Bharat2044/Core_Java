package com.oops._02_variables;

public class InstanceVariables {
	// Instance Variables
	String name;
	int age;

	public static void main(String[] args) {

		InstanceVariables bharat = new InstanceVariables();
		bharat.name = "Bharat";
		bharat.age = 20;
		System.out.println(bharat.name + "  " + bharat.age);

		InstanceVariables rani = new InstanceVariables();
		rani.name = "Rani";
		rani.age = 25;
		System.out.println(rani.name + "  " + rani.age);
	}
}
