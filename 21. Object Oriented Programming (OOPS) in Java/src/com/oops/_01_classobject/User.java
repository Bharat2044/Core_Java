package com.oops._01_classobject;

public class User {

	// Main method: This is the entry point of the program where execution starts
	public static void main(String[] args) {

		// Creating two instances (objects) of the 'User' class
		User u1 = new User(); // First object of class User
		User u2 = new User(); // Second object of class User

		// Print the string representation of the objects (which is the default toString() method)
        // This will output the class name followed by the '@' sign and the hashcode in hexadecimal.
		System.out.println(u1);
		System.out.println(u2);

		// Printing the hash codes of both objects in decimal format
		// The hashCode() method (also inherited from Object class) returns an integer
		// that represents the memory address of the object or some unique identifier.
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
	}
}
