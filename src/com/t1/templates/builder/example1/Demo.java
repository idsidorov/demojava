package com.t1.templates.builder.example1;

public class Demo {

    public static void main(String[] args) {
        Account account = Account.newBuilder().setToken("123-321").setUserId("admin").build();

        System.out.println(account.toString());
    }

}
