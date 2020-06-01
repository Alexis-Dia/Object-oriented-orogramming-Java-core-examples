package by.bntu.fitr.povt.graphTheory.case1.dataStructures;

/**
 * @author Alexey Druzik on 01.06.2020
 */
public interface Queue<T> {
    void add(T item);   // добавить элемент в конец очереди
    T remove();         // извлечение элемента из начала очереди

    boolean isEmpty();
}
