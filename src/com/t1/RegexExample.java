package com.t1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {



    public static void main(String[] args) {
        String phoneRegex = "\\+7[(]?(\\d{3})[)]?\\d{3}[-]?\\d{2}[-]?\\d{2}";

        String userInput = "+7(918)531-01-33";

        // Соответствует ли строка заданному регулярному выражению?
        System.out.println(userInput.matches(phoneRegex));


        // Найдём все вхождения регулярного выражения в текст
        String longText = "Она быстро написала +7(918)531-01-33 и +79515753852 на вырванном из блокнота листе";

        Pattern phonePattern = Pattern.compile(phoneRegex); // Это - factory method!
        Matcher phoneMatcher = phonePattern.matcher(longText);

        while (phoneMatcher.find()) {
            System.out.println(phoneMatcher.group(1));
        }

        //Заменим все вхождения регулярного выражения на строку-заменитель
        String obfuscated = longText.replaceAll(phoneRegex,"{phone}");

        System.out.println(obfuscated);

    }
}
