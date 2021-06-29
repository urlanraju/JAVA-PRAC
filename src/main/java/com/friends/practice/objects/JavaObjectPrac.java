package com.friends.practice.objects;

import com.friends.practice.generics.Student;

public class JavaObjectPrac {
		
	private String name;
	
	private Integer id;
	
	
	//shfit + alt + s
	public static void main(String[] args) {
		JavaObjectPrac jop = new JavaObjectPrac("Venkatesh", 1745);
		jop.toString();
		System.out.println(jop);
		
		// hashCode() and equals
		
		Student s1 = new Student(100, "Mahes", "kla", "urlanraju@gmail.com");
		
		Student s2 = new Student(100, "Venkatesh", "Urlana", "urlanraju@gmail.com");
		
		String n1 = new String("madam");
		String n2 = new String("madam");
		
		System.out.println("object code "+s1.hashCode());
		
		
		if(s1.equals(s2)) {
			
			System.out.println("Both are equal");
		}else {
			System.out.println("Both are not equal");
		}
		
		
		
		
	}


	public JavaObjectPrac(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return "Java OP name : "+name +" | id : "+id;
	}
	
	

}
