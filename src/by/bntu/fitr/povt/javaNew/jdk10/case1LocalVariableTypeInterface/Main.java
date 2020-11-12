package by.bntu.fitr.povt.javaNew.jdk10.case1LocalVariableTypeInterface;

import java.util.ArrayList;

/**
 * @author Alexey Druzik on 12.11.2020
 */
public class Main {
    public static void main(String[] args) {

        var list = new ArrayList<String>(); //перед нами ArrayList<String>
        var stream = list.stream(); // перед нами Stream<String>
    }
}
