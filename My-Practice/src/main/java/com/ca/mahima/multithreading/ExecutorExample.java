package com.ca.mahima.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample {
    public static void main(String[] args) {
        Task task = new Task("My name is mahima");
        ExecutorService service = Executors.newFixedThreadPool(1);
        Future<String> result = service.submit(task);
        try {
            System.out.println(result.get());
        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();
        }
    }
}
