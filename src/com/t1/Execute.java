package com.t1;

public class Execute {
    public static void main(String[] args) {

        Comparable<Pizza> x = new CircularPizza(300, "Country", 28);


        Pizza[] pizzas = {new CircularPizza(300, "Margarita", 30),
                new CircularPizza(700.50, "Four Cheeses", 50),
                new CircularPizza(600, "Pepperoni", 40),
                new RectangularPizza(400, "Salami", 20, 30),
                new RectangularPizza(250, "Chicken", 25, 35)
        };

        Pizza bestPizza = pizzas[0];

        for (Pizza curPizza : pizzas) {
            if (bestPizza.pricePerUnit() > curPizza.pricePerUnit()) {
                bestPizza = curPizza;
            }
        }

        System.out.println("Today we order:");
        System.out.println(bestPizza);
    }
}
