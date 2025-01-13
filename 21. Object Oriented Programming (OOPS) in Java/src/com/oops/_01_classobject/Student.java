package com.oops._01_classobject;

public class Student {

	public static void main(String[] args) {
		
		// Creating two instances (objects) of the 'Student' class
		Student s1 = new Student();
		Student s2 = new Student();

		// Print the string representation of the objects (which is the default toString() method)
		System.out.println(s1);
		System.out.println(s2);
		
		// Printing the hash codes of both objects in decimal format
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
