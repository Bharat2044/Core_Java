package com.bharat03.for_loop;

import java.util.Scanner;

public class _08_PrintEvenNumberFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
    
        for (int i=1; i<=n; i++) {
            if(i%2 == 0)
                System.out.println(i);
        }
    }
}