package com.bharat02.ternary_or_conditional_operator;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
    
        String ans = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(num + " is an " + ans + " number");       
    }
}