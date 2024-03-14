package com.bharat._02_nonprimitive_datatypes;

public class _03_ClassEx {
	private String name;
	private int age;
	
	public _03_ClassEx(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public static void main(String[] args) {
		_03_ClassEx obj1 = new _03_ClassEx("Bharat", 21);
		
		System.out.println(obj1.getName());
		System.out.println(obj1.getAge());
	}
}