package com.ca.mahima.designpattern;

public class BankAccBuilderReceiver {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount.Builder()
                .withOwner("Marge")
                .atBranch("Springfield")
                .openingBalance(100)
                .atRate(2.5)
                .build();
        System.out.println(ba.toString());
    }
}
