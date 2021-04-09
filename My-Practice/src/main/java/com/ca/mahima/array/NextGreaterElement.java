package com.ca.mahima.array;

/**
 * @author mverma Input: N = 4, arr[] = [1 3 2 4] Output: 3 4 4 -1 Explanation:
 *         In the array, the next larger element to 1 is 3 , 3 is 4 , 2 is 4 and
 *         for 4 ? since it doesn't exist, it is -1.
 */
public class NextGreaterElement {
	public static void main(String[] args) {
		int[] arr = { 6, 8, 0, 1, 3 };
		int n = arr.length;
		int k = n - 1;
		int[] newarr = new int[n];
		newarr[k] = -1;
		for (int i = n - 1; i >= 1; i--) {

			if (i >= 0 && k >= 0 && arr[i] > arr[i - 1]) {
				newarr[--k] = arr[i];
			} else {
				newarr[--k] = -1;
			}
		}

		for (int i = 0; i < newarr.length; i++) {
			System.out.print(newarr[i] + " ");
		}
	}
}
 