package com.ca.mahima.stack.queue;

import java.util.Stack;

/**
 * Input: N = 4, arr[] = [1 3 2 4] Output: 3 4 4 -1 Explanation: In the array,
 * the next larger element to 1 is 3 , 3 is 4 , 2 is 4 and for 4 ? since it
 * doesn't exist, it is -1.
 *
 */
public class NextGreaterNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4 };

		 Stack<Integer> s = new Stack<>();
	        int nextGreater[] = new int[arr.length];
	  
	        // iterate for rest of the elements
	        for (int i = arr.length - 1; i >= 0; i--)
	        {
			/*
			 * if stack is not empty, then pop an element from stack. If the popped element
			 * is smaller than next, then a) print the pair b) keep popping while elements
			 * are smaller and stack is not empty
			 */
	            if (!s.empty())
	            {
	                while (!s.empty() 
	                       && s.peek() <= arr[i])
	                {
	                    s.pop();
	                }
	            }
	            nextGreater[i] = s.empty() ? -1 : s.peek();
	            s.push(arr[i]);
	        }
	        for (int i = 0; i < arr.length; i++)
	            System.out.print(nextGreater[i] + " ");

	}
}
