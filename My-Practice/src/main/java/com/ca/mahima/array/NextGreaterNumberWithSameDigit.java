package com.ca.mahima.array;

import java.util.Arrays;

/*Given a number n, find the smallest number that has same set of digits as n and is greater than n. If n is the greatest possible number with its set of digits, then print “not possible”.

Examples:
For simplicity of implementation, we have considered input number as a string.
*Input:  n = "218765"
Output: "251678"

Input:  n = "1234"
Output: "1243"

Input: n = "4321"
Output: "Not Possible"

Input: n = "534976"
Output: "536479"

Time complexity - O(nlogn)
*
* */
public class NextGreaterNumberWithSameDigit {
    public static void main(String[] args) {
        String n = "534976";
        char[] arr = n.toCharArray();
        char digit = '\0';
        int i = 0;
        for (i = arr.length - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                break;
            }
        }
        if (i == 0) {
            System.out.print("Not possible");
        } else {
            Arrays.sort(arr, i, arr.length);
            swap(arr, i, i - 1);

            System.out.print(String.valueOf(arr));
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
