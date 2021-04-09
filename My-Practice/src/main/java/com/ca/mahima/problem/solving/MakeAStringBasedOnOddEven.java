package com.ca.mahima.problem.solving;

/**
 * if input -> 21462753 output-> 214*6*27-5-3
 * 
 * even and even = n*n; odd and odd = odd-odd; (even and odd) or (odd-even) do
 * nothing
 *
 */
public class MakeAStringBasedOnOddEven {

	public static void main(String[] args) {

		String str = "21462753";
		System.out.println(getOutput(str));
	}

	static boolean checkOdd(char ch) {
		// this looks up the integer value in the table of '0' which is then the 'base
		// value' subtracting your number in char format from this will give you the
		// original number.
		return ((ch - '0') & 1) != 0;
	}

	static String getOutput(String str) {
		StringBuffer sb = new StringBuffer(str);
		for (int i = 0; i < str.length() - 1; i++) {

			if (checkOdd(str.charAt(i)) && checkOdd(str.charAt(i + 1))) {
				sb.insert(i + 1, "-");
				str = sb.toString();
				i++;
			}

			if (!checkOdd(str.charAt(i)) && !checkOdd(str.charAt(i + 1))) {
				sb.insert(i + 1, "*");
				str = sb.toString();
				i++;
			}
		}

		return sb.toString();

	}

}
