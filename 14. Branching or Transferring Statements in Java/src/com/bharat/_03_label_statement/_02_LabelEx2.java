package com.bharat._03_label_statement;

public class _02_LabelEx2 {
    public static void main(String[] args) {
      
        outerLoop: 
        for (int i=1; i<=5; i++) { 
          
           innerLoop: 
            for (int j=1; j<5; j++) { 
                if (i != j) { 
                    System.out.println("If block values " + i); 
                    break outerLoop; 
                } 
                else { 
                    System.out.println("Else block values " + i); 
                    continue innerLoop; 
                } 
            } 
        } 
    }
}