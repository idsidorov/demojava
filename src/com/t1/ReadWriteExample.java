package com.t1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteExample {
    public static void main(String[] args) {
        List<Pizza> pizzas = new ArrayList<>();

        try
        {
                BufferedReader reader = new BufferedReader(new FileReader("pizza.csv"));
                String line;
                while ( (line = reader.readLine()) != null)
                {
                    String [] parts = line.split(";");
                    String type = parts[2];
                    if (type.equalsIgnoreCase("C")) {
                        pizzas.add(new CircularPizza(Double.parseDouble(parts[1]),
                                parts[0],
                                Double.parseDouble(parts[3])));
                    } else if (type.equalsIgnoreCase("R")) {
                        pizzas.add(new RectangularPizza(Double.parseDouble(parts[1]),
                                parts[0],
                                Double.parseDouble(parts[3]),
                                Double.parseDouble(parts[4])));
                    } else {
                        System.out.println("Unknown pizza");
                    }
                }

                reader.close();

                BufferedWriter writer = new BufferedWriter(new FileWriter("report.txt"));

                for (Pizza curPizza : pizzas) {
                    writer.write(curPizza.toString());
                    writer.write("\n");
                }
                writer.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
