package com.ca.mahima.array;

import java.util.Arrays;

public class AlternateArrangement {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int i = 0, j = n - 1;
		int[] newArr = new int[n];

		for (int k = 0; k < n; k++) {

			if (i < j) {
				newArr[k] = arr[j];
				newArr[++k] = arr[i];
				j--;
				i++;
			}
			if (i == j)
				newArr[++k] = arr[j];
		}
		for (int k = 0; k < n; k++) {
			System.out.println(newArr[k]);
		}
	}
	
}
