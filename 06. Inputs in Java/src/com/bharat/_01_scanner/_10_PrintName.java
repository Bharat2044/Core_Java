package com.bharat._01_scanner;

import java.util.Scanner;

public class _10_PrintName {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.println("Your name is: " + name);
    }
}