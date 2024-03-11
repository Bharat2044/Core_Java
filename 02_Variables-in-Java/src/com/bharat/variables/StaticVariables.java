package com.bharat.variables;

public class StaticVariables {
    static int x = 10;     // static variable
    static double y;       // static variable
        
    public static void main(String args[]) {
        System.out.println("Accessing inside main method");
        
        // Accessing static variable
        System.out.println("x = " + x);	// internally, StaticVariables.x
        System.out.println("y = " + y); // internally, StaticVariables.y
        
        System.out.println("x = " + StaticVariables.x); 
        System.out.println("y = " + StaticVariables.y); 
        
        StaticVariables refVar1 = new StaticVariables();
        System.out.println("x = " + refVar1.x);   // not a good practice
        System.out.println("y = " + refVar1.y);   // not a good practice
        
        
        StaticVariables.test();
    }
    
    public static void test() {
        System.out.println("Accessing inside test method");
        
        System.out.println("x = " + x);	// internally, StaticVariables.x
        System.out.println("y = " + y); // internally, StaticVariables.y
        
        System.out.println("x = " + StaticVariables.x); 
        System.out.println("y = " + StaticVariables.y); 
        
        StaticVariables refVar2 = new StaticVariables();
        System.out.println("x = " + refVar2.x);   // not a good practice
        System.out.println("y = " + refVar2.y);   // not a good practice
    }

}