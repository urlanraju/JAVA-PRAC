package com.friends.practice.inheritance;

public class Child  extends Parent{
	
	public String getTotalIncome() {
		String pi = super.getTotalIncome();
		
		return " child income.";
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		
		String parentIncome = c.getTotalIncome();
		
		System.out.println(parentIncome);
		

	}
}
