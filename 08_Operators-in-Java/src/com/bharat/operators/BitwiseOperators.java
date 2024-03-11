package com.bharat.operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        
        System.out.println(a + " & " + b + " = " + (a & b));
        System.out.println(a + " | " + b + " = " + (a | b));
        System.out.println(a + " ^ " + b + " = " + (a ^ b));
        System.out.println("~" + a + " = " + (~a));
        System.out.println(a + " >> " + b + " = " + (a >> b));
        System.out.println(a + " >>> " + b + " = " + (a >>> b));
        System.out.println(a + " << " + b + " = " + (a << b));
    }
}