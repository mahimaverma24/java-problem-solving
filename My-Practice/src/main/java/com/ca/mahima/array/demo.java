package com.ca.mahima.array;

import com.ca.mahima.collections.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {


        Employee emp = new Employee();
        emp.setId(11);
        emp.setName("mahima");

        Employee emp2 = new Employee();
        emp2.setId(15);
        emp2.setName("niti");

        Employee emp3 = new Employee();
        emp3.setId(20);
        emp3.setName("vansh");

        Employee emp4 = new Employee();
        emp4.setId(9);
        emp4.setName("lokesh");


        List<Employee> employees = new ArrayList<>();
        employees.add(emp);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        List<String> names = employees.stream().filter(x -> x.getId() > 10).map(x -> x.getName()).collect(Collectors.toList());
        System.out.println(names);
    }
}
