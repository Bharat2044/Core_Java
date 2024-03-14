package com.bharat._02_logarithmic_math_methods;

import java.util.Scanner;

public class _03_CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int cnt = (int)Math.log10(n) + 1;
        
        System.out.println("Number of digits = " +cnt);
    }
}