package com.t1.collections;
import java.util.*;
public class StackDemo{
    public static void main(String args[]){
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        System.out.println(stack.pop());

    }
}