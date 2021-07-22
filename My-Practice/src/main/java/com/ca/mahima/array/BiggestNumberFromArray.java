package com.ca.mahima.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BiggestNumberFromArray {
    public static void main(String[] args) {
        int[] arr = {54, 546, 548, 60};

        System.out.println("The biggest number formed from the given array is " + biggestNumber(arr));
    }

    private static String biggestNumber(int[] arr) {
        if (arr.length == 0)
            return "";
        String[] sa = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            sa[i] = Integer.toString(arr[i]);
        }

        Arrays.sort(sa, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String a = o1 + o2;
                String b = o2 + o1;
                return b.compareTo(a);
            }
        });
        if (sa[0].equals("0"))
            return "0";

        StringBuilder sb = new StringBuilder();
        for (String s : sa) {
            sb.append(s);
        }
        return sb.toString();
    }

}
