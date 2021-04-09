package com.ca.mahima.java.operator;

public class EqualsDifference {

	public static void main(String[] args) {
		Client a = new Client("", 2);
		Client b = a;
//		int a=9;
//		int b=a;
//		System.out.println(a==b);
//		System.out.println(a.equals(b));

		int x = 4, y = 3;
		// System.out.println(x*y/2);

		String s = "ABC";
		String s1 = "ABCD";
		String s2 = s + "D";

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println(null == null);
		// System.out.println(null.equals(null));

	}
}
