package com.ca.mahima.java8.concepts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SupplierPractice {
	public static void main(String[] args) {

		Supplier<Double> doubleSupplier1 = () -> Math.random();
		DoubleSupplier doubleSupplier2 = Math::random;

		// System.out.println(doubleSupplier1.get());
		// System.out.println(doubleSupplier2.getAsDouble());

		List<String> names = Arrays.asList("Smith", "Gourav", "Heather", "John", "Catania");
		Function<String, Integer> nameMappingFunction = String::length;
		List<Integer> nameLength = names.stream().map(nameMappingFunction).collect(Collectors.toList());
		System.out.println(nameLength);
		
	}
}
