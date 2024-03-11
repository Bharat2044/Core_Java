package com.bharat02.nonprimitive_datatypes;

public class ClassEX {
	private String name;
	private int age;
	
	public ClassEX(String name, int age) {
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
		ClassEX obj1 = new ClassEX("Bharat", 21);
		
		System.out.println(obj1.getName());
		System.out.println(obj1.getAge());
	}
}