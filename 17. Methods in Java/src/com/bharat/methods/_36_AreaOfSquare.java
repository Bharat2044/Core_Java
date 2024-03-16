package com.bharat.methods;

import java.util.Scanner;

public class _36_AreaOfSquare { 

    public static float areaOfSquare(float a) {        
        return (a * a);
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
          
          System.out.print("Enter side of area: ");
          float a = sc.nextFloat(); 
          
          float ans = areaOfSquare(a);
            
          System.out.println("Area = " + ans);
    }
}