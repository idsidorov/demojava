package com.t1.exceptions;

class MyException extends Exception {
    int a;

    MyException(int a) {
        this.a = a;
    }

    public String toString(){
        return ("Exception Number =  " + a) ;
    }
}
