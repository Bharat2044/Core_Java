package com.bharat._01_if_statement._03_if_else_if;

import java.util.Scanner;

public class _03_CheckNumberIsPositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
    
        if (num > 0) {
            System.out.println("You entered a positive integer: " + num);
        }
        else if(num < 0) {
            System.out.println("You entered a negative integer: " + num);
        }
        else {
            System.out.println("You entered zero");
        }
    }
}