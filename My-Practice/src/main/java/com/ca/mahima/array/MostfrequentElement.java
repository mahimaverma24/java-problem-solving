package com.ca.mahima.array;

import java.util.HashMap;
import java.util.Map;

/**
 * print most frequent element in array if two elements have same occurrence say
 * 2-2 then return -1. arr - [1,3,4,2,1,3,5,3,3] -> return 3 (4 times 3) arr -
 * [2,1,2,3,1] -> -1
 * 
 * @author mverma
 *
 */
public class MostfrequentElement {
	public static void main(String[] args) {
		// int[] arr = { 1, 3, 4, 2, 1, 4, 5, 4 , 3,7}; //case 1
		//int[] arr = { 2, 1, 2, 3, 1 };	//case 2
		int[] arr = { 2, 1, 2, 3, 1, 4, 4, 3, 4, 4 }; //case 3
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = -1;
		int key = -1;
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> ent : map.entrySet()) {

			if (ent.getValue() == count) {
				key = -1;
			}

			if (ent.getValue() > count) {
				count = ent.getValue();
				key = ent.getKey();
			}
		}

		System.out.println(key);

	}
}
