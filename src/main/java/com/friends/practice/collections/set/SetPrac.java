package com.friends.practice.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetPrac {

	public static void main(String[] args) {
		// no order in set 
		Set<Integer> ranks = new HashSet<Integer>();
		ranks.add(8);
		ranks.add(2);
		ranks.add(7);
		ranks.add(6);
		ranks.add(4);
		ranks.add(7);
		
		System.out.println(ranks);
		// store multiple elements -- >array's
		// why to go collections  -- > dynamic size and more features
		
		Set<String> countries = new HashSet<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("UK");
		countries.add("Australia");
		countries.add("India");
		
		System.out.println(countries);
		
	}

}
