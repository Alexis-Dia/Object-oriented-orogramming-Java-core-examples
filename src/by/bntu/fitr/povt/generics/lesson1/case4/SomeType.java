package by.bntu.fitr.povt.generics.lesson1.case4;

import java.util.Collection;
import java.util.List;

public class SomeType<T> {

    public <E> void test(Collection<E> collection) {
        for (E e : collection) {
            System.out.println("First method was called - " + e);
        }
    }

    public <T> void test(List<Integer> integerList) {
        for (Integer integer : integerList) {
            System.out.println("Second method was called - " + integer);
        }                                                  //ClassCastException - Because SomeType was made without declaring of generic,
                                                           // and compliler think that he has(he deleted all info about generics) -
                                                           // 1. public void test(Collection collection)
                                                           // 2. public void test(List integerList)
    }

}
