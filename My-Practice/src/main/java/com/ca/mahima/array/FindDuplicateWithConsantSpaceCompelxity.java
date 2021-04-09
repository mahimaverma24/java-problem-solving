package com.ca.mahima.array;
// JAVA code to find

// duplicates in O(n) time

class FindDuplicateWithConsantSpaceCompelxity {

	public static void main(String[] args) {
		int[] arr = { 0, 1,1, 2, 3, 6, 3, 6, 1 };
		int i;
        System.out.println("The repeating elements are : ");
		 for (i = 0; i < arr.length; i++) {
	            int j = Math.abs(arr[i]);
	            if (arr[j] >= 0)
	                arr[j] = -arr[j];
	            else
	                System.out.print(j + " ");
	        }

	}
}
