package com.ca.mahima.string;

/**
 * Given two strings a and b. The task is to find if the string 'b' can be
 * obtained by rotating another string 'a' by exactly 2 places.
 * 
 * ex-1 Input: a = amazon b = azonam Output: 1 Explanation: amazon can be
 * rotated anti clockwise by two places, which will make it as azonam.
 * 
 * ex-2 Input: a = geeksforgeeks b = geeksgeeksfor Output: 0 Explanation: If we
 * rotate geeksforgeeks by two place in any direction , we won't get
 * geeksgeeksfor.
 * 
 *
 */
public class RotatedBy2Places {
	public static void main(String[] args) {
		String a = "geeksforgeeks";
		String b = "geeksgeeksfor";
		int d = 2; // no. of places to rotate.

		String rotatedString = leftRotateBy2Place(a, d);

		if (rotatedString.equals(b))
			System.out.println("Yes");
		else
			System.out.println("No");

		String rightRotated = rightRotateBy2Places(a, 2);
		System.out.println(rightRotated);
	}

	private static String leftRotateBy2Place(String a, int d) {
		return a.substring(d) + a.substring(0, d);
	}

	// logic of right rotation---

	private static String rightRotateBy2Places(String a, int d) {
		return leftRotateBy2Place(a, a.length() - d);
	}
}
