package by.bntu.fitr.povt.immutable.case1;

/**
 * @author Alexey Druzik on 25.07.2020
 * mutable/immutable - https://javarush.ru/groups/posts/1946-neizmennoe-v-java-final-konstantih-i-immutable
 */
public class Test {
    public static void main(String[] args) {
        String str1 = "I love Java";

        String str2 = str1;//обе переменные-ссылки указывают на одну строку.
        System.out.println(str2);

        String str3 = str1.replace("Java", "Python");//попробуем изменить состояние str1, заменив слово "Java" на “Python”
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
