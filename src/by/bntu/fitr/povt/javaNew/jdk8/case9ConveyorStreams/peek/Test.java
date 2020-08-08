package by.bntu.fitr.povt.javaNew.jdk8.case9ConveyorStreams.peek;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Alexey Druzik on 08.08.2020
 */
public class Test {
    public static void main(String[] args) {
        Collection<StringBuilder> list = Arrays.asList(new StringBuilder("a1"), new StringBuilder("a2"), new StringBuilder("a3"));
        List<StringBuilder> newList = list.stream().peek((p) -> p.append("_new")).collect(Collectors.toList()); // и list и newList содержат [a1_new, a2_new, a3_new]
        list.stream().forEach(item -> System.out.println(item)); // напечатает forEach = A1,A2,A3,A1,
        System.out.println("_______________");
        newList.stream().forEach(item -> System.out.println(item)); // напечатает forEach = A1,A2,A3,A1,
    }
}
