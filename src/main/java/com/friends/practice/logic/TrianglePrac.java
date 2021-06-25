package com.friends.practice.logic;

public class TrianglePrac {

	public int getYearOfBirth() {
		return 1994;
	}

	// ctrl + / for commenting
	// ctrl + shift + f neat clean code.
	public static void main(String[] args) {

		// space and * symbol

		int tSize = 10;

		for (int i = 0; i < tSize; i++) {

			for (int j = (tSize - i); j > 1; j--) // i 0 j 5
			{
				// space between console wall and star
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				// prints star

				System.out.print("* ");

			}

			System.out.println();
		}

	}

}
