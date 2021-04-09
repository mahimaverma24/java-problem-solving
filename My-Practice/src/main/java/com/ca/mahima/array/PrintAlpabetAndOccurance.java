package com.ca.mahima.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ex-> aabcdddc -> a2b1c2d3
 * 
 * @author mverma
 *
 */
public class PrintAlpabetAndOccurance {
	public static void main(String[] args) {
		String s = "aabcdddc";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] arr = s.toCharArray();
		String output = "";
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		for (Map.Entry<Character, Integer> ent : map.entrySet()) {
			output = output + ent.getKey() + ent.getValue();
		}

		System.out.println(output);
	}

}
