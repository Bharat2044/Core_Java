package com.bharat.programs;

import java.util.Scanner;

public class _28_PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();

        double perimeter = 2 * Math.PI * r;
        
        System.out.println("Perimeter Of Circle = " + perimeter);
        
        sc.close();
    }
}
