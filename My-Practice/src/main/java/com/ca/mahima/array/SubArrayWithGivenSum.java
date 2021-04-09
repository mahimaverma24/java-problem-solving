package com.ca.mahima.array;

public class SubArrayWithGivenSum {
	public static void main(String[] args) {
		int sum = 12;
		int[] arr = { 1, 2, 3, 7, 5 };

		// getSubarrayWithGivenSum(sum, arr);
		getSubarrayWithGivenSumOptimized(sum, arr);
	}

	private static void getSubarrayWithGivenSumOptimized(int sum, int[] arr) {
		int k = 0, curr_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			curr_sum = curr_sum + arr[i];
			if (curr_sum > sum) {
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
