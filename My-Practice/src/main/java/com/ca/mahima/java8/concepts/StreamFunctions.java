package com.ca.mahima.java8.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctions {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(77);
		list.add(56);
		list.add(1);
		list.add(89);
		list.add(41);
		list.add(24);

		// Collections.sort(list);

		// find out the list of even numbers from stream

		List<Integer> evenList = list.stream().filter(even -> even % 2 == 0).collect(Collectors.toList());
		list.stream().filter(even -> even % 2 != 0).forEach(System.out::print);

		System.out.println(evenList);

		// find out the list of even numbers from stream
		List<Integer> oddList = list.stream().filter(even -> even % 2 != 0).collect(Collectors.toList());
		System.out.println(oddList);

		Stream<Integer> numStream = Stream.of(1, 3, 5, 4, 2);

		numStream.sorted(Comparator.reverseOrder()).forEach(System.out::println);

		System.out.println(list.stream().findFirst());
		System.out.println(list.stream().findAny());
		System.out.println(list.stream().anyMatch(a -> a == 1));// anyMatch() is terminal operator while filter is
																// intermediate
																// operator

		List<Integer> ages = Arrays.asList(2, 1, 3, 4);
		int computedAges = ages.parallelStream().reduce(0, (a, b) -> a + b, Integer::sum);
		System.out.println("" + computedAges);

		// list = Collections.unmodifiableList(list);
		// callMethod(list);

		// of nullable will handle null pointer exception while optiona.of() will throw
		Optional<String> checkNull = Optional.ofNullable(null);
		System.out.println(checkNull);
	}

	static void callMethod(List<Integer> list) {
		list.add(17);// due to this exception will be raised called -> UnmodifiableCollection

		List<Integer> newlist = list;
		System.out.println(newlist);
	}
}
