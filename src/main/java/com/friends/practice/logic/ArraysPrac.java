package com.friends.practice.logic;

public class ArraysPrac {

	int studentsIds[];
	
	final String countryName = "India";
	
	public static void main(String[] args) {
		
		ArraysPrac a = new ArraysPrac();

		//a.studentsIds.length = 23;
		
		
		System.out.println(a.countryName);
		
		System.out.println(a.studentsIds);
		
		int javaArr[] = new int[5];
		
		int anoArr[] = new int[] {1,-1,0,4,56,23};
		
		System.out.println("Anno len : "+anoArr.length);
		
		String strArr[] = new String[6];
		
		Employee empArr[] = new Employee[5]; 
		
		//  [null,null,null,null,null]
		
		// [1,2,3,4,5] index starts with 0
		
		for(int i=0;i<empArr.length;i++) {
			Employee temp = empArr[i];
			System.out.println(temp);
		}
		
//		for(int i : javaArr) {
//			System.out.println(i);
//		}
	
		Employee e = new Employee();
		
		e.sal = 33f;
		e.name = "ven";
		
		
		int ac = 10;
		
		ac = e.eid + 10;
	}

}

final class Employee{
	final int eid = 23;
	String name;
	float sal;
	
	String getEmpBioData() {
		return name;
	}
}





