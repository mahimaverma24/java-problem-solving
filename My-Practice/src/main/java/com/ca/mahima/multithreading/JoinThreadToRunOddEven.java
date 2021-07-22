package com.ca.mahima.multithreading;

import java.util.concurrent.TimeUnit;

public class JoinThreadToRunOddEven {
    public static void main(String[] args) {
        CalculateEvenThread even = new CalculateEvenThread();
        CalculateOddThread odd = new CalculateOddThread();

        Thread t1 = new Thread(even);
        Thread t2 = new Thread(odd);
        t1.start();
        try {
            System.out.println("Current Thread: "
                    + Thread.currentThread().getName());
            t1.join();
            TimeUnit.SECONDS.sleep(1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        t2.start();
        try {
            System.out.println("Current Thread: "
                    + Thread.currentThread().getName());
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
