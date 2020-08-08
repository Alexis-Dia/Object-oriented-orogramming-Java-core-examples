package by.bntu.fitr.povt.javaNew.jdk8.case10TerminalStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Alexey Druzik on 25.07.2020
 */
public class Test {
    public static void main(String[] args) {

        Predicate<Item> isQualified = item -> item.isQualified(item);
        List<Item> itemList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            itemList.add(new Item(i));
        }
        //itemList.stream()
            //.filter(isQualified);
            //.collect(Collectors.toList());
        itemList.removeIf(isQualified);

        for(Item item: itemList) {
            System.out.println(item);
        }

        List<String> collection = Arrays.asList("a1", "a2", "a3", "a1");
        List<String> collection2 = collection.stream().filter((s) -> s.contains("1")).collect(Collectors.toList());
        collection2.stream().forEach(element -> System.out.println(element));

        Customer john = new Customer("John P.", 15);
        Customer sarah = new Customer("Sarah M.", 200);
        Customer charles = new Customer("Charles B.", 150);
        Customer mary = new Customer("Mary T.", 1);
        List<Customer> customers = Arrays.asList(john, sarah, charles, mary);
        List<Customer> customersWithMoreThan100Points = customers
            .stream()
            .filter(c -> c.getPoints() > 100)
            .collect(Collectors.toList());
        customersWithMoreThan100Points.stream().forEach(element -> System.out.println(element));
    }
}
