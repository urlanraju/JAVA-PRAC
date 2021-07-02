package com.friends.practice.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPrac {

	public static void main(String[] args) {
		
		//List<String> parent = new ArrayList<String>();
		
	//	Set<String> sets = new HashSet<String>();
		
		//Map<String, Integer> interfaceMap = new HashMap<String, Integer>();
		
		
		// Key value pair
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Mahesh");
		map.put(4, "Suresh");

		map.put(3, "Kalpesh");
		
		map.put(11, "Eleven");
		
		map.put(11, "new Eleven");

		System.out.println(map);
		
		System.out.println("Single element : "+map.get(4));

		Map<String, Integer> marks = new HashMap<String, Integer>();

		marks.put("Rajesh", 525);
		marks.put("Raju", 456);

		marks.put("Venk", 234);

		System.out.println(marks);
		
		marks.put("Venk", 500);
		
		marks.remove("Raju");
		
		//System.out.println(marks);
		
		Set<Integer> mapKeys =  map.keySet();
		
		System.out.println(mapKeys);
		
		for(Integer key : mapKeys) {
			System.out.println(key +"..."+ map.get(key));
		}
		

	}

}
