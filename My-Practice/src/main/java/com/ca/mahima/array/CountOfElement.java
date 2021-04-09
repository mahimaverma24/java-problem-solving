package com.ca.mahima.array;

import java.util.HashMap;
import java.util.Map;

public class CountOfElement {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 2, 4, 2, 1, 5, 6, 7, 8, 8 };
		Map<Integer, Integer> mymap = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			mymap.put(arr[i], mymap.getOrDefault(arr[i], 0) + 1);
		}
		
		System.out.println(mymap);
		
	}
}
