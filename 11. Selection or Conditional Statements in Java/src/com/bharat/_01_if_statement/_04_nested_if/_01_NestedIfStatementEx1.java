package com.bharat._01_if_statement._04_nested_if;

public class _01_NestedIfStatementEx1 {
    public static void main(String[] args) {
        
    	if(true) {
            if(false)
                System.out.println("Hi");

            if(true)
                System.out.println("Hello");
                
            System.out.println("Hola");
        }
    }
}