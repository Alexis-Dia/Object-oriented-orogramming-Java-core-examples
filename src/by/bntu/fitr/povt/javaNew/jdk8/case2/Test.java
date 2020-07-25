package by.bntu.fitr.povt.javaNew.jdk8.case2;

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

/*        Person person = new Person();
        if (person != null) {
            PersonAddress personAddress = person.getAddress();
            if (personAddress != null) {
                PersonAddressStreet street = personAddress.getStreet();
                if(street != null) {
                    streetName = street.getStreetName();
                } else {
                    streetName = "EMPTY";
                }
            }
        }

        String streetName = person.flatMap(Person::getAddress)
                .flatMap(PersonAddress::getStreet)
                .map(PersonAddressStreet::getStreetName)
                .orElse("EMPTY");*/
    }
}
