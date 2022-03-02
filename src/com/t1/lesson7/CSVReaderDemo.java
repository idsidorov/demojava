package com.t1.lesson7;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class CSVReaderDemo {
    public static void main(String[] args) {
        CSVReader reader = null;
        try {
            //parsing a CSV file into CSVReader class constructor
            reader = new CSVReader(new FileReader("pizza.csv"), ';');
            String[] nextLine;
            //reads one line at a time
            while ((nextLine = reader.readNext()) != null) {
                System.out.println(nextLine.length);
                for (String token : nextLine) {
                    System.out.print(token);
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
