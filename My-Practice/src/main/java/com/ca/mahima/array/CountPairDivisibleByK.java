package com.ca.mahima.array;

public class CountPairDivisibleByK {
	static int countKdivPairs(int[] A, int n, int K) {
		// Create a frequency array to count
		// occurrences of all remainders when
		// divided by K
		int[] freq = new int[K];

		// To store count of pairs.
		int ans = 0;

		// Traverse the array, compute the remainder
		// and add k-remainder value hash count to ans
		for (int i = 0; i < n; i++) {
			int rem = A[i] % K;

			// Count number of ( A[i], (K - rem)%K ) pairs
			ans += freq[(K - rem) % K];

			// Increment count of remainder in hash map
			freq[rem]++;
		}

		return ans;
	}

	// Driver code
	public static void main(String[] args) {
		int[] A = { 5, 9, 36, 74, 52, 31, 42 };
		int n = A.length;
		int K = 3;
		System.out.println(countKdivPairs(A, n, K));
	}
}
