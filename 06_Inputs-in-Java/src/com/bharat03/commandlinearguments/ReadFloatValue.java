package com.bharat03.commandlinearguments;

public class ReadFloatValue {
    public static void main(String args[]) {
        
        float a = Float.parseFloat(args[0]);
        
        System.out.println("The number is: " + a);
    }
}
