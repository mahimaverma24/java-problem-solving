package com.ca.mahima.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Given N elements and a number K, find the longest subarray which has not more than K distinct elements.
 * (It can have less than K)
 *
 * For Example:

arr = [0, 1, 2, 1, 2, 3] -> length = 4; [1,2,1,2]

arr = [1, 2, 3, 4, 5] -> length = 2; [1,2]

arr = [1, 1, 1, 3, 3, 2, 2] -> length = 4; [3,3,2,2]
 * */
public class LongestSubArrayHavingDiffOne {
    public static void main(String[] args) {
        Integer[] ar = {0, 1, 1, 2, 2, 3};
        System.out.print(longestSubarray(Arrays.asList(ar)));
    }

    public static int longestSubarray(List<Integer> arr) {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        int i = 0;
        int j = 1;
        while (i < arr.size() - 1) {
            set.add(arr.get(i));
            while (j < arr.size() && Math.abs(arr.get(i) - arr.get(j)) < 2) {
                if (!set.contains(arr.get(j))) {
                    if (set.size() == 2) {
                        break;
                    } else {
                        set.add(arr.get(j));
                    }
                }
                ++j;
            }
            max = Math.max(max, j - i);
            j = ++i + 1;
            set.clear();
        }
        return max;
    }
}
