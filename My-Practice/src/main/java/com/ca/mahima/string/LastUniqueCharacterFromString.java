package com.ca.mahima.string;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * unique character means which has occurrence one in string and should be the
 * last one. In: mahimavim Out: v (here occurrence of v, h is one but last one
 * is v so print v) In: mahimaih Out: NONE
 *
 */
public class LastUniqueCharacterFromString {

	public static void main(String[] args) {
		String s = "mahimavim";
		//String s = "mahimaih";
		char[] arr = s.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		String lastChar = "NONE";

		for (Map.Entry<Character, Integer> ent : map.entrySet()) {
			if (ent.getValue() == 1) {
				lastChar = ent.getKey().toString();
			}
		}

		System.out.println(lastChar);
	}

}
