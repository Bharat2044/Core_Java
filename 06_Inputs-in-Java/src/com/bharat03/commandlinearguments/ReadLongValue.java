package com.bharat03.commandlinearguments;

public class ReadLongValue {
    public static void main(String args[]) {
        
        long a = Long.parseLong(args[0]);
        
        System.out.println("The number is: " + a);
    }
}
