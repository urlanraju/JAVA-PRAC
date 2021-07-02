package com.friends.practice.generics;

public class Employee implements Comparable<Employee>{
	
	Integer eid;
	String name;
	
	public Employee(Integer eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eid;
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
		Employee other = (Employee) obj;
		if (eid != other.eid)
			return false;
		return true;
	}
	
	//sorting by comparable is natural sorting or default sorting
	@Override
	public int compareTo(Employee o) {
		
		return this.name.compareTo(o.name);
	}
	
	// sht + alt + s
	
	
	
}