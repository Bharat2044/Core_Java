package com.strings._01_string_class;

public class _02_StringClassMethods {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "heLlo";
		String str3 = new String("Hello");

		// length() method
		System.out.println("1. length() method");
		System.out.println("str1 length = " + str1.length());
		System.out.println("str2 length = " + str2.length());
		System.out.println("str3 length = " + str3.length());
		System.out.println();

		// isEmpty() method
		System.out.println("2. isEmpty() method");
		System.out.println(str1.isEmpty());
		System.out.println(str2.isEmpty());
		System.out.println("".isEmpty());
		System.out.println();

		// charAt() method
		System.out.println("3. charAt() method");
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(4));
		// System.out.println(str1.charAt(9)); // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range
		System.out.println();

		// concat() method
		System.out.println("4. concat() method");
		System.out.println(str1.concat(str2));
		System.out.println(str1.concat(str2).concat(str3));
		System.out.println(str1.concat(" " + str2).concat(" " + str3));
		System.out.println();

		// '+' operator
		System.out.println("5. + operator");
		System.out.println(str1 + str2);
		System.out.println(str1 + str2 + str3);
		System.out.println(str1 + " " + str2 + " " + str3);
		System.out.println();

		// '==' operator
		System.out.println("6. == operator");
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
		System.out.println();

		// equals() method
		System.out.println("7. equals() method");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str3));
		System.out.println();

		// equalsIgnoreCase() method
		System.out.println("8. equalsIgnoreCase() method");
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		System.out.println();

		// compareTo() method
		System.out.println("9. compareTo() method");
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str2.compareTo(str3));
		System.out.println();

		// compareToIgnoreCase() method
		System.out.println("10. compareToIgnoreCase() method");
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.compareToIgnoreCase(str3));
		System.out.println(str2.compareToIgnoreCase(str3));
		System.out.println();

		String str4 = "Hello, World, Hello";

		// replace() method
		System.out.println("11. replace() method");
		System.out.println("Original String: " + str4);
		System.out.println(str4.replace('l', 'x'));
		System.out.println(str4.replace("l", "x"));
		System.out.println(str4.replace("ll", "mmn"));
		System.out.println(str4.replace("llt", "pp"));
		System.out.println();

		// replaceFirst() method
		System.out.println("12. replaceFirst() method");
		System.out.println("Original String: " + str4);
		// System.out.println(str4.replaceFirst('l', 'x')); // CE: The method
		// replaceFirst(String, String) in the type String is not applicable for the
		// arguments (char, char)
		System.out.println(str4.replaceFirst("l", "x"));
		System.out.println(str4.replaceFirst("ll", "mmn"));
		System.out.println(str4.replaceFirst("llt", "pp"));
		System.out.println();

		// replaceAll() method
		System.out.println("13. replaceAll() method");
		System.out.println("Original String: " + str4);
		// System.out.println(str4.replaceAll('l', 'x')); // CE: The method replaceAll(String, String) in the type String is not applicable for the arguments (char, char)
		System.out.println(str4.replaceAll("l", "x"));
		System.out.println(str4.replaceAll("ll", "mmn"));
		System.out.println(str4.replaceAll("llt", "pp"));
		System.out.println();

		// toLowerCase() method
		System.out.println("14. toLowerCase() method");
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toLowerCase());
		System.out.println();

		// toUpperCase()method
		System.out.println("15. toUpperCase() method");
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toUpperCase());
		System.out.println();

		// indexOf() method
		System.out.println("16. indexOf() method");
		System.out.println("Original String: " + str4);
		System.out.println(str4.indexOf('H'));
		System.out.println(str4.indexOf("llo"));
		System.out.println(str4.indexOf('x'));
		System.out.println();

		// substring() method
		System.out.println("17. substring() method");
		System.out.println("Original String: " + str4);
		System.out.println(str4.substring(1));
		System.out.println(str4.substring(1, 9));
		// System.out.println(str4.substring(4, 20)); // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: begin 4, end 20, length 19
		System.out.println();

		// valueOf() method
		int a = 10, b = 20;
		double c = 22.45;
		Boolean d = true;
		System.out.println("18. valueOf() method");
		System.out.println(String.valueOf(a) + String.valueOf(b));
		System.out.println(String.valueOf(a) + String.valueOf(c));
		System.out.println(String.valueOf(a) + String.valueOf(c) + String.valueOf(d));
		System.out.println();

		// startsWith() method
		System.out.println("19. startsWith() method");
		System.out.println("Original String: " + str4);
		// System.out.println(str4.startsWith('H')); // CE: The method startsWith(String) in the type String is not applicable for the arguments
		// (char)
		System.out.println(str4.startsWith("H"));
		System.out.println(str4.startsWith("Hello"));
		System.out.println(str4.startsWith("xy"));
		System.out.println();

		// endsWith() method
		System.out.println("20. endsWith() method");
		System.out.println("Original String: " + str4);
		// System.out.println(str4.endsWith('H')); // CE: The method endsWith(String) in the type String is not applicable for the arguments (char)
		System.out.println(str4.endsWith("o"));
		System.out.println(str4.endsWith("Hello"));
		System.out.println(str4.endsWith("xy"));
		System.out.println();

		// trim() method
		String str5 = "       Hello World         ";
		System.out.println("21. trim()");
		System.out.println("Original String: " + str5);
		System.out.println(str4.trim());
		System.out.println();

		// intern() method
		String str6 = str1.intern();
		String str7 = str3.intern();
		System.out.println("22. intern()");
		System.out.println(str6 + "  " + (str1 == str6));
		System.out.println(str7 + "  " + (str1 == str7));
		System.out.println((str1 == str3));
		System.out.println((str6 == str7));
		System.out.println();

		// toString() method
		System.out.println("23. toString()");
		System.out.println(str1.toString());
		System.out.println(Integer.valueOf(123).toString());
		System.out.println();

		// toCharArray() method
		char[] ch1 = str1.toCharArray();
		System.out.println("24. toCharArray()");
		System.out.println(ch1);
		System.out.println(ch1[1]);
		System.out.println("Raj".toCharArray());
		System.out.println("Raj".toCharArray()[2]);
		System.out.println();

		// contains() method
		System.out.println("25. contains() method");
		System.out.println("Original String: " + str4);
		// System.out.println(str4.contains('H')); // CE: The method contains(CharSequence) in the type String is not applicable for the arguments (char)
		System.out.println(str4.contains("o"));
		System.out.println(str4.contains("ello H"));
		System.out.println(str4.contains("Hello"));
		System.out.println(str4.contains("World, Hello"));
		System.out.println(str4.contains("xy"));
		System.out.println();

		// split() method
		String str8 = "Hi Hello Hola Bye";
		String[] strArr1 = str8.split("");
		String[] strArr2 = str8.split(" ");

		System.out.println("25. split() method");
		for (String k : strArr1) {
			System.out.print(k);
		}
		System.out.println("\n");

		for (String k : strArr2) {
			System.out.println(k);
		}
		System.out.println();

		String str9 = "ThexyzWebsitexyzisxyzaxyzGooglexyzWebsite.";
		String[] strArr3 = str9.split("xyz");
		for (String k : strArr3) {
			System.out.print(k + " ");
		}
	}
}
