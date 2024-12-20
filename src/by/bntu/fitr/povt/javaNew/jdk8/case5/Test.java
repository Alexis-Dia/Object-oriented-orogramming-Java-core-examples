package by.bntu.fitr.povt.javaNew.jdk8.case5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> result = Stream.of(1, 2, 3, 4)
                .peek(x -> list.add(x))
                //.peek(x -> x * 2)
                .map(x -> x * 2)
                //.map(x -> list.add(x))
                .collect(Collectors.toList());
        Stream.of(1, 2, 3, 4)
                .forEach(x -> list.add(x));

        System.out.println(list);
        System.out.println(result);


        List<Man> people = new ArrayList<>();
        List<Man> peopleResult = List.of(new Man(18), new Man(37), new Man(129))
                .stream()
                .peek(x -> x.setAge(x.getAge() + 1))
                .collect(Collectors.toList());
        Stream.of(1, 2, 3, 4)
                .forEach(x -> list.add(x));

        System.out.println(people);
        System.out.println(peopleResult);
    }
}

class Man {
    public Man(int age) {
        this.age = age;
    }

    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Man{" +
                "age=" + age +
                '}';
    }
}