package com.bharat._01_primitive_datatypes;

public class _01_ByteDataType {
	static byte x;
    
    public static void main(String args[]) {
        System.out.println("Size of byte datatype = " + Byte.SIZE + "bits  or  " + Byte.SIZE/8 + "byte");
        System.out.println("Max Value byte datatype = " + Byte.MAX_VALUE);
        System.out.println("Min Value byte datatype = " + Byte.MIN_VALUE);
        System.out.println("Default Value byte datatype = " + x);
        
        byte a = 10;
        byte b = -100;
        
        byte c = 127;
        byte d = -128;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        // byte e = 128;   // ByteDataType.java:23: error: incompatible types: possible lossy conversion from int to byte
        // byte f = -129;  // ByteDataType.java:24: error: incompatible types: possible lossy conversion from int to byte
    }
}