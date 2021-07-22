package com.ca.mahima.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetPractice {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();

        e1.setName("Naman");
        e1.setSalary(500);
        e2.setName("MAHIMA");
        e2.setSalary(1500);
        e3.setName("zeba");
        e3.setSalary(100);
        e4.setName("vansh");
        e4.setSalary(1000);

        List<Employee> list = new ArrayList<Employee>();

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        Collections.sort(list, Employee.customComparator);
        System.out.println(list);

        //collect list of employee names in upper case who's salary is greater than 100
		List<String> names = list.stream().filter(x-> x.getSalary() > 100).map(y-> y.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println(names);


        // treemap sorts on the basis of keys
        Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(3, "mahima");
        map.put(0, "hi");
        map.put(2, "name");
        map.put(1, "my");

        System.out.println(map);

        Set<Integer> set = new TreeSet<>();
        set.add(100);
        set.add(67);
        set.add(102);
        System.out.println(set);

        Set<String> setname = new TreeSet<>();
        setname.add("mahima");
        setname.add("naman");
        setname.add("arti");

        System.out.println(setname);

//		Stream w = Stream.of("one","two","three");
//		 w.mapToInt(String::length).reduce(0,,(l1,l2)-> l1+l2);


    }
}
