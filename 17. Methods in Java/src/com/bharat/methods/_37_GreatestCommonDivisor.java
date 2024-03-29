/*
Problem Description:
Given 2 non-negative integers A and B, find gcd(A, B)

GCD of 2 integers A and B is defined as the greatest integer 'g' such that 'g' is a divisor of both A and B. Both A and B fit in a 32 bit signed integer.

Note: DO NOT USE LIBRARY FUNCTIONS.

Problem Constraints:
0 <= A, B <= 10^9

Input Format
First argument is an integer A.
Second argument is an integer B.

Output Format:
Return an integer denoting the gcd(A, B).

Example Input:
Input 1:
A = 4 B = 6
Input 2:
A = 6  B = 7

Example Output:
Output 1:
2
Output 2:
1

Example Explanation:
Explanation 1:
2 divides both 4 and 6
Explanation 2:
1 divides both 6 and 7
*/



package com.bharat.methods;

import java.util.Scanner;

public class _37_GreatestCommonDivisor { 

    // 1st Approach
    /*
    public static int gcd(int a, int b) {
        int ans = 1;
        int x = Math.min(a, b);
    
        for (int i=2; i<=x; i++) {
            if (a % i == 0 && b % i == 0) 
                ans = i;
        }
            
        return ans;
    }
    */
    
    // 2nd Approach
    /*
    public static int gcd(int a, int b) {
        int ans = 1;
        int x = Math.min(a, b);
	    
	    for (int i = x; i >= 1; i--) {
	        if(a % i == 0 && b % i == 0) {
	            ans = i;
	            break;
	        }
	    }
	    
	    return ans;
    }
    */
    
    
    // 3rd Approach
    /*
    public static int gcd(int a, int b) {
        int ans = 1;
        int x = Math.min(a, b);
    
        for (int i = 1; i * i <= x; i++) {
            if (a % i == 0 && b % i == 0) 
                ans = i;
    
            if (a % (x/i)==0 && b % (x/i) == 0) {
                ans = x/i;
                break;
            }
        }
            
        return ans;
    }
    */
    
    // 4th Approach
    public static int gcd(int a, int b) {
        int x, y;
    
        while(a % b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
            
        return b;
    }
    
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int ans = gcd(a, b);
        
        System.out.println(ans);
        
        sc.close();
    }
}
