package com.t1.lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static String fioRegex = "([А-ЯЁ][а-яё\\-]+)\\s+([А-ЯЁ][а-яё\\-]+)\\s+([А-ЯЁ][а-яё\\-]+)";

    public static boolean isFIO(String x) {

        return x.matches(fioRegex);
    }

    public static boolean isPassport(String x) {
        String passportRegex = "\\d{4}\\s*\\d{6}";
        return x.matches(passportRegex);
    }

    public static boolean isTime(String x) {
        String timeRegex = "(([0-1]\\d)|(2[0-3])):([0-5]\\d):([0-5]\\d(\\.\\d{4})?)";
        return x.matches(timeRegex);
    }

    public static void main(String[] args) {

        //Фамилия Имя Отчество
        String testFIO = " Сидоров Игорь Дмитрий-оглы ";
        testFIO = testFIO.strip();
        //System.out.println(isFIO(testFIO));

        //паспорт
        String example = "6008  253487";

        //System.out.println(isPassport(example));

        //Дата и время
        //System.out.println(isTime("04:55:55"));

        //Извлечение этих данных из HTML-таблицы
        String htmlCode = "<table>\n<th>\n<td>ФИО<td>\n</th>\n"+
                "<tr>\n<td>Сидоров Игорь Дмитриевич</td>\n</tr>\n"+
                "<tr>\n<td>Иванов Иван Иванович</td>\n</tr>\n"+
                "<tr>\n<td>Петров Пётр Петрович</td>\n</tr>\n"+
                "</table>";

        System.out.print(htmlCode);

        Pattern fioPattern = Pattern.compile("<td>"+fioRegex+"</td>"); // Это - factory method!
        Matcher fioMatcher = fioPattern.matcher(htmlCode);

        while (fioMatcher.find()) {
            System.out.println("Фамилия = " + fioMatcher.group(1));
            System.out.println("Имя = " + fioMatcher.group(2));
            System.out.println("Отчество = " + fioMatcher.group(3));
        }


    }

}
