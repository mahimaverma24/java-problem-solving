package com.ca.mahima.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MedianOFStreamOfNumbers {
	public static void main(String[] args) {
		int[] numbers = { 5, 15, 10, 20, 3 };
		// get stream of number through any getter method in real time application
		for (int i = 0; i < numbers.length; i++) {
			add(numbers[i]);
		}
		System.out.println(getMedian());

	}

	private static final Queue<Integer> minHeap = new PriorityQueue<Integer>();
	private static final Queue<Integer> maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());

	static void add(int num) {

		if (minHeap.size() == maxHeap.size()) {
			maxHeap.offer(num);
			minHeap.offer(maxHeap.poll());
		} else {
			minHeap.offer(num);
			maxHeap.offer(minHeap.poll());
		}
	}

	static double getMedian() {
		int median;
		if (minHeap.size() > maxHeap.size()) {
			median = minHeap.peek();
		} else {
			median = (minHeap.peek() + maxHeap.peek()) / 2;
		}
		return median;
	}
}
