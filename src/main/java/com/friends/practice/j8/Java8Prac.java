package com.friends.practice.j8;

public class Java8Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface J8i {
	Long register();
	
	static String imJ8Static() {
		return "imJ8Static";
	}
	
	default int imJ8Default() {
		return 1000;
	}
}
