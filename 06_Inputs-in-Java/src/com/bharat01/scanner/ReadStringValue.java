package com.bharat01.scanner;

import java.util.Scanner;

public class ReadStringValue {
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