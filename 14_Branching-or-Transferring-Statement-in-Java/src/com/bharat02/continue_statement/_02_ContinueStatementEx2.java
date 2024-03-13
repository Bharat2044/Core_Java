package com.bharat02.continue_statement;

public class _02_ContinueStatementEx2 {
    public static void main(String[] args) {
        
        for(int i=1; i<=10; i++) {
            if(i %2 == 0)
                continue;
            
            System.out.println("Hello");
        } 
    }
}