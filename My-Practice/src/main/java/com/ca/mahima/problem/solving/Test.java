package com.ca.mahima.problem.solving;

public class Test {
	public static void main(String[] args) {
		int sum = 15;
		int F = 3;
		int[] res = new int[F];
		for (int i = 0; i < F; i++) {
			res[i] = sum / F--;
			sum -= res[i];
		}

		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}
