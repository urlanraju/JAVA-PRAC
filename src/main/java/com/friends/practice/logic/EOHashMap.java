package com.friends.practice.logic;

import java.util.HashMap;
import java.util.Map;

class Adress {
	int flatNo;
	String colony;
	public Adress(int flatNo, String colony) {
		super();
		this.flatNo = flatNo;
		this.colony = colony;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colony == null) ? 0 : colony.hashCode());
		result = prime * result + flatNo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Adress other = (Adress) obj;
		if (colony == null) {
			if (other.colony != null)
				return false;
		} else if (!colony.equals(other.colony))
			return false;
		if (flatNo != other.flatNo)
			return false;
		return true;
	}
	
}

public class EOHashMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> intMap = new HashMap<Integer, String>();
		
		intMap.put(1, "Venkatesh");
		intMap.put(1, "Kamesh");
		System.out.println(intMap);		

		Map<Adress, String> amap = new HashMap<Adress, String>();
		
		Adress a1 = new Adress(143, "AVB");
		Adress a2 = new Adress(143, "AVB");
		
		amap.put(a1, "Venkatesh");
		amap.put(a2, "Kamesh");
		
		System.out.println(amap);
	}
}