package com.bharat03.commandlinearguments;

public class ReadCharacterValue {
    public static void main(String args[]) {
        
        char a = args[0].charAt(0);
        
        System.out.println("Result: " + a);
    }
}