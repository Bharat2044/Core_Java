package com.bharat.methods;

import java.util.Arrays;

public class _26_VarArgsEx4 {

    public static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    public static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }
    
    public static void main(String[] args) {
        // demo();  // VarArgsEx4.java:16: error: reference to demo is ambiguous
        
        demo(1, 2, 3);
        demo("Ram", "Mohan", "Deepak");
        
        // demo(1, 2, 3, "Deepak"); //VarArgsEx4.java:21: error: no suitable method found for demo(int,int,int,String)
    }
}