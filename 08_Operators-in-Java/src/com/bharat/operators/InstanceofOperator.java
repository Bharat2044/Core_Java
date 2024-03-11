package com.bharat.operators;

public class InstanceofOperator {
    public static void main(String[] args) {
        String str = "Bharat";
        
        boolean result = str instanceof String;
        System.out.println("Is str an object of String? " + result);
        
        InstanceofOperator i = new InstanceofOperator();
        System.out.println(i instanceof InstanceofOperator);
        System.out.println(i instanceof Object);
        
        if(i instanceof InstanceofOperator) {
        	System.out.println("Hello");
        }
    }
}
