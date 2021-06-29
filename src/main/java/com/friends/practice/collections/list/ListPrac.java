package com.friends.practice.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListPrac {

	private static void basicListPrac(List<String> countries) {
		for (String c : countries) {
			System.out.println(c);
		}

		for (int i = 0; i < countries.size(); i++) {
			System.out.println(countries.get(i));
		}

		Collections.sort(countries);

		System.out.println(countries);

		countries.remove("UK");

		System.out.println(countries);

	}

	public static void main(String[] args) {
		int ranks[] = new int[] { 1, 2, 3, 4, 5 }; // random access
		System.out.println(ranks.length);

		// [1,24,5,67,8,9]
		
		System.out.println(ranks);
		System.out.println(ranks[2]);
		//System.out.println(ranks[243543436]); // random access
		List<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("UK");
		countries.add("Australia");
		countries.add("India");

		//System.out.println(ranks[353563364]); // 1 sec // random access

		//System.out.println(countries.get(1254235334)); // 1 sec
		// basicListPrac(countries);

		List<String> linkList = new LinkedList<String>();
		linkList.add("G.Father");
		linkList.add("G.Mother");
		
		linkList.add("Father");
		linkList.add("Mother");
		
		
		System.out.println(linkList);
		linkList.add("G.Mother");

		// son // your // singlings // childer ; // no randome access
		// [D1,A2]---->[D2,A3]---->[D3,A4]---> -- > [D2424242324,A2423525]

		System.out.println(linkList);

		//System.out.println(linkList.get(1254235334)); // 10sec

		// if ur frequent operation search --- arraylist  90 % 
		// if ur oper add/remove -- linklist  --- very big operations add/remove 10 %
		
		//order will be preserved for very list
		
		System.out.println(countries);
		
	}

}
