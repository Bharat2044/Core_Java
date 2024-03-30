package com.bharat.object_array;

public class ObjectArray {
	public static void main(String[] args) {
		
		Object[] objArr = new Object[3];
		objArr[0] = Integer.valueOf(10);	// 10
		objArr[1] = new String("Hello");
		objArr[2] = new User("alex", "alex@gmail.com");
		
		System.out.println("Display Object-Array:");
		for(Object k : objArr) {
			System.out.println(k);
		}
	}
}
