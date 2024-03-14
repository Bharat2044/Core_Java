package com.bharat.variables;

public class _02_StaticVariables {
    static int x = 10;     // static variable
    static double y;       // static variable
        
    public static void main(String args[]) {
        System.out.println("Accessing inside main method");
        
        // Accessing static variable
        System.out.println("x = " + x);	// internally, _02_StaticVariables.x
        System.out.println("y = " + y); // internally, _02_StaticVariables.y
        
        System.out.println("x = " + _02_StaticVariables.x); 
        System.out.println("y = " + _02_StaticVariables.y); 
        
        _02_StaticVariables refVar1 = new _02_StaticVariables();
        System.out.println("x = " + refVar1.x);   // not a good practice
        System.out.println("y = " + refVar1.y);   // not a good practice
        
        
        _02_StaticVariables.test();
    }
    
    public static void test() {
        System.out.println("Accessing inside test method");
        
        System.out.println("x = " + x);	// internally, _02_StaticVariables.x
        System.out.println("y = " + y); // internally, _02_StaticVariables.y
        
        System.out.println("x = " + _02_StaticVariables.x); 
        System.out.println("y = " + _02_StaticVariables.y); 
        
        _02_StaticVariables refVar2 = new _02_StaticVariables();
        System.out.println("x = " + refVar2.x);   // not a good practice
        System.out.println("y = " + refVar2.y);   // not a good practice
    }

}