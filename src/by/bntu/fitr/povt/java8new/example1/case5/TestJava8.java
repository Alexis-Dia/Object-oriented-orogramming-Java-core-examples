package by.bntu.fitr.povt.java8new.example1.case5;

import java.util.Optional;

public class TestJava8 {

    public static void main(String[] args) {



        Optional<String> firstName = Optional.of(null);
        System.out.println( "First Name is set? " + firstName.isPresent() );
        System.out.println( "First Name: " + firstName.orElseGet( () -> "[none]" ) );
        System.out.println( firstName.map((s) -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
        System.out.println();

/*        // Extra, streams apply to any data type.
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1); //[2, 4, 6, 8, 10]*/

    }
}