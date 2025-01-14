package com.oops._03_methods;

public class _10_MethodOverloadingUsingDataTypes {
  
    public static int sum(int a, int b) {
        return (a + b);
    }
  
    public static float sum(float a, int b) {
        return (a + b);
    }
  
    public static float sum(float a, float b) {
        return (a + b);
    }
  
    public static double sum(double a, double b) {
        return (a + b);
    }
  
    public static void main(String[] args) {
        
        System.out.println(sum(2, 3));
        System.out.println(sum(3.3f, 3));
        System.out.println(sum(2.1f, 3.1f));
        System.out.println(sum(4.2, 5.5));
        System.out.println(sum(5.5, 5));
    }
}