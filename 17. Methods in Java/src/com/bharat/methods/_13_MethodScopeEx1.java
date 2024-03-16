package com.bharat.methods;

public class _13_MethodScopeEx1 {
  
    public static void random(int marks) {
        int num = 67;
        
        System.out.println(num);
        System.out.println(marks);
    }
    
    public static void main(String[] args) {
        random(99);
    }
}