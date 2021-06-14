package com.friends.practice;

import com.friends.practice.inheritance.Parent;

public class NarayanaStudent {
	
	static String collegeName = "Narayana";
	
	int id;
	String name;
	int pincode;
	
	NarayanaStudent(int id,String name,int pincode) {
		this.id = id;
		this.name = name;
		this.pincode = pincode;
	}
	
	public static void main(String[] args) {
		NarayanaStudent s1 = new NarayanaStudent(100, "Venkatesh", 500072);  // Constructor is a special method -- same name as class name
	
		
		NarayanaStudent s2 = new NarayanaStudent(101, "Kamesh", 500072);
	
		
		System.out.println(s1.id+"..."+s1.name+"..."+s1.pincode+"..."+NarayanaStudent.collegeName);
		System.out.println(s2.id+"..."+s2.name+"..."+s2.pincode+"..."+NarayanaStudent.collegeName);
		
		int ages1[] = new int [5];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		
		
	}
}
