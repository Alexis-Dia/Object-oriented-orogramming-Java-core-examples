package by.bntu.fitr.povt.javaNew.jdk10.case1LocalVariableTypeInterface;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Alexey Druzik on 12.11.2020
 */
public class Main {
    public static void main(String[] args) {

        var list = new ArrayList<String>(); //перед нами ArrayList<String>
        Collections.addAll(list, "Alex");
        var stream = list.stream(); // перед нами Stream<String>
        stream.forEach(System.out::println);
    }
}
