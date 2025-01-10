package com.strings._01_string_class;

public class _13_LastIndexOfMethod {

    public static void main(String[] args) {

        /*
         * public int lastIndexOf(char); -> The lastIndexOf(char ch) method in Java is
         * a part of the String class. It's used to find the index of the last occurrence
         * of the specified character within the string.
         * 
         * Syntax: public int lastIndexOf(char ch)
         * 
         * ch: The character to search for within the string.
         * 
         * This method returns the index of the last occurrence of the specified
         * character within the string. If the character is not found, it returns -1.
         * 
         */

        String str = "Hello, World!";
        int index = str.lastIndexOf('o');

        System.out.println(index); // Output: 8
        System.out.println(str.lastIndexOf('x')); // Output: -1
        System.out.println();


        /*
         * public int lastIndexOf(char, int); -> The lastIndexOf(char ch, int fromIndex)
         * method in Java is a part of the String class. It's used to find the index of
         * the last occurrence of the specified character within the string, starting
         * from the specified index fromIndex.
         * 
         * Syntax: public int lastIndexOf(char ch, int fromIndex)
         * 
         * ch: The character to search for within the string.
         * 
         * fromIndex: The index from which to start the backward search. The search
         * proceeds toward the beginning of the string, starting from fromIndex.
         * 
         * This method returns the index of the last occurrence of the specified
         * character within the string, starting the search from the specified index
         * fromIndex. If the character is not found after fromIndex, it returns -1.
         */
        System.out.println(str.lastIndexOf('o', 10)); // Output: 8
        System.out.println(str.lastIndexOf('l', 5)); // Output: 3
        System.out.println(str.lastIndexOf('x', 19)); // Output: -1
        System.out.println();
        

        /*
         * public int lastIndexOf(java.lang.String); -> The lastIndexOf(String str)
         * method in Java is a part of the String class. It's used to find the index of
         * the last occurrence of the specified substring within the string.
         * 
         * Syntax: public int lastIndexOf(String str)
         * 
         * str: The substring to search for within the string.
         * 
         * This method returns the index of the last occurrence of the specified
         * substring within the string. If the substring is not found, it returns -1.
         */
        System.out.println(str.lastIndexOf("l")); // Output: 10
        System.out.println(str.lastIndexOf("World")); // Output: 7
        System.out.println(str.lastIndexOf("xyz")); // Output: -1
        System.out.println();
        

        /*
        * public int lastIndexOf(java.lang.String, int); -> The lastIndexOf(String str, int
        * fromIndex) method in Java is a part of the String class. It's used to find
        * the index of the last occurrence of the specified substring within the
        * string, starting from the specified index fromIndex and searching backwards.
        *
        * Syntax: public int lastIndexOf(String str, int fromIndex)
        *
        * str: The substring to search for within the string.
        *
        * fromIndex: The index from which to start the search. The search begins at
        * fromIndex and proceeds backwards towards the start of the string.
        *
        * This method returns the index of the last occurrence of the specified
        * substring within the string, starting the search from the specified index
        * fromIndex and searching backwards. If the substring is not found before fromIndex,
        * it returns -1.
        */
        System.out.println(str.lastIndexOf("l", 5)); // Output: 3
        System.out.println(str.lastIndexOf("o", 5)); // Output: 4
        System.out.println(str.lastIndexOf("World", 3)); // Output: -1
        System.out.println(str.lastIndexOf("xyz", 7)); // Output: -1
        System.out.println();
        

        /*
         * public int lastIndexOf(int); -> The lastIndexOf(int ch) method in Java is
         * a part of the String class. It's used to find the index of the last occurrence
         * of the specified Unicode code point (character) within the string.
         * 
         * Syntax: public int lastIndexOf(int ch)
         * 
         * ch: The Unicode code point (character) to search for within the string.
         * 
         * This method returns the index of the last occurrence of the specified
         * character within the string. If the character is not found, it returns -1.
         */
        System.out.println(str.lastIndexOf(101)); // Output: 1 => 101 -> e
        System.out.println(str.lastIndexOf(87)); // Output: 7 => 87 -> W
        System.out.println(str.lastIndexOf(108)); // Output: 10 => 108 -> l
        System.out.println();

        
        /*
         * public int lastIndexOf(int, int); -> The lastIndexOf(int ch, int fromIndex)
         * method in Java is a part of the String class. It's used to find the index of
         * the last occurrence of the specified Unicode code point (character) within the
         * string, starting from the specified index fromIndex.
         * 
         * Syntax: public int lastIndexOf(int ch, int fromIndex)
         * 
         * ch: The Unicode code point (character) to search for within the string.
         * 
         * fromIndex: The index from which to start the backward search. The search
         * proceeds toward the beginning of the string, starting from fromIndex.
         * 
         * This method returns the index of the last occurrence of the specified
         * character within the string, starting the search from the specified index
         * fromIndex. If the character is not found after fromIndex, it returns -1.
         */
        System.out.println(str.lastIndexOf(108, 4)); // Output: 3 => 108 -> l
        System.out.println(str.lastIndexOf(87, 6)); // Output: -1 => 87 -> W
        System.out.println();
	}
}
