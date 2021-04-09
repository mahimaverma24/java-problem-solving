package com.ca.mahima.string;

/**
 * Input: S = i.like.this.program.very.much Output:
 * much.very.program.this.like.i
 */
public class ReverseWordsInString {
	public static void main(String[] args) {
		// String s = "i.like.this.program.very.much";
//		String[] str = s.split("\\.");
//		StringBuffer reverseStr = new StringBuffer();
//		for (int i = str.length - 1; i > 0; i--) {
//			reverseStr = reverseStr.append(str[i]);
//		}
//		System.out.println(reverseStr);

		String[] s = "i like this program very much".split(" ");
		String ans = "";
		for (int i = s.length - 1; i >= 0; i--) {
			ans += s[i] + " ";
		}
		System.out.println("Reversed String:");
		System.out.println(ans.substring(0, ans.length() - 1));
	}
}
