package com.ca.mahima.multithreading;

public class CalculateEvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}
