// Input currency in rupees and output in USD

package com.bharat.programs;

import java.util.Scanner;

public class _20_ConvertRupeesToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rupees: ");
        float rupees = sc.nextInt();
        
        float dollar = rupees / 83.34f;
        
        System.out.println("Dollar = " + dollar);
        
        sc.close();
    }
}
