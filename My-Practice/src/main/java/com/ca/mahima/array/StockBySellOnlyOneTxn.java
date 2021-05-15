package com.ca.mahima.array;
/*
*  price = 1,2,90,10,110,100
* find maximum profit gained by single txn -> 109
* */
public class StockBySellOnlyOneTxn {
    public static void main(String[] args) {

        int[] price  = {1,2,90,10,110,100};
        int n = price.length;
        int maxPrice = price[n-1];
        int maxDiff = Integer.MIN_VALUE;
        for(int i = n-2; i >= 0 ;i--){
            if(price[i] > maxPrice){
                maxPrice = price[i];
            }else {
                int diff = maxPrice - price[i];
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
        }
        System.out.print("Max profit is: " + maxDiff);
    }
}
