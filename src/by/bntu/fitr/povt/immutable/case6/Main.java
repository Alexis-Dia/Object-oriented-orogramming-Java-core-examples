package by.bntu.fitr.povt.immutable.case6;

import by.bntu.fitr.povt.immutable.case5.Student;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * @author Alexey Druzik on 11.12.2020
 */
public class Main {

    @Test
    public void testOfUnmodifiableSet(){
        Set<Student> mutableSet = new HashSet<>();
        Student student1 = new Student("Alex", 21);
        mutableSet.add(student1);

        Set<Student> unmodifiableSet = Collections.unmodifiableSet(mutableSet);
        Student student2 = new Student("Bob", 22);
        assertThrows(UnsupportedOperationException.class,
            () -> unmodifiableSet.add(student2));
    }

    @Test
    public void testOfUpdatingSetWithMutableValues(){
        Set<Student> setWithMutableValues = new HashSet<>();
        Student student = new Student("Alex", 21);
        setWithMutableValues.add(student);
        boolean studentIsExists = setWithMutableValues.contains(student);
        System.out.println(studentIsExists);
        student.setName("Bob");
        student.setAge(20);
        studentIsExists = setWithMutableValues.contains(student);
        System.out.println(studentIsExists);
        assertFalse(studentIsExists);
    }
}
