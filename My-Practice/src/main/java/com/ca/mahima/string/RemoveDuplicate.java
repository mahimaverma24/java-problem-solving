package com.ca.mahima.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {

		String str = "mahima";
		Set<Character> setChar = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			setChar.add(str.charAt(i));
		}

		System.out.println(setChar);
		int n = 3;
		int[] arr = new int[3];
	       System.out.println(Arrays.stream(arr).min().getAsInt());

	    int min = Integer.MAX_VALUE;
	    for(int i =0 ;i < arr.length ; i++) {
	    	
	    	if(arr[i] < min)
	    		min = arr[i];
	    }
	    
	    System.out.println(min);
	}
}
