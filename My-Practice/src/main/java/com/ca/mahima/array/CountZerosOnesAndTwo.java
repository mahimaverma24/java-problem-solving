package com.ca.mahima.array;

/**
 * Given an array A[] consisting 0s, 1s and 2s. The task is to write a function
 * that sorts the given array. The functions should put all 0s first, then all
 * 1s and all 2s in last. Input: {0, 1, 2, 0, 1, 2} Output: {0, 0, 1, 1, 2, 2}
 *
 */
public class CountZerosOnesAndTwo {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		int arr_size = arr.length;
		sort012(arr, arr_size);
		System.out.println("Array after seggregation ");
		printArray(arr, arr_size);
	}

	private static void sort012(int[] arr, int arr_size) {

		int low = 0, mid = 0;
		int high = arr_size - 1;
		while (mid <= high) {
			switch (arr[mid]) {
			case 0: {
				swap(low, mid, arr);
				low++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;
			case 2: {
				swap(mid, high, arr);
				high--;
				break;
			}
			}
		}
	}

	private static void swap(int a, int b, int[] arr) {
		int temp = 0;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	static void printArray(int[] arr, int arr_size) {
		int i;
		for (i = 0; i < arr_size; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
