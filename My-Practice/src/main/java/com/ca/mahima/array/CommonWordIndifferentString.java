package com.ca.mahima.array;

import java.util.*;

/*
* find the common word from different statements:
•	MMT is best company
•	MMT is travel company
•	MMT is safe for women
Ans. MMT, is
* */
public class CommonWordIndifferentString {
    public static void main(String[] args) {

        String s1 = "MMT is best company";
        String s2 = "MMT is travel company";
        String s3 = "MMT is safe for women";
        String[] arr1 = s1.split("\\s");
        String[] arr2 = s2.split("\\s");
        String[] arr3 = s3.split("\\s");
        Set<String> set2 = new HashSet<>();
        Set<String> set3 = new HashSet<>();

//        for(int i=0; i< arr2.length;i++){
//            set2.add(arr2[i]);
//        }
//        for(int i=0; i< arr3.length;i++){
//            set3.add(arr3[i]);
//        }
//
//        for(int i=0; i< arr1.length ;i++){
//            if(set2.contains(arr1[i]) && set3.contains(arr1[i])){
//                System.out.print(arr1[i] + " ");
//            }
//        }

        List<String>list1 = new ArrayList<>(Arrays.asList(arr1));
        List<String>list2 = Arrays.asList(arr2);
        List<String>list3 = Arrays.asList(arr3);

        list1.retainAll(list2);
        list1.retainAll(list3);
        System.out.print(list1);
    }
}
