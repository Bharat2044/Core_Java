package com.bharat.variables;

public class _01_LocalVariables {
    public static void main(String args[]) {
        int x = 10;     // local variable
        int y;          // local variable
      
        System.out.println(x);
        // System.out.println(y);  // Exception in thread "main" java.lang.Error: Unresolved compilation problem: The local variable y may not have been initialized
        
        _01_LocalVariables.test();
    }
    
    public static void test() {
        int z = 30;     // local variable
      
        System.out.println(z);
        // System.out.println(x);   // Exception in thread "main" java.lang.Error: Unresolved compilation problem: x cannot be resolved to a variable
    }

}