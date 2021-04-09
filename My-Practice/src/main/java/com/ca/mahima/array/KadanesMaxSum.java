package com.ca.mahima.array;

/**
 * @author mverma
 *
 */
public class KadanesMaxSum {
	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}

	private static int maxSubArraySum(int[] a) {
		int sum = 0, maxSum = 0;
		for (int i = 0; i < a.length; i++) {

			sum += a[i];
			if (sum > maxSum)
				maxSum = sum;

			if (sum < 0)
				sum = 0;
		}
		return maxSum;
	}

}
