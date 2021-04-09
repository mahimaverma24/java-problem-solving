package com.ca.mahima.string;

public class LexicographicMaximumSubString {

	public static void main(String[] args) {
		String str = "ababaa";
		String mx = "";
		String min = "";
		getMaxSubstring(str, mx);
		getMixSubstring(str, min);
	}

	private static void getMixSubstring(String str, String min) {
		for (int i = 0; i < str.length(); i++) {

			if (min.compareTo(str.substring(i)) >= 0) {
				min = str.substring(i);
			}
		}
		System.out.println(min);
	}

	private static void getMaxSubstring(String str, String mx) {
		for (int i = 0; i < str.length(); i++) {

			if (mx.compareTo(str.substring(i)) <= 0) {
				mx = str.substring(i);
			}
		}
		System.out.println(mx);
	}

}
