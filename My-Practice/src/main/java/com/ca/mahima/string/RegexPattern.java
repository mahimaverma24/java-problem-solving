package com.ca.mahima.string;

import java.util.regex.Pattern;

public class RegexPattern {
	public static void main(String[] args) {
		String s = "Mahi2404verma@#@h";
		String str = s.replaceAll("\\W", "");

		boolean b = Pattern.matches(".*\\d.*", str);
//		System.out.println(str);
//		System.out.println(b);

		Pattern p = Pattern.compile("^[a-zA-Z]*$");
		System.out.println("contain only alphabets" + " " + p.matcher("mahimasx").find());

		String num = "121";
		System.out.println("Contains only number in string " + Pattern.matches("[0-9]+", num));
		System.out.println("Contains only number in string " + Pattern.matches("\\d+", num));
		
		System.out.println("String is alphanumeric " + Pattern.matches("^[a-zA-Z0-9]*$", "alphabetand234there"));
	}
}
