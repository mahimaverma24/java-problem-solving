package com.ca.mahima.array;

import java.util.Arrays;
/*
---------------wrong solution please dont take reference ------------
**/

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 3, 4, 6, 2, 1};
        int length = removeDuplicates(arr);
        System.out.println(length);
    }

    public static int removeDuplicates(int[] nums) {

        int length = nums.length;

        if (length == 0)
            return 0;

        Arrays.sort(nums);
        int i;
        int targetIndex = 1;
        int prev = nums[0];

        for (i = 1; i < length; i++) {

            if (nums[i] != prev) {

                prev = nums[i];
                nums[targetIndex] = nums[i];
                targetIndex++;
            }

        }
        for (int j : nums) {
            System.out.print(nums[j] + " ");
        }
        return length;
    }
}
