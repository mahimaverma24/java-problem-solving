package com.ca.mahima.stack.queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * should get last three unique numbers from list. this list can be dynamic
 * stream of numbers. depending on question we can modify solution. Input:- 2,
 * 3, 5, 6, 7, 1, 4, 4, 5, 5 Output:- 5,4,1
 * 
 * @author mverma
 *
 */
public class LastThreeUniqueNumberFromStream {
	public static void main(String[] args) {
		Integer[] arr = { 2, 3, 5, 6, 7, 1, 4, 4, 5, 5 };
		List<Integer> list = Arrays.asList(arr);
		int k = 3;
		getThreeNumbers(list, k);
	}

	private static void getThreeNumbers(List<Integer> list, int k) {
		Deque<Integer> queue = new LinkedList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		for (Integer i = 0; i < list.size(); i++) {
			if (!set.contains(list.get(i))) {
				if (queue.size() == k) {
					Integer last = queue.removeLast();
					set.remove(last);
				}
			} else {
				queue.remove(list.get(i));
			}
			queue.push(list.get(i));
			set.add(list.get(i));
		}
		System.out.println(queue);
	}
}
