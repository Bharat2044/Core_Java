package com.oops._02_variables;

public class StaticVariables {
	// Instance Variables 
	String name;
	long phNum;
	
	// Static Variables
	static String institute;

	public static void main(String[] args) {

		StaticVariables.institute = "RGPV";

		StaticVariables bharat = new StaticVariables();
		bharat.name = "Bharat";
		
//		System.out.println(bharat.name + "  " + bharat.institute);
		System.out.println(bharat.name + "  " + StaticVariables.institute);

		StaticVariables goutham = new StaticVariables();
		goutham.name = "Goutham";
		
//		System.out.println(goutham.name + "  " + goutham.institute);
		System.out.println(goutham.name + "  " + StaticVariables.institute);
	}
}