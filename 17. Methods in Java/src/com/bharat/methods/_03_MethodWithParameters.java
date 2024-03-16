package com.bharat.methods;

public class _03_MethodWithParameters { 

    public static void greet(String name) {
        System.out.println("Hi " + name);
    }
    
    public static void main(String[] args) {
        greet("Rahul");
        greet("Bharat");
    }
}