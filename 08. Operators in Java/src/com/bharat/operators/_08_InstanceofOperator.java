package com.bharat.operators;

public class _08_InstanceofOperator {
    public static void main(String[] args) {
        String str = "Bharat";
        
        boolean result = str instanceof String;
        System.out.println("Is str an object of String? " + result);
        
        _08_InstanceofOperator i = new _08_InstanceofOperator();
        System.out.println(i instanceof _08_InstanceofOperator);
        System.out.println(i instanceof Object);
        
        if(i instanceof _08_InstanceofOperator) {
        	System.out.println("Hello");
        }
    }
}
