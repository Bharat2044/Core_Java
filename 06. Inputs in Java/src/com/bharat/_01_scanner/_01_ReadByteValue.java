package com.bharat._01_scanner;

import java.util.Scanner;

public class _01_ReadByteValue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        byte a = sc.nextByte();
        
        System.out.println("The number is: " + a);
    }
}
