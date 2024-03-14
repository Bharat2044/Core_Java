package com.bharat.programs;

import java.util.Scanner;

public class _29_PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of one side of the equilateral triangle: ");
        double l = sc.nextDouble();

        double perimeter = 3 * l;
        
        System.out.println("Perimeter Of Equilateral Triangle = " + perimeter);
        
        sc.close();
    }
}
