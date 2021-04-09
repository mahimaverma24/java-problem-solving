package com.ca.mahima.java8.concepts;

@FunctionalInterface
public interface CustomInterface {

	void getMethod();
	
	default void checkIfNeedToOverride() {
		System.out.println("No need to override this into child class");
	}
}
