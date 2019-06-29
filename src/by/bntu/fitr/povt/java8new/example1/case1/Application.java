package by.bntu.fitr.povt.java8new.example1.case1;

import java.util.ArrayList;
import java.util.List;

/**
 * https://habr.com/en/post/224593/
 * https://habr.com/en/company/luxoft/blog/270383/
 * https://habr.com/en/post/216431/
 */
public class Application {

    public static void main(String[] args){

        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        stringCollection
                .stream()
                .map(String::toUpperCase)
                .map((s) -> s + "_1")
                //.filter((s) -> s.length() == 5)
                .filter((s) -> s.contains("_1"))
                .forEach(System.out::println);
    }
}
