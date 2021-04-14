package com.ca.mahima.array;

import java.util.Arrays;
import java.util.Collections;

public class PutZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {2, 4, 0, 1, 8, 0, 0, 4, 7, 0, 1};
        int index = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index != n) {
            arr[index] = 0;
            index++;
        }

        for(int j =0 ;j<n;j++){
            System.out.print(arr[j] + " ");
        }
    }
}
