package com.t1;

public class SimpleDataTypes {
    public static void main(String[] args) {
        MutableInteger a = new MutableInteger(5);
        MutableInteger b = a;
        a.setValue(2);
        System.out.println("a = " + a.getValue());
        System.out.println("b = " + b.getValue());
    }
}
