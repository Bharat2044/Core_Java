package com.bharat._04_for_each_loop;

public class _03_LargestElementInAnArray {
    public static void main(String[] args) {
        
        int arr[] = {10, 50, 60, 80, 90}; 
        
        int max = arr[0];
  
        for (int ele : arr) {
            if(ele > max)
                max = ele;
        }
        
        System.out.print("Largest Element = " + max); 
    }
}