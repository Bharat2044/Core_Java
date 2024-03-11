package com.bharat01.primitive_datatypes;

public class ShortDataType {
	static short x;
    
    public static void main(String args[]) {
        System.out.println("Size of short datatype = " + Short.SIZE + "bits  or  " + Short.SIZE/8 + "bytes");
        System.out.println("Max Value short datatype = " + Short.MAX_VALUE);
        System.out.println("Min Value short datatype = " + Short.MIN_VALUE);
        System.out.println("Defaul Value short datatype = " + x);
        
        Short a = 10;
        Short b = -100;
        
        Short c = 32767;
        Short d = -32768;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        // Short e = 32768;    // ShortDataType.java:23: error: incompatible types: int cannot be converted to Short
        // Short f = -32769;   // ShortDataType.java:24: error: incompatible types: int cannot be converted to Short
    }
}
