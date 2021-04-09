package com.ca.mahima.multithreading;

public class ReentrantLock {
	public static void main(String[] args) {

		System.out.println("Example how rentrant lock works-----");
		task();
	}

	private static void task() {
	//	reentrantlock.lock();
		try {
			// Do some work
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		//	reentrantlock.unlock();
		}

	}
}
