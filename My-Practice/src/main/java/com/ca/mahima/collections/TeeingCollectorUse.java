package com.ca.mahima.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TeeingCollectorUse {
	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(new Employee(1, "A", 100, null, null), new Employee(2, "B", 200, null, null),
				new Employee(3, "C", 300, null, null), new Employee(4, "D", 400, null, null));

		HashMap<String, Employee> result = employeeList.stream()
				.collect(Collectors.teeing(Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
						Collectors.minBy(Comparator.comparing(Employee::getSalary)), (e1, e2) -> {
							HashMap<String, Employee> map = new HashMap();
							map.put("MAX", e1.get());
							map.put("MIN", e2.get());
							return map;
						}));
//		System.out.println(result);
		String[] arr = { "abc", "1", "8", "0" };

		List<String> names = Arrays.asList(arr);
		
		Collections.sort(names);
		
		System.out.println(names);

	}
}
