package com.friends.practice.inheritance;

public class Child  extends Parent{
	
	public static void main(String[] args) {
		Child c = new Child();
		
		c.getTotalMembers();
		System.out.println(c.surname);
		
		System.out.println(c.getTotalIncome());
	}
}
