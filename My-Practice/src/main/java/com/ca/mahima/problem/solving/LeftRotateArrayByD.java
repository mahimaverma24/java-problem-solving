package com.ca.mahima.problem.solving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeftRotateArrayByD {

	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);

		int d = 2;
		leftRotate(arr, d);
		printArray(arr, arr.size());
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "string1");
		map.put(2, "str2");
		map.put(3,"three");
		
		System.out.println(map.containsValue("three"));
		
	}

	static void leftRotate(List<Integer> arr, int d) {
		for (int i = 0; i < d; i++)
			leftRotateArrayByOne(arr);
	}

	private static void leftRotateArrayByOne(List<Integer> arr) {

		int temp = arr.get(0);
		int n = arr.size() - 1;
		int i;
		for (i = 0; i < n - 1; i++) {
			arr.set(i, arr.get(i+1));
		}
		arr.set(i, temp);

	}

	static void printArray(List<Integer> arr, int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr.get(i) + " ");
	}
}
