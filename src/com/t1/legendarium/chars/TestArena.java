package com.t1.legendarium.chars;

public class TestArena {
    public static void main(String[] args) {
        String x = "abXba";
        boolean flag = isPalindrome(x);
        System.out.println(flag);
    }

    private static boolean isPalindrome(String x) {
        boolean flag = true;
        for (int i = 0; i < x.length()/2; i++) {
            if (x.charAt(i) != x.charAt(x.length()-i-1)) {
                flag = false;
            }
        }
        return flag;
    }
}
