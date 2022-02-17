package com.t1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DemoDate3 {

    public static void main(String[] args) {
        DateFormat sourceFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
        DateFormat targetFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.getDefault());

        try {
            Date date = sourceFormat.parse("Thu Jun 06 00:23:33 WEST 2013");

            String formatted = targetFormat.format(date);
            System.out.println(formatted);
            for (Locale locale : Locale.getAvailableLocales()) {
                System.out.println(locale.getDisplayName());
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
