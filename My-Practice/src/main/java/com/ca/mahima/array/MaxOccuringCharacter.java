package com.ca.mahima.array;

import java.util.HashMap;
import java.util.Map;

/*
* Given a string str. The task is to find the maximum occurring character in the string str. If more than one character occurs the maximum number of time then print the lexicographically smaller character.

Example 1:

Input:
str = testsample
Output: e
Explanation: e is the character which
is having the highest frequency.
*
* */
public class MaxOccuringCharacter {
    public static void main(String[] args) {
        String str = "output";
        System.out.println(getMaxOccuringChar(str));
    }

    public static char getMaxOccuringChar(String line) {
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = line.toCharArray();
        int max_count = 0;
        char res = Character.MAX_HIGH_SURROGATE;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i]) >max_count) {
                max_count = map.get(arr[i]);
                res = arr[i];
            }
            if(map.get(arr[i]) == max_count){
                if(res > arr[i])
                    res = arr[i];

            }
        }
        return res;
    }
}
