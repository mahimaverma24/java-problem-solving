package com.ca.mahima.problem.solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * There are 2 instances of 'ab, 1 of 'abc' and 0 of 'bc'. For each query, add
 * an element to the return array, results = [2,1,0] .
 * 
 * @author mverma
 *
 */
public class SparseArrays {

	public static void main(String[] args) {

		List<String> strings = new ArrayList<String>();
		strings.add("ab");
		strings.add("ab");
		strings.add("abc");

		List<String> queries = new ArrayList<String>();
		queries.add("ab");
		queries.add("abc");
		queries.add("bc");

		List<Integer> results = getCountArray(strings, queries);
		System.out.println(results);
	}

	private static List<Integer> getCountArray(List<String> strings, List<String> queries) {
		List<Integer> results = new ArrayList<Integer>();

		for (int i = 0; i < queries.size(); i++) {
			int count = 0;
			for (int j = 0; j < strings.size(); j++) {

				if (queries.get(i).equals(strings.get(j)))
					count++;
			}
			results.add(count);
		}

		return results;
	}

	/**In case of array
	 * @param strings
	 * @param queries
	 * @return
	 */
	static int[] matchingStrings(String[] strings, String[] queries) {
		List<String> changedString = Arrays.asList(strings);
		List<String> changedQuery = Arrays.asList(queries);

		List<Integer> results = new ArrayList<Integer>();

		for (int i = 0; i < changedQuery.size(); i++) {
			int count = 0;
			for (int j = 0; j < changedString.size(); j++) {

				if (changedQuery.get(i).equals(changedString.get(j)))
					count++;
			}
			results.add(count);
		}
		
		int [] ints = results.stream().mapToInt(Integer::intValue).toArray();
		return ints;
 
	}

}
