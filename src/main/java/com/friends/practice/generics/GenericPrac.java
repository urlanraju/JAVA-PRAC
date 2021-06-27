package com.friends.practice.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		Object o2 = new Student(101, "Mahesh");
		
		
		
		Employee e1 = (Employee) o1;
		
		Student s1 = (Student) o2;
		
		List<Employee> l = new ArrayList<Employee>();
		
		l.get(2);
		
	}

}

class Employee{
	int eid;
	String name;
	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// sht + alt + s
	
}

class Student{
	int sid;
	String name;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	
	
}
