package by.bntu.fitr.povt.javaNew.jdk8.example1.case10TerminalStreams;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Alexey Druzik on 25.07.2020
 */
public class Test {
    public static void main(String[] args) {
        Collection<String> collection1 = Arrays.asList("s1", "s2", "s3");
        Collection<StringBuilder> collection2 = Arrays.asList(new StringBuilder("s1"), new StringBuilder("s2"), new StringBuilder("s3"));

        for (String element: collection1) {
            element.toUpperCase();
        }
        for (String element: collection1) {
            System.out.println("element = " + element);
        }

        for (StringBuilder element: collection2) {
            element.append("_");
        }
        for (StringBuilder element: collection2) {
            System.out.println("element = " + element);
        }

        String str1 = "I love Java";

        String str2 = str1;//обе переменные-ссылки указывают на одну строку.
        System.out.println(str2);

        String str3 = str1.replace("Java", "Python");//попробуем изменить состояние str1, заменив слово "Java" на “Python”
        System.out.println(str3);
    }
}
