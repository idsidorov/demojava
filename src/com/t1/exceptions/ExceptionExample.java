package com.t1.exceptions;

public class ExceptionExample {
    public static void main(String args[]){
        try{
            int d = 1;
            int n = 20;
            int fraction = n/d;
            throw new Exception("My message");
        }
        catch (Exception e){
            System.out.println("In the catch block due to Exception = "+e);
        }
        finally{
            System.out.println("Inside the finally block");
        }
    }
}
