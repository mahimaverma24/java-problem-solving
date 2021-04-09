package com.ca.mahima.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MapPractice {

	public static void main(String[] args) {
		Person person1 = new Person("mahima");
		Person person2 = new Person("verma");
		Person person3 = new Person("vanshu");
		Person person4 = new Person("pickachu");
		Person person5 = new Person("niti");

		Set<Person> set = new HashSet<>();
		set.add(person1);
		set.add(person2);
		set.add(person3);
		set.add(person4);
		set.add(person5);
		Person result = set.stream().reduce((x, y) -> y).orElse(null);
		System.out.println(result);
		String s1 = "test";
		String s2 = "test";
		String s3 = "test";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

		
		
		try {
			List<String> techs = new ArrayList<>();
			techs.add("java");
			techs.add("angular");
			techs.add("python");
			List<String> unmodifiedList = Collections.unmodifiableList(techs);
		//	unmodifiedList.add("new tech");
			System.out.println(techs);
			System.out.println(unmodifiedList);
		} catch (UnsupportedOperationException e) {
			System.out.println("You are trying to update unmodified list!!!");
		}

	}

}
