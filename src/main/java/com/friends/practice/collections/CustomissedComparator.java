/**
 * 
 */
package com.friends.practice.collections;

import java.util.Comparator;

import com.friends.practice.generics.Employee;

/**
 * @author Venkatesh_Urlana
 *
 */
public class CustomissedComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEid().compareTo(o2.getEid());
	}
}
