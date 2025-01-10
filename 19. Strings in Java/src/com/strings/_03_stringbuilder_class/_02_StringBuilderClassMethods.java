package com.strings._03_stringbuilder_class;

public class _02_StringBuilderClassMethods {
	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("");
		StringBuilder sb2 = new StringBuilder("Hello");
		StringBuilder sb3 = new StringBuilder("Hello");

		// capacity()
		System.out.println("1. capacity() method");
		System.out.println("sb1 capacity = " + sb1.capacity());
		System.out.println("sb2 capacity = " + sb2.capacity());
		System.out.println("sb3 capacity = " + sb3.capacity());
		System.out.println();

		// length() method
		System.out.println("2. length() method");
		System.out.println("sb1 length = " + sb1.length());
		System.out.println("sb2 length = " + sb2.length());
		System.out.println("sb3 length = " + sb3.length());
		System.out.println();

		// isEmpty() method
		System.out.println("3. isEmpty() method");
		System.out.println(sb1.isEmpty());
		System.out.println(sb2.isEmpty());
		System.out.println();

		// charAt() method
		System.out.println("4. charAt() method");
		System.out.println(sb2.charAt(0));
		System.out.println(sb2.charAt(4));
		// System.out.println(sb2.charAt(9)); // Exception in thread "main"
		// java.lang.StringIndexOutOfBoundsException: index 9, length 5
		System.out.println();

		// hasCode() method
		System.out.println("5. hasCode() method");
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		System.out.println(sb3.hashCode());
		System.out.println();

		// '==' operator
		System.out.println("6. == operator");
		System.out.println(sb1 == sb2);
		System.out.println(sb2 == sb3);
		System.out.println();

		// equals() method
		System.out.println("7. equals() method");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb2.equals(sb3));
		System.out.println();

		// compareTo() method
		System.out.println("8. compareTo() method");
		System.out.println(sb1.compareTo(sb2));
		System.out.println(sb2.compareTo(sb3));
		System.out.println();

		// indexOf() method
		System.out.println("9. indexOf() method");
		System.out.println("Original String: " + sb2);
		System.out.println(sb2.indexOf("H"));
		System.out.println(sb2.indexOf("l"));
		System.out.println(sb2.indexOf("llo"));
		System.out.println(sb2.indexOf("x"));
		System.out.println(sb2.indexOf("l", 3));
		System.out.println();

		// lastIndexOf() method
		System.out.println("10. lastIndexOf() method");
		System.out.println("Original String: " + sb2);
		System.out.println(sb2.lastIndexOf("H"));
		System.out.println(sb2.lastIndexOf("l"));
		System.out.println(sb2.lastIndexOf("llo"));
		System.out.println(sb2.lastIndexOf("x"));
		System.out.println(sb2.lastIndexOf("l", 3));
		System.out.println();

		// substring() method
		System.out.println("11. substring() method");
		System.out.println("Original String: " + sb2);
		System.out.println(sb2.substring(0));
		System.out.println(sb2.substring(0, 4));
		System.out.println(sb2.substring(1, 3));
		// System.out.println(sb2.substring(1, 9)); // Exception in thread "main"
		// java.lang.StringIndexOutOfBoundsException: start 1, end 9, length 5
		System.out.println();

		// subSequence() method
		System.out.println("12. subSequence() method");
		System.out.println("Original String: " + sb2);
		System.out.println(sb2.subSequence(0, 4));
		System.out.println(sb2.subSequence(1, 3));
		// System.out.println(sb2.subSequence(1, 9)); // Exception in thread "main"
		// java.lang.StringIndexOutOfBoundsException: start 1, end 9, length 5
		System.out.println();

		// codePointAt() method
		System.out.println("13. codePointAt() method");
		System.out.println("Original String: " + sb2);
		System.out.println(sb2.codePointAt(0));
		System.out.println(sb2.codePointAt(2));
		// System.out.println(sb2.codePointAt(5)); Exception in thread "main"
		// java.lang.StringIndexOutOfBoundsException: index 5, length 5
		System.out.println();

		// reverse() method
		System.out.println("14. reverse() method");
		System.out.println("Original String: " + sb2);
		sb2.reverse();
		System.out.println("After Reversed: " + sb2);
		System.out.println();

		// replace() method
		System.out.println("15. replace() method");
		System.out.println("Original String: " + sb2);
		sb2.replace(0, 5, "Hello");
		System.out.println("After Replaced: " + sb2);
		sb2.replace(0, 2, "xyz");
		System.out.println("After Replaced: " + sb2);
		System.out.println();

		// toString() method
		System.out.println("16. toString() method");
		System.out.println(sb2.toString());
		System.out.println(sb3.toString());
		System.out.println();

		StringBuilder sb = new StringBuilder();

		// append method
		System.out.println("17. append() method");
		String s = "Welcome Everyone";
		sb.append("Hell");
		System.out.println(sb);
		sb.append('o');
		System.out.println(sb);
		sb.append(true);
		System.out.println(sb);
		sb.append(s, 0, 7);
		System.out.println(sb);
		System.out.println();

		// delete() method
		System.out.println("18. delete() method");
		System.out.println(sb.delete(11, sb.length()));
		System.out.println();

		// deleteCharAt() method
		System.out.println("19. deleteCharAt() method");
		System.out.println(sb.deleteCharAt(sb.length() - 1));
		System.out.println(sb.deleteCharAt(sb.length() - 1));
		System.out.println();

		// setCharAt() method
		System.out.println("20. setCharAt() method");
		sb.setCharAt(sb.length() - 1, 'H');
		System.out.println(sb);
		sb.setCharAt(6, 'I');
		System.out.println(sb);
		System.out.println();

		// insert() method
		System.out.println("21. insert() method");
		System.out.println(sb);
		sb.insert(2, "xyz");
		System.out.println(sb);
		sb.insert(9, 10.6);
		System.out.println(sb);
		System.out.println();

		// 22. setLength() method
		System.out.println("22. setLength() method");
		System.out.println("Initial Length = " + sb.length());
		System.out.println("Original String = " + sb);
		sb.setLength(30);
		System.out.println("After Operation Length = " + sb.length());
		System.out.println("After Operation String = " + sb);
	}
}
