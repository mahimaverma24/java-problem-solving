package com.ca.mahima.problem.solving;

public class HourglassProblem {

	public static void main(String[] args) {

		int[][] arr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };

		int maxSum = getHourGlassMaxSum(arr);
		System.out.println(maxSum);

	}

	private static int getHourGlassMaxSum(int[][] arr) {
		int total = Integer.MIN_VALUE;
		for (int i = 0; i < 4; i++) {
			//int sum = 0;
			for (int j = 0; j < 4; j++) {
				int sum = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2]);
				sum = sum + (arr[i + 1][j + 1]);
				sum = sum + (arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2]);
				if (sum > total) {
					total = sum;
				}
			}
		}
		return total;
	}

}
