package com.bharat.variables;

public class _03_InstanceVariables {
    int x = 10;     // instance variable
    double y;       // instance variable
        
    public static void main(String args[]) {
        System.out.println("Accessing inside main method");
        
        _03_InstanceVariables refVar1 = new _03_InstanceVariables();
        System.out.println("x = " + refVar1.x);  
        System.out.println("y = " + refVar1.y);   
        
        refVar1.test();
    }
    
    public void test() {
        System.out.println("Accessing inside test method");
        
        _03_InstanceVariables refVar2 = new _03_InstanceVariables();
        
        System.out.println("x = " + refVar2.x);   
        System.out.println("y = " + refVar2.y);   
    }

}