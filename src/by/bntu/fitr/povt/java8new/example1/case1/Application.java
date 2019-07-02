package by.bntu.fitr.povt.java8new.example1.case1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        List<String> collection1 = Arrays.asList("a1", "a2", "a3", "a1");
        collection1.stream().mapToInt((s) -> Integer.parseInt(s.substring(1))).toArray();

        List<String> collection2 =  Arrays.asList("1,2,0", "4,5");
        collection2.stream().map((p) -> p.split(",")).collect(Collectors.toList());
        collection2.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray();
        //collection2.stream().map((p) -> Arrays.asList(p.split(","))).collect(Collectors.toList());

        for (String ob: collection2) {
            //System.out.println(ob);
        }

        List<Integer> evens = Arrays.asList(2, 4, 6);
        List<Integer> odds = Arrays.asList(3, 5, 7);
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);
        List<Integer> all = Arrays.asList(2, 4, 6, 2, 3, 5, 7, 3, 5, 7, 11);
        List numbers = Stream.of(evens, odds, primes)
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println("flattend list: " + numbers);

    }
}
