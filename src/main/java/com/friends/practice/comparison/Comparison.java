package com.friends.practice.comparison;

public class Comparison {

	public static void main(String[] args) throws Exception {
		int age1 = 26;

		int age2 = 32;

		if (age1 != age2) {
			System.out.println("Not same age");
		} else {
			System.out.println("Same age");
		}

		String p1 = new String("venkatesh");  //gdg2523555353g
		String p2 = new String("venkatesh");  //sgsgeg53535353

		if (p1.equals(p2)) {
			System.out.println("both same");
		} else {
			System.out.println("not same");
		}
		
		Integer i1 = 32;
		Integer i2 = age2;
		
		if(i1 == i2) {
			System.out.println("Both same");
		}
		
		String q = "253535";
		
		
		//
		//  DB logic
		
		// q = db.getData(); 
		//
		
		if(q != null)
			System.out.println(q.charAt(2));
		else
			throw new Exception("Data from DB is null" + q);
		
	}
}
