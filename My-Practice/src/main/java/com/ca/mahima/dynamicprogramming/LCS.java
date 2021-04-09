package com.ca.mahima.dynamicprogramming;

/**Time Complexity of the below implementation is O(mn)
 * @author mverma
 *
 */
public class LCS {
	public static void main(String[] args) {
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";

		char[] x = s1.toCharArray();
		char[] y = s2.toCharArray();
		int m = x.length;
		int n = y.length;

		int len = findLengthOfLcs(x, y, m, n);
		System.out.println("Length of LCS is : " + len);
	}

	private static int findLengthOfLcs(char[] x, char[] y, int m, int n) {

		if (m == 0 || n == 0)
			return 0;
		if (x[m-1] == y[n-1])
			return 1 + findLengthOfLcs(x, y, m - 1, n - 1);

		return max(findLengthOfLcs(x, y, m - 1, n), findLengthOfLcs(x, y, m, n - 1));
	}

	private static int max(int a, int b) {

		return a > b ? a : b;
	}
}
