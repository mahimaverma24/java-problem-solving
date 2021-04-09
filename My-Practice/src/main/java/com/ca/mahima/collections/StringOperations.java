package com.ca.mahima.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringOperations {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("mahima");
		list.add("mksxa");
		list.add("vamsh");
		list.add("dcdsc");
		list.add("re");

		List<String> filtered = list.stream().filter(x -> (x.startsWith("m") && x.endsWith("a")))
				.map(x -> x.concat(" verma")).collect(Collectors.toList());
		System.out.println(filtered);
	}
}
