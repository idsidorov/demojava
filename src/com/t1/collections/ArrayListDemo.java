package com.t1.collections;
import java.util.*;

public class ArrayListDemo {

    public static void main(String args[]){

        List<String> list = new ArrayList<>(); //Creating arraylist
        list.add("Ravi"); //Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
