package com.friends.practice.charp;

public class CharPrac {

	public static void main(String[] args) {
		char c = 'G';
		
		System.out.println((int)c);
		
		int a = 65;
		
		char ca = (char) a;
		
		System.out.println(ca);
		
		String name = "venkatesh!";
		
		char nthp = name.charAt(name.length()-1);
				
		System.out.println(nthp);
	}

}
