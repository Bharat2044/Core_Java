package com.bharat._01_scanner;

import java.util.Scanner;

public class _03_ReadIntegerValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        
        System.out.println("The number is: " + a);
    }
}