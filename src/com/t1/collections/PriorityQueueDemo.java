package com.t1.collections;
import java.util.*;

class Blob implements Comparable {
    public int x;

    public Blob() {
    }

    public Blob(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Blob{" +
                "x=" + x +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Blob b = (Blob)o;
        return -1 *(this.x - b.x);
    }
}

public class PriorityQueueDemo {

    public static void main(String args[]){
        PriorityQueue<Blob> queue=new PriorityQueue<Blob>();
        queue.add(new Blob(1));
        queue.add(new Blob(4));
        queue.add(new Blob(3));
        queue.add(new Blob(2));
        System.out.println("head:" + queue.element());
        System.out.println("head:" + queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<Blob> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
