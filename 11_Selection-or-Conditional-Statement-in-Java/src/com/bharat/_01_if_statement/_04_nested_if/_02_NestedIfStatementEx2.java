package com.bharat._01_if_statement._04_nested_if;

public class _02_NestedIfStatementEx2 {
    public static void main(String[] args) {
		int i = 10;

		if(i == 10) {
			if(i < 15)
				System.out.println(i + " is smaller than 15");
				
			if(i < 12)
				System.out.println(i + " is smaller than 12 too");
			else
				System.out.println(i + " is greater than 15");
		}
    }
}