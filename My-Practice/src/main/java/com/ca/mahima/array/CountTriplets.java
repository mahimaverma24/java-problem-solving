package com.ca.mahima.array;

import java.util.Arrays;

public class CountTriplets {
    public static void main(String[] args) {
        int[] arr = {14, 3 ,6 ,8 ,11, 16};
        int n = arr.length;
		var sum = 0;
		var count = 0;
		Arrays.sort(arr);
		int l = 0;

		for (int i = l + 1; i < n; i++) {

			sum = arr[l] + arr[i];

			for (int j = i + 1; j < n; j++) {
				if (sum == arr[j]) {
					count++;
					break;
				}

			}
			if (i == n - 1) {
				l = l + 1;
				i = l;
			}

		}

        System.out.println(count);

    }
}
