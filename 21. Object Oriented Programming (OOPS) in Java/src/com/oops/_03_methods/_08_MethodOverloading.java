package com.oops._03_methods;

public class _08_MethodOverloading {
  
    public static void greet() {
        System.out.println("Hi");
    }
    
    public static void greet(String name) {
        System.out.println("Hi " + name);
    }
  
    public static void main(String[] args) {
        greet();
        greet("Raj");
    }
}