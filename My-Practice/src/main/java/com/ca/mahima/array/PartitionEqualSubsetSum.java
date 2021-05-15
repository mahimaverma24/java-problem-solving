package com.ca.mahima.array;

import java.util.Arrays;

public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6, 9};
        int n = nums.length - 1;
        int sum = 0;
        int k = nums[n];

        Arrays.sort(nums);
        for (int i = 0; i <= n; i++) {
            int j = 1;
            if (sum < k) {
                sum += nums[i] + nums[j];
                j++;
            } else if(sum > k){
                sum = sum - nums[i];
            }
        }

        if(sum ==k){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    }
}
