package com.bharat._02_ternary_or_conditional_operator;

import java.util.Scanner;

public class _03_CheckNumberIsPositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String ans = (num > 0) ? "positive" : ((num < 0) ? "negative" : "neither positive or negative");
    
        System.out.println(num + " is " + ans + " number");
    }
}