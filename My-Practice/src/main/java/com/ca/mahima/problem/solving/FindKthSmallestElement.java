package com.ca.mahima.problem.solving;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindKthSmallestElement {
	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 0, 1, 0, 1, 0, 0, 0, 1, 0 };
		int k = 3;
		// here k=3 and we do not have 3rd smallest element print NULL
		// 1st smallest ele-> 0
		// 2nd smallest ele->1
		// 3rd smallest ele-> NULL
		System.out.println(getKthSmallest(Arrays.asList(arr), k));
	}

	private static Integer getKthSmallest(List<Integer> list, int k) {

		Collections.sort(list);
		Set<Integer> set = new HashSet<>();

		for (Integer item : list) {
            set.add(item);
		}
		List<Integer> result = set.parallelStream().collect(Collectors.toList());

		try {
			return result.get(k-1);

		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}
}
