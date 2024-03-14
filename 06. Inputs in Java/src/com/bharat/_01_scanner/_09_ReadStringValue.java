package com.bharat._01_scanner;

import java.util.Scanner;

public class _09_ReadStringValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First name: ");
        String a = sc.next();
        
        sc.nextLine();
        
        System.out.print("Enter Full name: ");
        String b = sc.nextLine();
        
        System.out.println("First Name = " + a);
        System.out.println("Full Name = " + b);
    }
}