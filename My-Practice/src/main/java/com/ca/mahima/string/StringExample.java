package com.ca.mahima.string;

import java.util.Queue;

public class StringExample {

    public static void main(String[] args) {
        String s = new String("ABC");
        String s1 = "ABC";
        String s2 = "ABC";

        System.out.println( s1.equals(s2));
        System.out.println( s1 == s2);

        s = s.intern();
        System.out.println( s1 == s);
        System.out.println( s1.equals(s) );
    }


}
