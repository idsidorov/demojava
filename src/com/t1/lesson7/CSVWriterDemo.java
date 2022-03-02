package com.t1.lesson7;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class CSVWriterDemo {
    public static void main(String[] args) {
        // create FileWriter object with file as parameter
        try {
            FileWriter outputfile = new FileWriter("csvwriter.csv");

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);

            // adding header to csv
            String[] header = {"Name", "Price", "Diameter"};
            writer.writeNext(header);

            // add data to csv
            String[] data1 = {"Four cheese", "400", "200"};
            writer.writeNext(data1);
            String[] data2 = {"Margarita", "350", "300"};
            writer.writeNext(data2);

            // closing writer connection
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
