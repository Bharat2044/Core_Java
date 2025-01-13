package com.oops._03_methods;

public class _09_MethodOverloadingUsingParameters {
  
    public static int sum(int a, int b) {
        return (a + b);
    }
  
    public static int sum(int a, int b, int c) {
        return (a + b + c);
    }
  
    public static int sum(int a, int b, int c, int d) {
        return (a + b + c + d);
    }
  
    public static void main(String[] args) {
        System.out.println(sum(2, 3));
        System.out.println(sum(2, 3, 4));
        System.out.println(sum(2, 3, 4, 5));
    }
}