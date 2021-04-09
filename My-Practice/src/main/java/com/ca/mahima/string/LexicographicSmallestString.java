package com.ca.mahima.string;

public class LexicographicSmallestString {
	static String smallest(String s) {
		int l = s.length();
		String ans = "";

		// iterate the String
		for (int i = 0; i < l - 1; i++) {

			// first point where s[i]>s[i+1]
			if (s.charAt(i) > s.charAt(i + 1)) {

				// append the String without
				// i-th character in it
				for (int j = 0; j < l; j++) {
					if (i != j) {
						ans += s.charAt(j);
					}
				}
				return ans;
			}
		}

		// leave the last character
		ans = s.substring(0, l - 1);
		return ans;
	}

	// Driver Code
	public static void main(String[] args) {

		String s = "abcda";
		System.out.println(smallest(s));
	}
}
