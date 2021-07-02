package com.friends.practice.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.friends.practice.generics.Employee;

public class SortCollections {

	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1001, "Venkatesh");
		Employee e2 = new Employee(1002, "Mangal");
		Employee e3 = new Employee(1003, "Mannu");
		Employee e4 = new Employee(1001, "Venkatesh");
		Employee e5 = new Employee(1006, "Abhishek");
		
		List<Employee> employees = new ArrayList<Employee>(Arrays.asList(e1,e2,e3,e4));
		
//		for(Employee e : employees) {
//			System.out.println(e.getEid()+"..."+e.getName());
//		}
		
		System.out.println(employees);
		
		 //  Map<Integer, Customer> customerMap =  new obj;
		
		Set<Employee> employeeSet = new HashSet<Employee>();
		
		employeeSet.add(e1);
		employeeSet.add(e2);
		employeeSet.add(e3);
		employeeSet.add(e4);
		employeeSet.add(e5);
		//System.out.println(employeeSet);
		
		Map<Employee, Integer> empMap = new HashMap<Employee, Integer>();
		
		empMap.put(e1, 1);
		empMap.put(e2, 2);
		empMap.put(e3, 3);
		empMap.put(e4, 5);
		empMap.put(e1, 4);
		
		//System.out.println(empMap);
		
		Set<Integer> intTree = new TreeSet<Integer>();
		intTree.add(4);
		intTree.add(6);
		intTree.add(1);
		intTree.add(0);
		intTree.add(100);
		intTree.add(1);
		
		System.out.println(intTree);
		
		Comparator<Employee> empComp = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getEid().compareTo(o2.getEid());
			}
		};
		
		Set<Employee> treeSet = new TreeSet<Employee>(empComp);
		treeSet.add(e3);
		treeSet.add(e1);
		treeSet.add(e2);
		
		treeSet.add(e4);
		treeSet.add(e5);
		
		System.out.println(treeSet);
		
		//Comparator 
		
	}

}
