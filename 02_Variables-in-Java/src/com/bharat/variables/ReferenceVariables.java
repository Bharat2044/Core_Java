package com.bharat.variables;

public class ReferenceVariables {
    static ReferenceVariables a1 = new ReferenceVariables();  // static reference variable
    static ReferenceVariables a2 = null;    // static reference variable
    static ReferenceVariables a3;           // static reference variable
        
    public static void main(String args[]) {
        System.out.println("Accessing inside main method");
        
        ReferenceVariables a4 = new ReferenceVariables();  // local reference variable
        ReferenceVariables a5 = null;    // local reference variable
        ReferenceVariables a6;           // local reference variable
        
        ReferenceVariables a7 = new ReferenceVariables();  // local static reference variable
        ReferenceVariables a8 = null;    // local static reference variable
        ReferenceVariables a9;           // local static reference variable
        
        System.out.println("a1 = " + a1);  
        System.out.println("a2 = " + a2);  
        System.out.println("a3 = " + a3);  
        System.out.println("a4 = " + a4);  
        System.out.println("a5 = " + a5);  
        // System.out.println("a6 = " + a6);  // Exception in thread "main" java.lang.Error: Unresolved compilation problems: The local variable a6 may not have been initialized
        System.out.println("a7 = " + a7);  
        System.out.println("a8 = " + a8);  
        // System.out.println("a9 = " + a9);  // Exception in thread "main" java.lang.Error: Unresolved compilation problems: The local variable a9 may not have been initialized
        
        ReferenceVariables.test();
    }
    
    public static void test() {
        System.out.println("Accessing inside test method");
        
        System.out.println("a1 = " + a1);  
        System.out.println("a2 = " + a2);  
        System.out.println("a3 = " + a3);  
        
        // System.out.println("a4 = " + a4);  // Exception in thread "main" java.lang.Error: Unresolved compilation problems: a4 cannot be resolved to a variable
        // System.out.println("a5 = " + a5);  // Exception in thread "main" java.lang.Error: Unresolved compilation problems: a5 cannot be resolved to a variable  
        // System.out.println("a6 = " + a6);  // Exception in thread "main" java.lang.Error: Unresolved compilation problems: a6 cannot be resolved to a variable
        // System.out.println("a7 = " + a7);  // Exception in thread "main" java.lang.Error: Unresolved compilation problems: a7 cannot be resolved to a variable
        // System.out.println("a8 = " + a8);  // Exception in thread "main" java.lang.Error: Unresolved compilation problems: a8 cannot be resolved to a variable
        // System.out.println("a9 = " + a9);  // Exception in thread "main" java.lang.Error: Unresolved compilation problems: a9 cannot be resolved to a variable
    }

}