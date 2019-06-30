package by.bntu.fitr.povt.java8new.example1.case2;

import java.util.Optional;

public class Test {

    public static void main(String[] args) {

        /** Создание Optional объектов */

        //Пустой Optional объект
        Optional<Person> optionalPerson = Optional.empty();

        Person somePerson = new Person();

        //Optional объект с ненулевым значением
        Optional<Person> optionalNonNull = Optional.of(somePerson);

        //Optional объект с возможностью нулевого значения
        Optional<Person> optionalNullable = Optional.ofNullable(null);

        optionalNonNull.ifPresent(System.out::println);

        if (optionalNonNull.isPresent()) {
            System.out.println(optionalNonNull.get());
        } else {
            System.out.println("Person not found!");
        }
    }
}
