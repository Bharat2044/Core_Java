package com.bharat._01_if_statement._01_simple_if;

import java.util.Scanner;

public class _06_PrintAbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
    
        if(num >= 0) 
            System.out.println(num);
        
        if(num < 0)  
            System.out.println((-num));
    }
}