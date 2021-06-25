package com.friends.practice.inheritance;

import com.sun.org.apache.xpath.internal.operations.String;

public class MethodOverloading {

	int addition(int a,int b) {
		return a + b;
	}
	
	float addition(float a,float b,float c) {
		return (a + b + c);
	}
	
	int addition(int a,int b,int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		
		System.out.println(mo.addition(2, 3));
		
		System.out.println(mo.addition(4, 3, 5));
		
		System.out.println(mo.addition(1.2f, 2.3f, 3.2f));
		
	}

}
