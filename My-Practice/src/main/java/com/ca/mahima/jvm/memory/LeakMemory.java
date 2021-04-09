package com.ca.mahima.jvm.memory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeakMemory {
    private static final List<String> LEAK = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        System.out.println("What is your name? ");
        while (in.hasNext()) {
            name = in.next();
            System.out.println("Hi " + name);
            LEAK.add(name);
        }
    }
}