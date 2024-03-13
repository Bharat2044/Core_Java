package com.bharat._01_primitive_datatypes;

public class _07_BooleanDataType {
	static boolean x;
    
    public static void main(String args[]) {
    	System.out.println("Default value of boolean = " + x);
    	
        boolean a = true;     
        boolean b = false;    
        
        // boolean c = 0;  // BooleanDataType.java:12: error: incompatible types: int cannot be converted to boolean
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}