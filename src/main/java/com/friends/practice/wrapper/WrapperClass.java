/**
 * 
 */
package com.friends.practice.wrapper;

/**
 * @author Venkatesh_Urlana
 *
 */
public class WrapperClass {
	
	public static Float getInterestAmt(Integer principal,Integer time,Float roi) {
		
		
		return principal * time * roi /100;
	}

	
	static int roi;
	
	static boolean voice; 
	
	static Boolean wvoice;
	static Integer ROI;
	
	static void wrapperPrac() {
		int age = 26;
		float f = 95.2f;
		
		String name = "Venkatesh";
		
		System.out.println(name.endsWith("shd"));
		
		Integer i = new Integer(2);
		
		System.out.println(i);
		
		Float voltage = new Float(12.4f);
		
		Long lon = new Long(123);
		
		
		//java.lang
		
		System.out.println(voltage);
		
		// bank gives loan
		
		//  4%  6%        0% 
		
		
		
		//  ptr/100      
		
		System.out.println(ROI);
		
		System.out.println("interest amount : "+((5000000)*(2*12)*(roi)/100));
		
		//sql  table 
		
		//  auto boxing  un-boxing
		
		int q = 123;
		
		Integer w = 23;  // methods // null
		
		Float c = 12.3f;
		
		Long l = 133l;
		
		long ee = 24324l;
		
		String o = "4645645dfgdfdd";
		
	//	System.out.println("interest amt : "+getInterestAmt(1000, 1, null));
		
		boolean tf = false;
		
		Boolean wtf = Boolean.parseBoolean("true");
		
		
		System.out.println("wtf : "+wtf);
		
		System.out.println(voice);
		
		System.out.println(wvoice);
		
		
	}
	
	public static void main(String[] args) {
		// wrapperPrac();
	
		Integer i = Integer.parseInt("12");

		System.out.println(i);
		
		Float f = Float.parseFloat("12.3");
		System.out.println(f);
	
		System.out.println("12"+"20");
		
		Integer addStr = Integer.parseInt("12")  + Integer.parseInt("20");
		
		System.out.println(addStr);
		
	}
	
	
	public Integer getInt() {
		
		return 123;
	}
}
