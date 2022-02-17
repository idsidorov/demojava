package com.t1;

public class CircularPizza extends Pizza {
    private double diameter;


    public double getDiameter() {
        return diameter;
    }

    public double getRadius() {
        return diameter/2;
    }

    @Override
    public double getSquare() {
        return getRadius() * getRadius() * Math.PI;
    }


    public CircularPizza(double price, String name, double diameter) {
        super(price, name);
        this.diameter = diameter;
    }


    @Override
    public String toString() {
        return "CircularPizza{" +
                "diameter=" + diameter +
                ", price=" + getPrice() +
                ", name='" + getName() + '\'' +
                '}';
    }

}
