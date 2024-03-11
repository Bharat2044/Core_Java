package com.bharat01.primitive_datatypes;

public class FloatDataType {
	static float x;
    
    public static void main(String args[]) {
        System.out.println("Size of float datatype = " +  Float.SIZE + "bits  or  " + Float.SIZE/8 + "bytes");
        System.out.println("Max Value float datatype = " + Float.MAX_VALUE);
        System.out.println("Min Value float datatype = " + Float.MIN_VALUE);
        System.out.println("Default Value float datatype = " + x);
        
        // float a = 10.5;     // FloatDataType.java:10: error: incompatible types: possible lossy conversion from double to float
        // float b = -10.5;    // FloatDataType.java:11: error: incompatible types: possible lossy conversion from double to float
        float c = 20.8f;
        float d = -20F;
        
        float e = 9223372036854775807l;
        float f = -9223372036854775808l;
        
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }
}
