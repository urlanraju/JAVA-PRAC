package com.friends.practice;

public class App 
{
	// my age field
	static int age = 12;
	static String name = "Venkatesh.";
	int dob = 1994;
	
	public static void main(String[] args) {
		App app = new App();
		
		System.out.println(app.dob);
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
