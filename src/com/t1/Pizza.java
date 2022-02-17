package com.t1;

public abstract class Pizza implements Comparable<Pizza> {

    private double price;
    private String name;

    public Pizza(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public abstract double getSquare();

    public double pricePerUnit() {
        return price / getSquare();
    }

    @Override
    public int compareTo(Pizza o) {
        double diff = this.getSquare() - o.getSquare();
        if (diff > 0) {
            return 1;
        } else if (diff<0) {
            return -1;
        } else {
            return 0;
        }
    }
}
