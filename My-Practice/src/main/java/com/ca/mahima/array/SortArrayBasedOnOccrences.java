package com.ca.mahima.array;

import java.util.*;
import java.util.stream.Collectors;

/*
 * [4,3,4,3,3,2,1,1,3,5,6,3,2,1]  Ans: [5,6,2,2,4,4,1,1,1,3,3,3,3,3]
 *
 * O(nlogn)
 * O(n)
 * */
public class SortArrayBasedOnOccrences {
    public static void main(String[] args) {
        int[] arr = {4, 3, 4, 3, 3, 2, 1, 1, 3, 5, 6, 3, 2, 1};
        int[] sortOnOcc = new int[arr.length];
        List<Integer> outputArray = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();


        for (int current : arr) {
            int count = map.getOrDefault(current, 0);
            map.put(current, count + 1);
            outputArray.add(current);
        }
        Comparator<Integer> comp = new Comparator<Integer>() {
            private final Map<Integer, Integer> freqMap = map;

            @Override
            public int compare(Integer o1, Integer o2) {
                int freqComp = map.get(o1).compareTo(map.get(o2));
                int valueComp = o1.compareTo(o2);
                if (freqComp == 0)
                    return valueComp;

                return freqComp;

            }
        };
        // Sort the map using Collections CLass
        Collections.sort(outputArray, comp);

        // Final Output
        for (Integer i : outputArray) {
            System.out.print(i + " ");
        }
    }

}
