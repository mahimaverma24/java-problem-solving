package com.ca.mahima.collections;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMaxInList extends Employee {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(21);
		list.add(24);
		list.add(34);
		list.add(20);
		list.add(10);
		int k = 10;
		OptionalInt maxElem = list.stream().mapToInt(x -> x).max();
		System.out.println(maxElem);

		//sort
		List<Integer> sortedList =  list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		System.out.print(list.stream().sorted().findFirst());

		// find max than k
		List<Integer> filteredList = list.stream().filter(a -> a > k).collect(Collectors.toList());

		System.out.println(filteredList);
		// add 1 to the filtered list
		List<Integer> incrementedList = list.stream().filter(a -> a > k).map(x -> x + 1).collect(Collectors.toList());
		System.out.println(incrementedList);

	

		Consumer<String> printConsumer = t -> System.out.println(t);
		Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
		cities.forEach(printConsumer);

		List<String> names = Arrays.asList("Smith", "Gourav", "Heather", "John", "Catania");
		Function<String, Integer> nameMappingFunction = String::length;
		List<Integer> nameLength = names.stream().map(nameMappingFunction).collect(Collectors.toList());
		System.out.println(nameLength);


	}

}
