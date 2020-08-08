package by.bntu.fitr.povt.javaNew.jdk8.case9ConveyorStreams.map;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Alexey Druzik on 08.08.2020
 * map функции могут вернуть объект другого типа (класса), то есть map может работать со стримом строк, а на выходе
 * дать Stream из значений Integer или получать класс людей People, а возвращать класс Office, где эти люди работают и т.п
 */
public class Test {
    public static void main(String[] args) {
        Collection<String> list = Arrays.asList(new String("a1"), new String("a2"), new String("a3"));
        List<String> peek = list.stream().map(String::toUpperCase).peek((e) -> System.out.print(e + ",")).
            collect(Collectors.toList());
        System.out.println("_________________");
        peek.stream().forEach(item -> System.out.println(item)); // напечатает forEach = A1,A2,A3,A1,
    }
}
