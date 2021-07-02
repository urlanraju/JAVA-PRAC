package com.friends.practice.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericPrac<T> {

	public T getObj(T cls) throws Exception {
		
		return (T) cls.getClass().newInstance();
	}
	
	public static void main(String[] args) throws Exception {
		
		GenericPrac<Employee> ge = new GenericPrac<Employee>();
		
		ge.getObj(null);
		
		GenericPrac<Student> gs = new GenericPrac<Student>();
		
		// gs.get
		
		GenericPrac<Integer> gi = new GenericPrac<Integer>();
	
		GenericPrac gp = new GenericPrac();
		
		
		Object o1 = new Employee(100, "Venkatesh");
		Object o2 = new Student(100, "Venkatesh", "Urlana", "urlanraju@gmail.com");
		
		
		
		Employee e1 = (Employee) o1;
		
		Student s1 = (Student) o2;
		
		List<Employee> l = new ArrayList<Employee>();
		
		l.get(2);
		
	}

}
