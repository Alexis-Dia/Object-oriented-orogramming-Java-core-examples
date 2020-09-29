package by.bntu.fitr.povt.javaNew.jdk8.case9ConveyorStreams.flatMap;

import by.bntu.fitr.povt.javaNew.jdk8.case9ConveyorStreams.flatMap.dto.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Alexey Druzik on 08.08.2020
 * flatMap в отличие от map возвращает не объект другого типа, а коллекцию элементов преобразованныую в стрим
 */
public class Test {
    public static void main(String[] args) {

        /*Example of FlatMap №1*/
        Collection<String> collection1  = Arrays.asList("1", "2");
        String a[] = new String[] { "A", "B", "C", "D" };
        Collection<String> collection2  = Arrays.asList("1,2,0", "4,5");
        Collection<String> collection3 = collection2.stream().flatMap(
/*            (p) -> Arrays.asList(p.split(",")
                //p -> Arrays.stream(p)
                //(p) -> {String a1[] = new String[] { "A", "B", "C", "D" }; return Arrays.asList(a1);}
                //(p) -> {return new ArrayList<String>(Collections.singleton("1"));}
            ).stream()*/
            p -> {String a1[] = new String[] { "A", "B", "C", "D" }; return Arrays.asList(a1).stream();}
        )
            .collect(Collectors.toList());
        System.out.println(collection3);

        /*Example of FlatMap №2*/
        Student obj1 = new Student();
        obj1.setName("mkyong");
        obj1.addBook("Java 8 in Action");
        obj1.addBook("Spring Boot in Action");
        obj1.addBook("Effective Java (2nd Edition)");
        Student obj2 = new Student();
        obj2.setName("zilap");
        obj2.addBook("Learning Python, 5th Edition");
        obj2.addBook("Effective Java (2nd Edition)");
        List<Student> collection4 = new ArrayList<>();
        collection4.add(obj1);
        collection4.add(obj2);
        List<String> collection5 =
            collection4.stream()
                .map(x -> x.getBook())      //Getting of Stream<Set<String>>
                .flatMap(x -> x.stream())   //Getting of Stream<String>
                //.flatMap(x -> Collections.list(Collections.enumeration(x.getBook())).stream())   //St
                //.distinct()
                .collect(Collectors.toList());

        collection5.forEach(x -> System.out.println(x));

    }
}
