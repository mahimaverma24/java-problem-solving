package com.ca.mahima.stack.queue;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * /* We can use Java inbuilt Deque as a double ended queue to store the cache
 * keys, with the descending time of reference from front to back and a set
 * container to check presence of a key. But remove a key from the Deque using
 * remove(), it takes O(N) time. This can be optimized by storing a reference
 * (iterator) to each key in a hash map.
 */

public class LruCacheImplementation {
	private final Deque<Integer> doublyQueue;
	private final HashSet<Integer> hashSet;
	private final int CACHE_SIZE;
 
	public static void main(String[] args) {

		LruCacheImplementation cache = new LruCacheImplementation(4);
		cache.refer(1);
		cache.refer(2);
		cache.refer(3);
		cache.refer(3);
		cache.refer(4);
		cache.refer(5);
		cache.refer(2);
		cache.refer(2);
		cache.refer(1);
		cache.display();
	}

	public LruCacheImplementation(int capacity) {
		this.CACHE_SIZE = capacity;
		doublyQueue = new LinkedList<Integer>();
		hashSet = new HashSet<Integer>();
	}

	public void refer(int page) {

		if (!hashSet.contains(page)) {
			if (doublyQueue.size() == CACHE_SIZE) {
				int last = doublyQueue.removeLast();
				hashSet.remove(last);
			}
		} else {
			doublyQueue.remove(page);
		}
		doublyQueue.push(page);
		hashSet.add(page);
	}

	private void display() {
		doublyQueue.forEach(System.out::println);
	}

}
