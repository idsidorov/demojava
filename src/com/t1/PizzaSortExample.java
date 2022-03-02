package com.t1;

import java.util.*;

public class PizzaSortExample {
    public static void main(String[] args) {
        Pizza p1 = new CircularPizza(300, "Margarita", 30);
        Pizza p2 = new CircularPizza(700.50, "Four Cheeses", 50);
        Pizza p3 = new CircularPizza(600, "Pepperoni", 40);
        Pizza p4 = new RectangularPizza(400, "Salami", 20, 30);
        Pizza p5 = new RectangularPizza(250, "Chicken", 25, 35);

        ArrayList<Pizza> container = new ArrayList<>();
        container.add(p1);
        container.add(p2);
        container.add(p3);
        container.add(p4);
        container.add(p5);


        Collections.sort(container);

        for (Pizza p : container) {
            System.out.println(p.toString());
        }


    }
}
