package com.ca.mahima.java8.concepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * There are 3 functional interfaces introduced in java 8. That are- Predicate
 * which has test method return boolean, Binary Operator interface which has
 * apply method returns same type passed in argument, Function interface which
 * has apply method return other type R
 * https://www.geeksforgeeks.org/functional-interfaces-java/
 * 
 * @author mverma
 *
 */
public class InterfaceImplemtation implements CustomInterface, InterfaceTwo {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "Geek2");

		// declare the predicate type as string and use
		// lambda expression to create object
		Predicate<String> p = (s) -> s.startsWith("G");

		// Iterate through the list
		for (String st : names) {
			// call the test method
			if (p.test(st))
				System.out.println(st);
		}

		names.forEach(x -> {
			System.out.println(x);
		});
		
	}

	@Override
	public void check() {
		System.out.println("hello from child class; check() method");
	}

	@Override
	public void getMethod() {
		System.out.println("hello from child class; getMethod() method");

	}
}
