package com.ca.mahima.jvm.memory;

import java.io.*;

public class ExceptionHandling {
    private static final String filename = "input.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader rd = null;

        try {
            rd = new BufferedReader(new FileReader(new File(filename)));

            // Read all contents of the file.
            String inputLine = null;
            while ((inputLine = rd.readLine()) != null)
                System.out.println(inputLine);
        }catch (IOException exception) {
            System.err.println("An FileNotFoundException was caught!");
        }
    }
}
