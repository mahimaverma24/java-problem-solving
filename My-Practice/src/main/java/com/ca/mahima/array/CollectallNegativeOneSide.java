package com.ca.mahima.array;

public class CollectallNegativeOneSide {
	public static void main(String[] args) {
		int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		int n = arr.length ;

		int j = 0, temp;
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void swap(int[] arr, int l, int h) {
		int temp = 0;
		temp = arr[l];
		arr[l] = arr[h];
		arr[h] = temp;

	}
}
