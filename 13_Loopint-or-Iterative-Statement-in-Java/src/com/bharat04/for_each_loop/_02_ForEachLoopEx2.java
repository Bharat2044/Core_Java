package com.bharat04.for_each_loop;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_ForEachLoopEx2 {
    public static void main(String[] args) {
        
    	ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
  
        for (int ele : arr) {
            System.out.print(ele + " "); 
        }
    }
}