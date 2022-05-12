package com.friends.practice;

import com.friends.practice.ec.EnumConstants;

public class App 
{
	// my age field
	static int age = 12;
	static String name = "Venkatesh.";
	int dob = 1994;
	
	final static int DOB = 1994; 
	
	final static String USA = "USA";
	
	final static String DOLLAR_SYMBOL = "$";
	
	public static void main(String[] args) {
		App app = new App();
		
		System.out.println(app.dob);
		

		System.out.println(App.DOLLAR_SYMBOL);
		
		System.out.println(EnumConstants.JAN);
		
	}
	
	void m1() {
		//System.out.println(dob);
		System.out.println(age);
	}
	
	static void m2() {
		//System.out.println(dob);
		System.out.println(age);
	}
}
