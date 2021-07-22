package com.ca.mahima.array;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int sum = 468;
        int[] arr = {135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37,
                192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95,
                104, 12, 123, 134
        };

        // getSubarrayWithGivenSum(sum, arr);
        getSubarrayWithGivenSumOptimized(sum, arr);
    }

    private static void getSubarrayWithGivenSumOptimized(int sum, int[] arr) {
        int k = 0, curr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            curr_sum = curr_sum + arr[i];
            while (curr_sum > sum) {
                curr_sum = curr_sum - arr[k];
                k++;
            }
            if (curr_sum == sum) {
                System.out.println("From " + k + " to " + i);
                break;
            }
        }
    }

    private static void getSubarrayWithGivenSum(int sum, int[] arr) {
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                currSum = currSum + arr[j];
                if (currSum > sum)
                    break;
                if (currSum == sum) {
                    System.out.println("From " + i + " to " + j);
                    break;
                }
            }
        }
    }
}
