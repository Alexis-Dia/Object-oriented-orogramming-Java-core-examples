package by.bntu.fitr.povt.immutable.case3;

/**
 * @author Alexey Druzik on 08.08.2020
 * mutable/immutable - https://javarush.ru/groups/posts/1946-neizmennoe-v-java-final-konstantih-i-immutable
 */
public class Test {
    public static void main(String[] args) {

        String str1 = "I love Java";

        String str2 = str1;//обе переменные-ссылки указывают на одну строку.
        System.out.println(str2);

        str1 = "I love Python";//создался новый объект и поведение str1 никак не влияет на str2
        System.out.println(str2);//str2 продолжает указывать на строку "I love Java", хотя str1 уже указывает на другой объект
    }
}
