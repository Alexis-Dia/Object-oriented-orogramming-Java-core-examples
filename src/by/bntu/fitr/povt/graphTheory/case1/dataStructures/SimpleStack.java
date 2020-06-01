package by.bntu.fitr.povt.graphTheory.case1.dataStructures;

import java.util.ArrayList;

/**
 * @author Alexey Druzik on 01.06.2020
 */
public class SimpleStack<T> implements Stack<T> {
    private ArrayList<T> list = new ArrayList<>();

    @Override
    public void push(T item) {
        list.add(0, item);
    }

    @Override
    public T pop() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean contains(T item) {
        return list.contains(item);
    }
}