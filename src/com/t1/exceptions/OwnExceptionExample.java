package com.t1.exceptions;

public class OwnExceptionExample {

        public void foo() throws MyException {
            throw new MyException(2);
        }

        public void bar() throws Exception {
            foo();
        }

        public static void main(String args[]){
            try{
                OwnExceptionExample x = new OwnExceptionExample();
                x.bar();
                // throw is used to create a new exception and throw it.
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
