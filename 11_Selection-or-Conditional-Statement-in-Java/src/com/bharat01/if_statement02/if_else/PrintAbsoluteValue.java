package com.bharat01.if_statement02.if_else;

import java.util.Scanner;

public class PrintAbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
    
        if(num >= 0) {
            System.out.println(num);
        }
        else {
            System.out.println((-num));
        }
    }
}