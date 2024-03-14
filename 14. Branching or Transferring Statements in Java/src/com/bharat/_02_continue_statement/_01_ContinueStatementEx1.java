package com.bharat._02_continue_statement;

public class _01_ContinueStatementEx1 {
    public static void main(String[] args) {
        
        for(int i=1; i<=10; i++) {
            if(i > 5)
                continue;
            
            System.out.println("Hello");
        } 
    }
}