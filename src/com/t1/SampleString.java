package com.t1;

import java.util.Locale;

public class SampleString
{
    public static void main(String[] args)
    {//Convert to LowerCase
        String sample = "Рок-Звезда";
        System.out.println("Convert to LowerCase: " + sample.toLowerCase(Locale.ENGLISH));
//Convert to UpperCase
        System.out.println("Convert to UpperCase: " + sample.toUpperCase(Locale.ENGLISH));
    }
}