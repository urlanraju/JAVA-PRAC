package com.friends.practice.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionPrac{

	
	
	public void objectMethods() {
		
	}
	
	public static void main(String[] args) {
		//
		String friends [] = new String[] {"Venkatesh","mangal","ManMohan","Vikas"};
		
		//System.out.println(friends);
		
		int fdob[] = new int[4];
		
		
		//fdob[5] = 1994;
		
		// for () // scann // year's 
		String singlName = "Urlana";
		System.out.println(friends.length);
		
		// java  -- lang   -- collections  
		// php  -- codignater   ---  special features
		
		List<String> fns= new ArrayList<String>();
		
		fns.add("V");
		fns.add("MM");
		fns.add("Vks");
		fns.add("MSS");

		fns.add("moon");
		
		fns.add("Jupiter");
		
		System.out.println(fns);
		
		System.out.println(fns.contains("V"));
		
		System.out.println(fns.get(2));
		
		fns.remove("moon");
		
		System.out.println(fns);
		
		// Generic' s 
		
		
		
	}

}
