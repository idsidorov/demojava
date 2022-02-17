package com.t1.collections;
import java.util.*;
public class VectorDemo {
    public static void main(String args[]){
        Vector<String> v=new Vector<String>();
        for (int i = 0; i < 100; i++) {
            v.add("Ayush");
            System.out.println("Capacity = " + v.capacity());
        }

    }
}