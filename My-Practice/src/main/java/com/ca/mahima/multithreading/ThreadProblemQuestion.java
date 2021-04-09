package com.ca.mahima.multithreading;

public class ThreadProblemQuestion implements Runnable {
	public static void main(String[] args) {
		ThreadProblemQuestion nr = new ThreadProblemQuestion();
		Thread t = new Thread(nr);
		t.setName("Mahima");
		t.run(); //wil only run the current main thread and will be garbage collected.
		t.run();
		t.run();
		t.start();//will use the created thread and run this
		t.start();
		t.start();
	}

	@Override
	public void run() {
	      System.out.println("TestRunnable in " + Thread.currentThread().getName());

	}

}
