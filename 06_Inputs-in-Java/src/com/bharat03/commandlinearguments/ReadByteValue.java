package com.bharat03.commandlinearguments;

public class ReadByteValue {
    public static void main(String args[]) {
        
        byte a = Byte.parseByte(args[0]);
        
        System.out.println("The number is: " + a);
    }
}
