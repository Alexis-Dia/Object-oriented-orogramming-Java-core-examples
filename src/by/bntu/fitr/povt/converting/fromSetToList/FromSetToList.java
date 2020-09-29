package by.bntu.fitr.povt.converting.fromSetToList;

import by.bntu.fitr.povt.javaNew.jdk8.case9ConveyorStreams.flatMap.dto.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Alexey Druzik on 29.09.2020
 */
public class FromSetToList {

    public static void main(String[] args) {
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

        List collection2 = Collections.list(Collections.enumeration(obj1.getBook()));
        System.out.println(collection2);
    }
}
